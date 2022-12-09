package me.mat.lv2;

public class Zaposlenik {

    private int staz;

    private int starost;

    private float placa;

    public Zaposlenik(int staz, int starost, float placa) {
        this.staz = staz;
        this.starost = starost;
        this.placa = placa;
    }

    public float izracunajPlacu() {
        return (staz * 12.0f) * placa;
    }

    public int getStaz() {
        return staz;
    }

    public void setStaz(int staz) {
        this.staz = staz;
    }

    public int getStarost() {
        return starost;
    }

    public void setStarost(int starost) {
        this.starost = starost;
    }

    public float getPlaca() {
        return placa;
    }

    public void setPlaca(float placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Zaposlenik{" +
                "staz=" + staz +
                ", starost=" + starost +
                ", placa=" + placa +
                '}';
    }

    public static float izarcunajPlacu(Zaposlenik zaposlenik) {
        return (zaposlenik.staz * 12.0f) * zaposlenik.placa;
    }

}
