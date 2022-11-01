package problems.twentyone.dayfour;

import java.util.LinkedList;
import java.util.List;

public class BingoBoard {

    private Cell[][] board;
    private int length;
    private int height;

    public BingoBoard(List<String> boardAsStringList) {
        List<List<Integer>> boardAsIntSet = getIntegerListsOfBoard(boardAsStringList);
        buildBoardFromIntegerList(boardAsIntSet);
    }



    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public boolean hasBingo() {
        boolean hasBingo = false;
        for(int row = 0; row < height; row++) {
            hasBingo = true;
            for (int col = 0; col < length; col++) {
                hasBingo = hasBingo && board[row][col].isCalled();
            }
            if(hasBingo) {
                return true;
            }
        }
        for(int col = 0; col < length; col++) {
            hasBingo = true;
            for (int row = 0; row < length; row++) {
                hasBingo = hasBingo && board[row][col].isCalled();
            }
            if(hasBingo) {
                return hasBingo;
            }
        }
        return hasBingo;
    }

    public int calculateScore(int justCalledNumber) {
        int score = 0;
        for(int row = 0; row < height; row++) {
            for (int col = 0; col < length; col++) {
               Cell currentCell = board[row][col];
               if(!currentCell.isCalled()) {
                   score += currentCell.getValue();
               }
            }
        }
        return score * justCalledNumber;
    }

    public void callNumber(int numberToCall) {
        for(int row = 0; row < height; row++) {
            for (int col = 0; col < length; col++) {
                board[row][col].call(numberToCall);
            }
        }
    }

    private void buildBoardFromIntegerList(List<List<Integer>> boardAsIntSet) {
        length = boardAsIntSet.size();
        if(length > 0) {
            height = boardAsIntSet.get(0).size();
        } else {
            height = 0;
        }
        this.board = new Cell[height][length];
        for(int row = 0; row < height; row++) {
            for(int col = 0; col < length; col++) {
                this.board[row][col] = new Cell(boardAsIntSet.get(row).get(col));
            }
        }
    }

    private List<List<Integer>> getIntegerListsOfBoard(List<String> boardAsStringList) {
        List<List<Integer>> boardAsIntSet = new LinkedList<>();
        for(String row : boardAsStringList) {
            int rowNumber = boardAsIntSet.size();
            boardAsIntSet.add(new LinkedList<>());
            String[] splitStrings = row.split(" ");
            for (String value : splitStrings) {
                String cleanValue = value.strip();
                if(cleanValue.length() > 0) {
                    boardAsIntSet.get(rowNumber).add(Integer.parseInt(cleanValue));
                }
            }
        }
        return boardAsIntSet;
    }

    private static class Cell {

        private final int value;
        private boolean isCalled;
        public Cell(int value) {
            this.value = value;
        }

        public boolean isCalled() {
            return isCalled;
        }

        public void call(int calledValue) {
            isCalled = (value == calledValue) || isCalled;
        }

        public int getValue() {
            return value;
        }

    }
}
