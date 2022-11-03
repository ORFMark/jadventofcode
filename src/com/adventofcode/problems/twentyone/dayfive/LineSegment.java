package com.adventofcode.problems.twentyone.dayfive;

public class LineSegment {

    int startX;
    int startY;
    int endX;
    int endY;

    public LineSegment(int startX, int startY, int endX, int endY) {
        if(startX > endX) {
            this.startX = endX;
            this.endX = startX;
        } else {
            this.startX = startX;
            this.endX = endX;
        }
        if(startY > endY) {
            this.startY = endY;
            this.endY = startY;
        } else {
            this.startY = startY;
            this.endY = endY;
        }
    }

    public int getStartX() {
        return startX;
    }

    public void setStartX(int startX) {
        this.startX = startX;
    }

    public int getStartY() {
        return startY;
    }

    public void setStartY(int startY) {
        this.startY = startY;
    }

    public int getEndX() {
        return endX;
    }

    public void setEndX(int endX) {
        this.endX = endX;
    }

    public int getEndY() {
        return endY;
    }

    public void setEndY(int endY) {
        this.endY = endY;
    }

    @Override
    public String toString() {
        return String.format("(%d,%d) -> (%d,%d)", startX, startY, endX, endY);
    }



}
