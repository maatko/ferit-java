package me.mat.lv10;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Zad5 {

    private static final Scanner SCANNER = new Scanner(System.in);

    private final int[][] mat;

    public Zad5(int size) {
        this.mat = new int[size][size];
        System.out.println("======================");
        for (int y = 0; y < size; y++) {
            for (int x = 0; x < size; x++) {
                mat[y][x] = Math.abs(ThreadLocalRandom.current().nextInt(250));
                System.out.printf("%d\t", mat[y][x]);
            }
            System.out.print("\n");
        }
        System.out.println("======================");

        for (int i = 0; i < size; i++) {
            new MatrixThread(i).start();
        }
    }

    public static void main(String[] args) {
        new Zad5(getNum(2, 10));
    }

    private static int getNum(int min, int max) {
        int num;
        do {
            try {
                num = Integer.parseInt(SCANNER.nextLine());
            } catch (NumberFormatException e) {
                num = min - 1;
            }
        } while (num < min || num > max);
        return num;
    }

    private class MatrixThread extends Thread {

        private final int index;

        private final int[] array;

        public MatrixThread(int index) {
            this.index = index;
            this.array = mat[index];
        }

        @Override
        public void run() {
            int max = 0;
            for (int x : array) {
                if (x > max) {
                    max = x;
                }
            }
            System.out.printf("Nit %d je zavrsila s radom, najveći broj u retku je: %d\n", index, max);
        }

    }

}
