package com.adventofcode.problems.twentytwo.day2;


enum Choice {
    ROCK,
    PAPER,
    SCISSORS;

    private String code;

}

public class RockPaperScissorsRound {
    private Choice playerChoice;
    private final Choice opponentChoice;
    public RockPaperScissorsRound(String roundString, int partNumber) {

        char oppCode = roundString.charAt(0);
        opponentChoice = opponentChoiceDeterminer(oppCode);

        if(partNumber == 1) {
            char playerCode = roundString.charAt(2);
            playerChoice = playerChoiceDeterminer(playerCode);
        } else if (partNumber == 2) {
            char roundResult = roundString.charAt(2);
            playerChoice = playerChoiceDeterminerFromRoundResult(roundResult);

        }
    }


    private Choice opponentChoiceDeterminer(char choiceCode) {
        return switch (choiceCode) {
            case 'A' -> Choice.ROCK;
            case 'B' -> Choice.PAPER;
            case 'C' -> Choice.SCISSORS;
            default -> throw new IllegalArgumentException(String.format("Invalid character %c present in round string", choiceCode));
        };
    }

    private Choice playerChoiceDeterminer(char choiceCode) {
        return switch (choiceCode) {
            case 'X' -> Choice.ROCK;
            case 'Y' -> Choice.PAPER;
            case 'Z' -> Choice.SCISSORS;
            default -> throw new IllegalArgumentException(String.format("Invalid character %c present in round string", choiceCode));
        };
    }

    private Choice playerChoiceDeterminerFromRoundResult(char resultCode) {
        return switch (resultCode) {
            case 'Z' -> switch (opponentChoice) {
                case ROCK -> Choice.PAPER;
                case SCISSORS -> Choice.ROCK;
                case PAPER -> Choice.SCISSORS;
            };
            case 'X' -> switch (opponentChoice) {
                case ROCK -> Choice.SCISSORS;
                case SCISSORS -> Choice.PAPER;
                case PAPER -> Choice.ROCK;
            };
            case 'Y' -> opponentChoice;
            default -> throw new IllegalArgumentException(String.format("Invalid character %c present in round string", resultCode));
        };
    }

    public int getPlayerScore() {
       int score = playerChoice.ordinal() + 1;
       if(didPlayerWin()) {
           score += 6;
       } else if (opponentChoice == playerChoice) {
           score += 3;
       }
       return score;
    }
    public int getOpponentScore() {
        int score = opponentChoice.ordinal() + 1;
        if(!didPlayerWin()) {
            score += 6;
        }
        if(!didPlayerWin() && playerChoice == opponentChoice) {
            score -= 3;
        }
        return score;
    }

    private boolean didPlayerWin() {
        if(opponentChoice == Choice.ROCK) {
            return playerChoice == Choice.PAPER;
        } else if (opponentChoice == Choice.PAPER) {
            return playerChoice == Choice.SCISSORS;
        } else if (opponentChoice == Choice.SCISSORS) {
            return playerChoice == Choice.ROCK;
        } else {
            return false;
        }
    }
}
