package me.mat.lv2;

public class Zarulja {

    private boolean stanje;

    public Zarulja() {
        this.stanje = false;
    }

    public void PritisniPrekidac() {
        stanje = !stanje;
    }

    public void Provjeri() {
        System.out.println(stanje ? "Svijetli" : "Mrak je");
    }

}
