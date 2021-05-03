package com.uca.tutorat.lea;

public class TranslatedPosition extends Position {
    Direction direction;
    public TranslatedPosition(int x, int y, Direction direction) {
        super(x + direction.getDeltaX(), y + direction.getDeltaY());
        this.direction = direction;
    }

    public TranslatedPosition(Position pos, Direction direction) {
        super(pos.getX() + direction.getDeltaX(), pos.getY() + direction.getDeltaY());
        this.direction = direction;
    }

    public Direction getDirection() {
        return this.direction;
    }
}