package com.uca.tutorat.lea;

public abstract class AbstractEntity extends AbstractGameElement implements Entity {
    private Position pos;
    private Direction dir;

    AbstractEntity(String name) {
        super(name);
        this.pos = new Position(0,0);
        this.dir =  Direction.DOWN;
    }

    @Override
    public Direction getDirection() {
        return this.dir;
    }

    @Override
    public Position getPosition() {
        return this.pos;
    }

    @Override
    public void move(Direction direction) {
        this.pos = new TranslatedPosition(this.pos, this.dir);
    }
}
