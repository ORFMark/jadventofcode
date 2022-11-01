package problems.twentyone.dayfour;

import org.junit.jupiter.api.Test;
import problems.twentyone.dayfour.BingoBoard;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BingoBoardTest {

    private final List<String> testBoard = List.of(
            "14 21 17 24  4",
            "10 16 15  9 19",
            "18  8 23 26 20",
            "22 11 13  6  5",
            " 2  0 12  3  7");

    @Test
    public void buildBoardTest() {
        BingoBoard theBoard = new BingoBoard(testBoard);
        assertEquals(5, theBoard.getLength());
        assertEquals(5, theBoard.getHeight());
        assertFalse(theBoard.hasBingo());
    }

    @Test
    public void testBingo() {
        BingoBoard theBoard = new BingoBoard(testBoard);
        List<Integer> calledNums = List.of(7,4,9,5,11,17,23,2,0,14,21);
        for(int num : calledNums) {
            theBoard.callNumber(num);
            assertFalse(theBoard.hasBingo());
        }

        theBoard.callNumber(24);
        assertTrue(theBoard.hasBingo());
        assertEquals(4512, theBoard.calculateScore(24));
    }
}