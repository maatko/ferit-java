package me.mat.lv7;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        final LansirnaRampa rampa = new LansirnaRampa();

        Thread[] threads = new Thread[]{
                new Thread(new Raketa("Apollo", rampa)),
                new Thread(new Raketa("Nasa", rampa)),
                new Thread(new Raketa("Jabuka", rampa))
        };

        for (Thread thread : threads) {
            thread.start();
        }
    }

}
