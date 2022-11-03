package com.adventofcode.problems.twentyone.dayfive;

public class VentMap {
    Integer[][] ventMap;
    final int maxX;
    final int maxY;


    VentMap(int maxX, int maxY) {
        this.maxX = maxX;
        this.maxY = maxY;
        ventMap = new Integer[maxY+1][maxX+1];
        for(int x = 0; x <= maxX; x++) {
            for(int y = 0; y <= maxY; y++) {
                ventMap[y][x] = 0;
            }
        }
    }

    public void addLineSegment(int startX, int startY, int endX, int endY) {
        for(int x = startX; x <= endX; x++) {
            for (int y = startY; y <= endY; y++) {
                ventMap[y][x]++;
            }
        }
    }

    public void addLineSegment(LineSegment lineToAdd) {
        addLineSegment(lineToAdd.getStartX(), lineToAdd.getStartY(), lineToAdd.getEndX(), lineToAdd.getEndY());
    }

    public boolean hasVent(int x, int y) {
        return ventMap[y][x] > 0;
    }

    public void displayMap() {
        for(int x = 0; x <= maxX; x++) {
            for(int y = 0; y <= maxY; y++) {
                System.out.printf(" %d ", ventMap[y][x]);
            }
            System.out.println();
        }
    }

    public int numberOfPointsWithMultipleLines() {
        int numberOfPointsWithManyVents = 0;
        for(int x = 0; x <= maxX; x++) {
            for(int y = 0; y <= maxY; y++) {
                if (hasVent(x, y) && ventMap[y][x] > 1) {
                    numberOfPointsWithManyVents++;
                }
            }
        }
        return numberOfPointsWithManyVents;
    }

}
