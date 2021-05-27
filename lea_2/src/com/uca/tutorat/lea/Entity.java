package com.uca.tutorat.lea;

public interface Entity extends GameElement {
    Position getPosition();
    Direction getDirection();
    void move(Direction direction);
}
