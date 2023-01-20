package me.mat.lv10;

public class Zad2 {

    public static void main(String[] args) {
        Ptica ptica = new Ptica();
        ptica.setIme("Padavica");

        Lastavica lastavica = new Lastavica();
        lastavica.setIme("Roko");

        System.out.println(ptica.getIme());
        ptica.glasajSe();

        System.out.println(lastavica.getIme());
        lastavica.glasajSe();
    }

}
