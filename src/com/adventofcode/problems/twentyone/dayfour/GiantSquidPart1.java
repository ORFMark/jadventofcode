package com.adventofcode.problems.twentyone.dayfour;

import com.adventofcode.utilities.general.diagnostics.InsturmentedProblem;
import com.adventofcode.utilities.general.parsers.text.StringInputParser;

import java.util.LinkedList;
import java.util.List;

public class GiantSquidPart1 extends InsturmentedProblem {

    public String run(String input) {
        List<BingoBoard> boards = new LinkedList<>();
        List<Integer> numbersToCall = new LinkedList<>();
        List<String> lines = new StringInputParser().splitInputIntoElements(input);
        List<String> currentBoard = new LinkedList<>();
        for(int i = 0; i < lines.size(); i++) {
            if(i == 0) {
                String[] numbers = lines.get(0).split(",");
                for (String number : numbers) {
                    numbersToCall.add(Integer.parseInt(number));
                }
                continue;
            }
            String line = lines.get(i);
            if(line.isBlank() && currentBoard.size() != 0) {
                boards.add(new BingoBoard(currentBoard));
                currentBoard.clear();
            } else if(!line.isBlank()) {
                currentBoard.add(line);
            }
        }

        for (int calledNumber : numbersToCall) {
            for(BingoBoard bingoBoard : boards) {
                bingoBoard.callNumber(calledNumber);
                if(bingoBoard.hasBingo()) {
                    return Integer.toString(bingoBoard.calculateScore(calledNumber));
                }
            }
        }
        return "";
    }
}
