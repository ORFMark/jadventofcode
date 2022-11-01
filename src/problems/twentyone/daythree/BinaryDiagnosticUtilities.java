package problems.twentyone.daythree;

import utilities.InputParser;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

public class BinaryDiagnosticUtilities {
    public static List<BinaryPositions> parseInput(String input) {
        List<String> lines = InputParser.splitInputLinesIntoList(input);
        List<BinaryPositions> binPositions = new LinkedList<>();
        for (String line : lines) {
            binPositions.add(new BinaryPositions(line));
        }
        return binPositions;
    }

    public static int calculateEpsilon(final List<BinaryPositions> values) {
        Integer[] posValues = new Integer[values.get(0).getLength()];
        StringBuilder gamma = new StringBuilder();
        StringBuilder epsilon = new StringBuilder();
        Arrays.fill(posValues, 0);
        for (BinaryPositions num : values) {
            for (int i = 0; i < num.getLength(); i++) {
                posValues[i] += num.getValue(i);
            }
        }

        for (Integer posValue : posValues) {
            if (posValue < values.size() / 2) {
                epsilon.append("1");
            } else {
                epsilon.append("0");

            }
        }
        return Integer.parseInt(epsilon.toString(), 2);
    }

    public static int calculateGamma(final List<BinaryPositions> values) {
        Integer[] posValues = new Integer[values.get(0).getLength()];
        StringBuilder gamma = new StringBuilder();
        Arrays.fill(posValues, 0);
        for (BinaryPositions num : values) {
            for (int i = 0; i < num.getLength(); i++) {
                posValues[i] += num.getValue(i);
            }
        }

        for (Integer posValue : posValues) {
            if (posValue < values.size() / 2) {
                gamma.append("0");
            } else {
                gamma.append("1");
            }
        }
        return Integer.parseInt(gamma.toString(), 2);
    }

    public static int calculateO2Rating(final List<BinaryPositions> values) {
        List<BinaryPositions> o2Nums = new LinkedList<>(values);
        for(int position = 0; position < o2Nums.get(0).getLength(); position++) {
            if(o2Nums.size() == 1) {
                return o2Nums.get(0).toInteger();
            } else {
                int mostCommonBit = findMostCommonBitInPosition(o2Nums,position);
                Queue<BinaryPositions> valuesToRemove = new ConcurrentLinkedQueue<>();
                for (BinaryPositions binaryPositions : o2Nums) {
                    if(binaryPositions.getValue(position) != mostCommonBit) {
                        valuesToRemove.add(binaryPositions);
                    }
                }
                for (BinaryPositions removeable : valuesToRemove) {
                    o2Nums.remove(removeable);
                    if (o2Nums.size() == 1) {
                        return o2Nums.get(0).toInteger();
                    }
                }

            }

        }
        return -1;
    }

    private static int findMostCommonBitInPosition(final List<BinaryPositions> values, int position) {
        int sum = 0;
        for (BinaryPositions pos : values) {
            sum += pos.getValue(position);
        }

        if(sum * 2 < values.size()) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int calculateCO2Rating(final List<BinaryPositions> values) {
        List<BinaryPositions> o2Nums = new LinkedList<>(values);
        for(int position = 0; position < o2Nums.get(0).getLength(); position++) {
            if(o2Nums.size() == 1) {
                return o2Nums.get(0).toInteger();
            } else {
                int mostCommonBit = findMostCommonBitInPosition(o2Nums,position);
                Queue<BinaryPositions> valuesToRemove = new ConcurrentLinkedQueue<>();
                for (BinaryPositions binaryPositions : o2Nums) {
                    if(binaryPositions.getValue(position) == mostCommonBit) {
                        valuesToRemove.add(binaryPositions);
                    }
                }
                for (BinaryPositions removeable : valuesToRemove) {
                    o2Nums.remove(removeable);
                    if (o2Nums.size() == 1) {
                        return o2Nums.get(0).toInteger();
                    }
                }

            }

        }
        return -1;
    }
}
