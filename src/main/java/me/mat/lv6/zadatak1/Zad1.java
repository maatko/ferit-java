package me.mat.lv6.zadatak1;

public class Zad1 {

    public static void main(String[] args) {
        final Zivotinja zivotinja = new Zivotinja("Zivotinja");
        zivotinja.kreciSe();

        final Konj konj = new Konj();
        konj.kreciSe();

        final Riba riba = new Riba();
        riba.kreciSe();

        final Ptica ptica = new Ptica();
        ptica.kreciSe();

        System.out.println("### BONUS ###");

        final Zivotinja[] zivotinje = new Zivotinja[]{
                zivotinja,
                konj,
                riba,
                ptica
        };

        for (Zivotinja ziv : zivotinje)
            ziv.kreciSe();
    }

}
