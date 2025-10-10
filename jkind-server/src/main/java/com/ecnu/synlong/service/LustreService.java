package com.ecnu.synlong.service;

import com.ecnu.synlong.common.CheckResult;
import jkind.*;
import jkind.ExitCodes;
import jkind.JKindArgumentParser;
import jkind.JKindSettings;
import jkind.StdErr;
import jkind.analysis.LinearChecker;
import jkind.analysis.StaticAnalyzer;
import jkind.engines.Director;
import jkind.engines.SolverUtil;
import jkind.lustre.*;
import jkind.lustre.builders.ProgramBuilder;
import jkind.lustre.parsing.*;
import jkind.lustre.parsing.FlattenIds;
import jkind.lustre.parsing.StdErrErrorListener;
import jkind.lustre.parsing.ValidIdChecker;
import jkind.translation.InlineSimpleEquations;
import jkind.translation.Specification;
import jkind.translation.Translate;
import jkind.util.Util;
import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 抄的jkind代码中的jkind/src/jkind/JKind.java
 */
@Service
public class LustreService {
	
	private static final Logger log = LoggerFactory.getLogger(LustreService.class);

    public CheckResult check(String[] args) {
        try {
            JKindSettings settings = JKindArgumentParser.parse(args);
            Program program = parseLustre(settings.filename);
            program = setMainNode(program, settings.main);

            StaticAnalyzer staticAnalyzer = new StaticAnalyzer();
            staticAnalyzer.check(program, settings.solver, settings);
            if (!LinearChecker.isLinear(program)) {
                if (settings.pdrMax > 0) {
                    StdErr.warning("PDR not available for some properties due to non-linearities");
                }
            }

            ensureSolverAvailable(settings.solver);

            program = Translate.translate(program);
            Node main = program.getMainNode();
            Specification userSpec = new Specification(program, settings.slicing);
            Specification analysisSpec = getAnalysisSpec(userSpec, settings);

            Director director = new Director(settings, userSpec, analysisSpec);
            director.run();
            return CheckResult.success(director.getResult());
        } catch (Exception e) {
            throw new RuntimeException("Lustre验证失败: " + e.getMessage(), e);
        }
    }

    private Program setMainNode(Program program, String main) {
        if (main == null) {
            return program;
        }

        boolean hasMainNode = program.nodes.stream().anyMatch(n -> n.id.equals(main));
        if (!hasMainNode) {
            StdErr.fatal(ExitCodes.INVALID_OPTIONS, "Unable to find main node '" + main + "'");
        }

        return new ProgramBuilder(program).setMain(main).build();
    }

    private void ensureSolverAvailable(SolverOption solver) {
        try {
            SolverUtil.getBasicSolver(solver);
        } catch (JKindException e) {
            StdErr.fatal(ExitCodes.INVALID_OPTIONS, e.getMessage());
        }
    }

    private Specification getAnalysisSpec(Specification userSpec, JKindSettings settings) {
        if (settings.inlining) {
            Node inlined = InlineSimpleEquations.node(userSpec.node);
            Program program = new ProgramBuilder().addFunctions(userSpec.functions).addNode(inlined).build();
            return new Specification(program, settings.slicing);
        } else {
            return userSpec;
        }
    }

    public Program parseLustre(String input) throws Exception {
        CharStream stream = new ANTLRInputStream(input);
        LustreLexer lexer = new LustreLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LustreParser parser = new LustreParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new StdErrErrorListener());

        try {
            LustreParser.ProgramContext programContext = parser.program();

//            if (parser.getNumberOfSyntaxErrors() > 0) {
//                System.exit(ExitCodes.PARSE_ERROR);
//            }
            return flattenOrCheck(new LustreToAstVisitor().program(programContext));
        } catch (LustreParseException e) {
            StdErr.error(e.getLocation(), e.getMessage());
            throw e;
        } catch (Exception e) {
            // TODO 后面删掉
            log.error("1111错误：", e);
            Exception cause = new Exception(e.getMessage());
            for (ANTLRErrorListener listener : parser.getErrorListeners()) {
                if (listener instanceof StdErrErrorListener) {
                    String firstError = ((StdErrErrorListener) listener).getErrors().stream()
                            .findFirst()
                            .map(SyntaxError::getErrorMessage)
                            .orElse("发生未知错误");
                    cause = new Exception(firstError);
                }
            }
            throw cause;
        }
    }

    /**
     * 下面抄的jkind代码中的jkind/src/jkind/Main.java
     * We allow extended ids (with ~ [ ] .) only when the program is a single
     * node with simple types. This is useful for working with output from
     * JLustre2Kind.
     */
    private Program flattenOrCheck(Program program) {
        if (isSimple(program)) {
            return new FlattenIds().visit(program);
        } else {
            if (!ValidIdChecker.check(program)) {
                throw new RuntimeException("语法错误:" + ExitCodes.PARSE_ERROR);
            }
            return program;
        }
    }

    private boolean isSimple(Program program) {
        if (!program.types.isEmpty()) {
            return false;
        } else if (!program.constants.isEmpty()) {
            return false;
        } else if (program.nodes.size() != 1) {
            return false;
        }

        Node main = program.getMainNode();
        for (VarDecl vd : Util.getVarDecls(main)) {
            if (vd.type instanceof ArrayType || vd.type instanceof RecordType) {
                return false;
            }
        }
        return true;
    }
}
