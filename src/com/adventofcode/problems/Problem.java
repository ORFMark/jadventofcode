package com.adventofcode.problems;

import com.adventofcode.utilities.general.diagnostics.DiagnosticsConstants;
import com.adventofcode.utilities.general.diagnostics.DiagnosticStringGenerator;

public interface Problem {
    String run(String input);
    default String getIdentifer() {
        return DiagnosticStringGenerator.generateIDString(DiagnosticsConstants.AUTHOR, "", -1, -1, -1);
    }


}
