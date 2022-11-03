package com.adventofcode.problems.twentyone.daytwo;

public class Direction {
    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    private String direction;

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    private int distance;

    Direction(String direction, int distance) {
        this.direction = direction;
        this.distance = distance;
    }
}
