package me.mat.lv5;

public class Nogometas extends Osoba {

    private String klub;

    private int brojKopacki;

    public Nogometas(String ime, String prezime, long oib, String klub, int brojKopacki) {
        super(ime, prezime, oib);
        this.klub = klub;
        this.brojKopacki = brojKopacki;
    }

    @Override
    public void ispis() {
        super.ispis();

        System.out.println("Klub: " + klub);
        System.out.println("Broj kopacki: " + brojKopacki);
    }

    public String getKlub() {
        return klub;
    }

    public void setKlub(String klub) {
        this.klub = klub;
    }

    public int getBrojKopacki() {
        return brojKopacki;
    }

    public void setBrojKopacki(int brojKopacki) {
        this.brojKopacki = brojKopacki;
    }

}
