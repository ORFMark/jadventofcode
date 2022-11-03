package com.adventofcode;

import com.adventofcode.problems.Problem;
import com.adventofcode.problems.twentyone.dayone.SonarSweepPart1;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	  List<Problem> problemList = new LinkedList<>();
    List<String> inputList = new LinkedList<>();
    try {
        inputList.add(readInputFromFile("ProblemInput/2021/Day1SonarSweep/SonarSweep.txt"));
    } catch (Exception e) {
        System.out.println("Invalid File Path! Can't read input");
        return;
    }
    problemList.add(new SonarSweepPart1());
    int dayNumber = 0;
    for (Problem prob : problemList) {
        System.out.printf("Day %d Part %d: ", (dayNumber/2) +1, (dayNumber % 2) + 1);
        System.out.println(prob.run(inputList.get(0)));
        inputList.remove(0);
        dayNumber++;
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
}

