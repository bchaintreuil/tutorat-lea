package com.uca.tutorat.lea;

public class Main extends java.lang.Object {
    public static void main(String[] args) {
        Voiture voiture = new Voiture( 4, 4, "Bleue", false, false, true);

        System.out.println(voiture.toString());
        System.out.println(voiture.getNbrPorte());

    }
}
