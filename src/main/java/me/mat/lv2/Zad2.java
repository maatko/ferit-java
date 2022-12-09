package me.mat.lv2;

// https://moodle.srce.hr/2022-2023/pluginfile.php/7507805/mod_resource/content/1/lv2.pdf
public class Zad2 {

    public static void main(String[] args) {
        Zaposlenik zaposlenik = new Zaposlenik(20, 50, 2500.0f);
        System.out.println(zaposlenik);
        System.out.println("Placa: " + zaposlenik.izracunajPlacu());

        zaposlenik = new Zaposlenik(210, 30, 6500.0f);
        System.out.println(zaposlenik);
        System.out.println("Placa: " + Zaposlenik.izarcunajPlacu(zaposlenik));
    }

}
