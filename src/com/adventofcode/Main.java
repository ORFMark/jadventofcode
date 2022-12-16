package com.adventofcode;

import com.adventofcode.problems.twentytwo.day1.CalorieCountingPart1;
import com.adventofcode.problems.twentytwo.day1.CalorieCountingPart2;
import com.adventofcode.problems.twentytwo.day2.RockPaperScissorsPart1;
import com.adventofcode.problems.twentytwo.day2.RockPaperScissorsPart2;
import com.adventofcode.problems.twentytwo.day3.RucksackReorganizationPart1;
import com.adventofcode.problems.twentytwo.day3.RucksackReorganizationPart2;
import com.adventofcode.problems.twentytwo.day4.CampCleanupPart1;
import com.adventofcode.problems.twentytwo.day4.CampCleanupPart2;
import com.adventofcode.problems.twentytwo.day5.SupplyStacksPart1;
import com.adventofcode.problems.twentytwo.day5.SupplyStacksPart2;
import com.adventofcode.problems.twentytwo.day6.SignalCleaningPart1;
import com.adventofcode.problems.twentytwo.day6.SignalCleaningPart2;
import com.adventofcode.problems.twentytwo.day8.TreeTopHousePart1;
import com.adventofcode.problems.twentytwo.day8.TreeTopHousePart2;
import com.adventofcode.utilities.general.diagnostics.DiagnosticsConstants;
import com.adventofcode.utilities.general.diagnostics.InsturmentedProblem;



import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	  List<ProblemPair> problemList = new LinkedList<>();
    try {
        problemList.add(new ProblemPair(new RockPaperScissorsPart1(), readInputFromFile("ProblemInput/2022/Day2RockPaperScissors/input")));
        problemList.add(new ProblemPair(new RockPaperScissorsPart2(), readInputFromFile("ProblemInput/2022/Day2RockPaperScissors/input")));
        problemList.add(new ProblemPair(new CalorieCountingPart1(), readInputFromFile("ProblemInput/2022/Day1CalorieCounting/Part1")));
        problemList.add(new ProblemPair(new CalorieCountingPart2(), readInputFromFile("ProblemInput/2022/Day1CalorieCounting/Part1")));
        problemList.add(new ProblemPair(new RucksackReorganizationPart1(), readInputFromFile("ProblemInput/2022/Day3Rucksack/input")));
        problemList.add(new ProblemPair(new RucksackReorganizationPart2(), readInputFromFile("ProblemInput/2022/Day3Rucksack/input")));
        problemList.add(new ProblemPair(new CampCleanupPart1(), readInputFromFile("ProblemInput/2022/Day4CampCleanup/input")));
        problemList.add(new ProblemPair(new CampCleanupPart2(), readInputFromFile("ProblemInput/2022/Day4CampCleanup/input")));
        problemList.add(new ProblemPair(new SupplyStacksPart1(), readInputFromFile("ProblemInput/2022/Day5SupplyStacks/Input")));
        problemList.add(new ProblemPair(new SupplyStacksPart2(), readInputFromFile("ProblemInput/2022/Day5SupplyStacks/Input")));
        problemList.add(new ProblemPair(new SignalCleaningPart1(), readInputFromFile("ProblemInput/2022/Day6SignalCleaning/input")));
        problemList.add(new ProblemPair(new SignalCleaningPart2(), readInputFromFile("ProblemInput/2022/Day6SignalCleaning/input")));
        problemList.add(new ProblemPair(new TreeTopHousePart1(), readInputFromFile("ProblemInput/2022/Day8TreeHouse/input")));
        problemList.add(new ProblemPair(new TreeTopHousePart2(), readInputFromFile("ProblemInput/2022/Day8TreeHouse/input")));
    } catch (Exception e) {
        System.out.println("Invalid File Path! Can't read input");
        return;
    }
    System.out.printf("Note: diagnostics are the average of %d measured iterations after %d warmups%n", DiagnosticsConstants.MEASURED_ITERATIONS, DiagnosticsConstants.WARMUP_ITERATIONS);
    for (ProblemPair probPair : problemList) {
        InsturmentedProblem prob = probPair.problem;
        String input = probPair.input;
        String result = prob.runWithPerciseInstrumentation(input,
                DiagnosticsConstants.WARMUP_ITERATIONS, DiagnosticsConstants.MEASURED_ITERATIONS);
        System.out.printf("%s%n\t result: %s%n\t running time: %.02f milliseconds%n\t memory used: %d bytes%n", prob.getIdentifer(),result,( prob.getRunTimeInNanoSeconds())/1000000.0, prob.getMemoryUsedInBytes());
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

    private record ProblemPair(InsturmentedProblem problem,
                               String input) {
    }
}

