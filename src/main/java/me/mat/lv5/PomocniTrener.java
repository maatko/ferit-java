package me.mat.lv5;

public class PomocniTrener extends Trener {

    private String sef;

    public PomocniTrener(String ime, String prezime, long oib, String klub, float placa, String sef) {
        super(ime, prezime, oib, klub, placa);
        this.sef = sef;
    }

    @Override
    public void ispis() {
        super.ispis();

        System.out.println("Sef: " + sef);
    }

    public String getSef() {
        return sef;
    }

    public void setSef(String sef) {
        this.sef = sef;
    }

}
