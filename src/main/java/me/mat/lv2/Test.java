package me.mat.lv2;

public class Test {

    public static void main(String[] args) {
        Zarulja zarulja = new Zarulja();

        zarulja.PritisniPrekidac();
        zarulja.PritisniPrekidac();
        zarulja.PritisniPrekidac();
        zarulja.PritisniPrekidac();

        zarulja.Provjeri();

        Zaposlenik zaposlenik = new Zaposlenik(10, 20, 5500.0f);
        System.out.println(zaposlenik);
        System.out.println("Placa: " + zaposlenik.izracunajPlacu());

        zaposlenik = new Zaposlenik(10, 40, 26500.0f);
        System.out.println(zaposlenik);
        System.out.println("Placa: " + Zaposlenik.izarcunajPlacu(zaposlenik));
    }

}
