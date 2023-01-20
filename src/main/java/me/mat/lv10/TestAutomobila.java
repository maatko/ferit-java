package me.mat.lv10;

public class TestAutomobila {

    private String naziv;

    private float potrosnjaGoriva;

    private float predenPut;

    public TestAutomobila(String naziv, float potrosnjaGoriva, float predenPut) {
        this.naziv = naziv;
        this.potrosnjaGoriva = potrosnjaGoriva;
        this.predenPut = predenPut;
    }

    public String getNaziv() {
        return naziv;
    }

    public float getPotrosnjaGoriva() {
        return potrosnjaGoriva;
    }

    public float getPredenPut() {
        return predenPut;
    }
}
