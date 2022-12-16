package me.mat.lv6.zadatak3.drugi;

public class Zad3 {

    public static void main(String[] args) {
        Direktor direktor = new Direktor("0", "Mirko", "Maric");
        direktor.predstaviSe();
        direktor.radi();
        System.out.println("---");

        Tajnica tajnica = new Tajnica("1", "Tanja", "Tanjic");
        tajnica.predstaviSe();
        tajnica.radi();
        System.out.println("---");

        Vozac vozac = new Vozac("2", "Marko", "Maric");
        vozac.predstaviSe();
        vozac.radi();
        System.out.println("---");
    }

}
