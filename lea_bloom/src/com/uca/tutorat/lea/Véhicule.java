package com.uca.tutorat.lea;

public abstract class Véhicule {
    public boolean vol;
    public boolean flotte;
    public boolean roule;

    public Véhicule(boolean vol, boolean flotte, boolean roule) {
        super();

        this.vol = vol;
        this.flotte = flotte;
        this.roule = roule;
    }

    @Override
    public String toString() {
        return "Véhicule{" +
                "vol=" + vol +
                ", flotte=" + flotte +
                ", roule=" + roule +
                '}';
    }
}
