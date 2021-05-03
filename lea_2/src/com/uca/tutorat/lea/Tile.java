package com.uca.tutorat.lea;

public interface Tile {
    // Indique si une tuile peut contenir un élément de jeu.
    boolean isAccessible();
    // Renvoie l'élément de jeu contenu dans la tuile ou null si elle n'en contient pas.
    GameElement getContent();
}
