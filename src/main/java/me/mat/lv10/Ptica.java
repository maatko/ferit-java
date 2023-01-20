package me.mat.lv10;

public class Ptica implements Zivotinja {

    protected String ime;

    @Override
    public void setIme(String ime) {
        this.ime = ime;
    }

    @Override
    public String getIme() {
        return ime;
    }

    @Override
    public void glasajSe() {
        System.out.println("Pticaaaaaa");
    }

}
