package com.adventofcode.problems.twentyone.dayone;


import com.adventofcode.utilities.general.diagnostics.InsturmentedProblem;

import java.util.LinkedList;
import java.util.List;

public class SonarSweepPart1 extends InsturmentedProblem {

    public String run(String input) {
        List<Integer> inputList = new LinkedList<>();
        String[] nums = input.split("\n");
        int increased = 0;
        for (String num : nums) {
            inputList.add(Integer.parseInt(num.strip()));
        }
        int lastDepth = -1;
        for(int depth : inputList) {
            if(lastDepth != -1) {
                if(lastDepth < depth) {
                    increased++;
                }
            }
            lastDepth = depth;
        }

        return Integer.toString(increased);
    }
}
