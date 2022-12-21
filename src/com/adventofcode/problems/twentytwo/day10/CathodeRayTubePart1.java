package com.adventofcode.problems.twentytwo.day10;

import com.adventofcode.problems.twentytwo.day10.CathodeComputer.CathodeComputer;
import com.adventofcode.problems.twentytwo.day10.CathodeComputer.CathodeInstruction;
import com.adventofcode.problems.twentytwo.day10.CathodeComputer.CathodeNoOp;
import com.adventofcode.utilities.general.diagnostics.DiagnosticStringGenerator;
import com.adventofcode.utilities.general.diagnostics.DiagnosticsConstants;
import com.adventofcode.utilities.general.diagnostics.InsturmentedProblem;

import java.util.List;

public class CathodeRayTubePart1 extends InsturmentedProblem {

    private static final String PROBLEM_NAME = "Cathode Ray Tube";
    private static final int YEAR = 2022;
    private static final int DAY = 10;
    private static final int PART = 1;
    @Override
    public String run(String input) {
        List<CathodeInstruction> program = new CathodeProgramParser().splitInputIntoElements(input, "\n");
        CathodeComputer computer = new CathodeComputer(program);
        int result = (computer.getRegisterValueAtCycleNumber(20)*20);
        computer.resetComputer();
        result += (computer.getRegisterValueAtCycleNumber(60)*60);
        computer.resetComputer();
        result += (computer.getRegisterValueAtCycleNumber(100)*100);
        computer.resetComputer();
        result += (computer.getRegisterValueAtCycleNumber(140)*140);
        computer.resetComputer();
        result += (computer.getRegisterValueAtCycleNumber(180)*180);
        computer.resetComputer();
        result += (computer.getRegisterValueAtCycleNumber(220)*220);
        computer.resetComputer();
        return Integer.toString(result);
    }

    @Override
    public String getIdentifer() {
        return DiagnosticStringGenerator.generateIDString(DiagnosticsConstants.AUTHOR, PROBLEM_NAME, YEAR, DAY, PART);
    }
}
