package me.mat.lv6.zadatak2;

public class Zad2 {

    public static void main(String[] args) {
        Direktor direktor = new Direktor("0", "Mirko", "Maric");
        direktor.predstaviSe(direktor);
        direktor.radi();
        System.out.println("---");

        Tajnica tajnica = new Tajnica("1", "Tanja", "Tanjic");
        tajnica.predstaviSe(tajnica);
        tajnica.radi();
        System.out.println("---");

        Vozac vozac = new Vozac("2", "Marko", "Maric");
        vozac.predstaviSe(vozac);
        vozac.radi();
        System.out.println("---");
    }

}
