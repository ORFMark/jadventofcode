package problems.twentyone.daythree;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class BinaryPositions {
    private final List<Integer> positionValues;

    BinaryPositions(String inputBin) {
        positionValues = new LinkedList<>();
        for (char i : inputBin.toCharArray()) {
            if(i != '0' && i != '1') {
                throw new RuntimeException("Tried to parse an Invalid String to Binary!");
            }
            positionValues.add(Integer.parseInt(Character.toString(i)));
        }

    }

    public int getValue(int pos) {
        return positionValues.get(pos);
    }

    public int getLength() {
        return positionValues.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BinaryPositions that)) return false;
        return positionValues.equals(that.positionValues);
    }

    @Override
    public int hashCode() {
        return Objects.hash(positionValues);
    }

    public int toInteger() {
        int radix = (int) Math.pow(2, positionValues.size() - 1);
        int sum = 0;
        for (Integer bit : positionValues) {
            sum += bit * radix;
            radix /= 2;
        }
        return sum;
    }
}
