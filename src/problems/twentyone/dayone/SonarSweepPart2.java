package problems.twentyone.dayone;

import problems.Problem;

import java.util.LinkedList;
import java.util.List;

public class SonarSweepPart2 implements Problem {


    public String run(String input) {
        List<Integer> inputList = new LinkedList<>();
        String[] nums = input.split("\n");
        int increased = 0;
        for (String num : nums) {
            inputList.add(Integer.parseInt(num.strip()));
        }
        int lastDepth = -1;
        for(int i = 2; i < inputList.size()-1; i++) {
            int firstWindow = inputList.get(i-2) + inputList.get(i-1) + inputList.get(i);
            int secondWindow = inputList.get(i-1) + inputList.get(i) + inputList.get(i+1);
            if (secondWindow > firstWindow) {
                increased++;
            }
        }

        return Integer.toString(increased);
    }
}
