package com.ecnu.synlong.parser.convert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Conversion result used by tests/thesis evidence without changing HTTP contracts.
 */
public final class HighOrderConversionResult {
    private final String lustre;
    private final List<HighOrderSourceMapEntry> sourceMapEntries;

    public HighOrderConversionResult(String lustre, List<HighOrderSourceMapEntry> sourceMapEntries) {
        this.lustre = lustre;
        this.sourceMapEntries = Collections.unmodifiableList(new ArrayList<HighOrderSourceMapEntry>(sourceMapEntries));
    }

    public String getLustre() {
        return lustre;
    }

    public List<HighOrderSourceMapEntry> getSourceMapEntries() {
        return sourceMapEntries;
    }
}
