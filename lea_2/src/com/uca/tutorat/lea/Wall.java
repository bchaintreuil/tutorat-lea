package com.uca.tutorat.lea;

public class Wall implements Tile {
    @Override
    public boolean isAccessible() {
        return false;
    }

    @Override
    public GameElement getContent() {
        return null;
    }
}
