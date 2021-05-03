package com.uca.tutorat.lea;

public class Labyrinth {
    private final Tile[][] tiles;

    public Labyrinth(int width, int height) {
        this.tiles = new Tile[width][height];
    }

    public int getWidth() {
        return tiles.length;
    }

    public int getHeight() {
        return (getWidth() == 0) ? 0 : tiles[0].length;
    }

    public Tile getTile(int x, int y) {
        return tiles[x][y];
    }

    public Tile getTile(Position position) {
        return getTile(position.getX(), position.getY());
    }

    public void setTile(int x, int y, Tile tile) {
        tiles[x][y] = tile;
    }

    public void setTile(Position position, Tile tile) {
        setTile(position.getX(), position.getY(), tile);
    }

    public String getShape() {
        String string = "";
        for(int i = 0; i < tiles.length; i ++) {
            for(int j = 0; j < tiles[0].length; j++) {
                if(this.tiles[i][j].isAccessible()) {
                    string = string.concat(" ");
                } else {
                    string = string.concat("*");
                }
            }
            string = string.concat("\n");
        }
        return string;
    }
}