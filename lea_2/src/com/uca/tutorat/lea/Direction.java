package com.uca.tutorat.lea;

public enum Direction {
    UP, LEFT, DOWN, RIGHT;

    public int getDeltaX() {
        switch(this) {
            case UP:
                return 0;
            case DOWN:
                return 0;
            case LEFT:
                return -1;
            case RIGHT:
                ;
        }
        return 1;
    }

    public int getDeltaY() {
        switch(this) {
            case UP:
                return -1;
            case DOWN:
                return 1;
            case LEFT:
                return 0;
            case RIGHT:
                ;
        }
        return 0;
    }

    public Direction reversed() {
        switch(this) {
            case UP:
                return DOWN;
            case DOWN:
                return UP;
            case LEFT:
                return RIGHT;
            case RIGHT:
                ;
        }
        return LEFT;
    }

    /*
    public, protected, private, O --> Visibilité/Accessibilité de la variable/champs/fields ou de la méthode/fonction.
    static --> Défini si le champs ou la méthode est liéé à une instance de la classe/objet en particulier

        => Si static : Le champs / méthode n'est pas lié à une instance de la classe, à la classe entière
    final --> Après initialisation, est constante --> CHAMPS/FIELDS
     */
}
