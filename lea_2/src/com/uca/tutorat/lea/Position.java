package com.uca.tutorat.lea;

public class Position {
    private final int x;
    private final int y;


    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public double distanceTo(int x, int y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }

    public TranslatedPosition translated(Direction direction) {
        return new TranslatedPosition(this, direction);
    }

    public TranslatedPosition translated(Direction direction, int n) {
        TranslatedPosition newPos = new TranslatedPosition(this, direction);
        for(int i = 0; i < n - 1; i++) {
            newPos = newPos.translated(direction);
        }
        return newPos;
    }
}
