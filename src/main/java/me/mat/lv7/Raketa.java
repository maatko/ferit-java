package me.mat.lv7;

public class Raketa implements Runnable {

    private final String ime;

    private final LansirnaRampa rampa;

    public Raketa(String ime, LansirnaRampa rampa) {
        this.ime = ime;
        this.rampa = rampa;
    }

    @Override
    public void run() {
        System.out.printf("Reketa %s ce se lansirati za:\n", ime);

        try {
            rampa.lansiraj();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.printf("Reketa %s poljece\n", ime);
    }

}
