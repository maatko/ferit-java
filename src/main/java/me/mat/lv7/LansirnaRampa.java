package me.mat.lv7;

public class LansirnaRampa {

    public synchronized void lansiraj() throws InterruptedException {
        for (int i = 10; i > 0; i--) {
            System.out.printf("%d\n", i);
            Thread.sleep(1000);
        }
    }

}
