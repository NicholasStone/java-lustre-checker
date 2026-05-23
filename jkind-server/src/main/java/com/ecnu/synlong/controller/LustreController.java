package com.ecnu.synlong.controller;

import com.ecnu.synlong.common.CheckResult;
import com.ecnu.synlong.constant.ConvertConstant;
import com.ecnu.synlong.request.LustreFileParameter;
import com.ecnu.synlong.common.BaseResponse;
import com.ecnu.synlong.common.CheckStatus;
import com.ecnu.synlong.service.LustreService;
import com.ecnu.synlong.parser.convert.SynlongConverter;
import com.ecnu.synlong.parser.convert.AutomatonConverter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * /lustre 的两个入口是并行链路：/check 进入 Synlong->Lustre->JKind 验证，
 * /convert 只生成自动机 JSON，不能代表 JKind 验证语义。
 */
@Slf4j
@RestController
@RequestMapping("/lustre")
public class LustreController {

    @Autowired
    private LustreService lustreService;

    /**
     * 验证入口：请求文本通常先按 Synlong/Scade-like 语法转成 JKind 可解析的 Lustre。
     *
     * @param lustreFileParameter 包含 Synlong 或 Lustre-like 模型的请求参数
     * @return 验证结果
     */
    @PostMapping(value = "/check")
    public BaseResponse<CheckResult> checkLustre(@RequestBody LustreFileParameter lustreFileParameter) {

        // 请求体中的文本是验证链路的唯一输入，后续转换不得改变业务之外的副作用。
        String program = lustreFileParameter.getFile();

        // 现有测试绕过标记：包含 aiyowei 时跳过 Synlong 转换，直接交给 JKind Lustre 解析。
        if (!program.contains("aiyowei")) {
            program = SynlongConverter.convert(program);
        }

        // JKindArgumentParser 在服务层会把这个字符串当作单个输入模型处理。
        String[] args = new String[]{program};
        CheckResult result = lustreService.check(args);

        if (result.getStatus() != CheckStatus.SUCCESS) {
            return BaseResponse.error(result.getResult());
        }

        return BaseResponse.success(result);
    }

    /**
     * 自动机 JSON 入口：复用 Synlong 语法解析状态机，只服务可视化/模型交换。
     *
     * @param lustreFileParameter 包含状态机模型的请求参数
     * @return 转化结果
     */
    @PostMapping(value = "/convert")
    public BaseResponse<CheckResult> convertLustreToAutomaton(@RequestBody LustreFileParameter lustreFileParameter) {

        // 这里不调用 JKind，也不说明性质是否满足，只构造自动机模型 JSON。
        String program = lustreFileParameter.getFile();

        String automatonJson = AutomatonConverter.convertToAutomaton(program);

        CheckResult result = CheckResult.success(automatonJson);
        return BaseResponse.success(result);
    }
}
