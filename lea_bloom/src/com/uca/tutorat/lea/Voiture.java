package com.uca.tutorat.lea;

public class Voiture extends Véhicule {
    private int nbrPorte;
    int nbrCV;
    String couleurCarrosserie;

    public Voiture(int nbrPorte, int bar, String test, boolean vol, boolean flotte, boolean roule) {
        super(vol, flotte, roule);

        this.nbrPorte = nbrPorte;
        this.nbrCV = bar;
        this.couleurCarrosserie = test;
    }

    public int getNbrPorte() {
        this.Test();
        return nbrPorte;

    }

    public void setNbrPorte(int value){
        this.nbrPorte = value;
    }

    private void Test() {
        System.out.println(42);
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Voiture{" +
                "nbrPorte=" + nbrPorte +
                ", nbrCV=" + nbrCV +
                ", couleurCarrosserie='" + couleurCarrosserie + '\'' +
                '}';
    }
}
