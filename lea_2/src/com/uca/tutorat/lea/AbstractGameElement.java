package com.uca.tutorat.lea;

public abstract class AbstractGameElement implements GameElement {
    private String name;

    AbstractGameElement(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
