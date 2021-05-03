package com.uca.tutorat.lea;

public class Space implements Tile {
    private GameElement element;

    public Space(GameElement element) {
        this.element = element;
    }
    public Space() {
        this.element = null;
    }

    @Override
    public boolean isAccessible() {
        return true;
    }

    @Override
    public GameElement getContent() {
        return this.element;
    }
}
