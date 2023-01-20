package me.mat.lv10;

import java.util.concurrent.ThreadLocalRandom;

public class Zad3 {

    public static void main(String[] args) {
        final Zivotinja[] zivotinjas = new Zivotinja[]{
                new Lastavica(),
                new Ptica(),
                new Ptica(),
                new Lastavica(),
                new Lastavica()
        };

        for (Zivotinja zivotinja : zivotinjas) {
            zivotinja.setIme(zivotinja.getClass().getSimpleName() + "#" + Math.abs(ThreadLocalRandom.current().nextInt()));
            System.out.println(zivotinja.getIme());
            zivotinja.glasajSe();
        }
    }

}
