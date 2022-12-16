package me.mat.lv6.zadatak2;

public class Direktor extends Zaposlenik {

    public Direktor(String id, String ime, String prezime) {
        super(id, ime, prezime);
    }

    @Override
    public void radi() {
        System.out.println("Odlucujem");
    }

    @Override
    public void predstaviSe(Zaposlenik zaposlenik) {
        super.predstaviSe(zaposlenik);

        System.out.println(getClass().getSimpleName());
    }

}
