package me.mat.lv5;

public class Zad1 {

    public static void main(String[] args) {
        Osoba osoba = new Osoba("Marko", "Maric", 123876123);
        osoba.ispis();
        System.out.println("-----");

        Nogometas nogometas = new Nogometas("Random", "Radic", 9812738, "Hajduk", 42);
        nogometas.ispis();
        System.out.println("-----");

        Trener trener = new Trener("Mirko", "Miric", 2563132, "Dinamo", 5500);
        trener.ispis();
        System.out.println("-----");

        PomocniTrener pomocniTrener = new PomocniTrener("Pomicni", "Mata", 123978912, "Dinamo", 12123, "Mirko");
        pomocniTrener.ispis();
    }

}
