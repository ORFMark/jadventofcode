package com.adventofcode;

import com.adventofcode.problems.twentytwo.day1.CalorieCountingPart1;
import com.adventofcode.problems.twentytwo.day1.CalorieCountingPart2;
import com.adventofcode.utilities.general.diagnostics.InsturmentedProblem;



import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	  List<ProblemPair> problemList = new LinkedList<>();
    try {
        problemList.add(new ProblemPair(new CalorieCountingPart1(), readInputFromFile("ProblemInput/2022/Day1CalorieCounting/Part1")));
        problemList.add(new ProblemPair(new CalorieCountingPart2(), readInputFromFile("ProblemInput/2022/Day1CalorieCounting/Part1")));
    } catch (Exception e) {
        System.out.println("Invalid File Path! Can't read input");
        return;
    }
    for (ProblemPair probPair : problemList) {
        InsturmentedProblem prob = probPair.problem;
        String input = probPair.input;
        System.out.printf("%s\n\t result: %s\n\t running time: %.02f milliseconds\n\t memory used: %d bytes\n", prob.getIdentifer(), prob.runWithInstrumentation(input), ((double) prob.getRunTimeInNanoSeconds())/100000.0, prob.getMemoryUsedInBytes());
    }

    }

    public static String readInputFromFile(String filePath) throws IOException {
        FileInputStream in = new FileInputStream(filePath);
        String input = null;
        try {
            input = new String(in.readAllBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            in.close();
        }

        return input;
    }

    private static class ProblemPair {
        public final InsturmentedProblem problem;
        public final String input;

        ProblemPair(InsturmentedProblem problem, String input) {
            this.problem = problem;
            this.input = input;
        }
    }
}

