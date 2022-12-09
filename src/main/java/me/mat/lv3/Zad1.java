package me.mat.lv3;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

// https://moodle.srce.hr/2022-2023/pluginfile.php/7507806/mod_resource/content/1/LV3.pdf

public class Zad1 {

    private static final Scanner SCANNER = new Scanner(System.in);

    private final int[][] mat;

    private final int matSize;

    public Zad1(int elementCount, int matSize) {
        this.mat = new int[matSize][matSize];
        this.matSize = matSize;

        for (int y = 0; y < matSize; y++) {
            for (int x = 0; x < matSize; x++) {
                this.mat[y][x] = Math.abs(ThreadLocalRandom.current().nextInt(elementCount));
                System.out.printf("%d\t", this.mat[y][x]);
            }
            System.out.print("\n");
        }

        this.menu();
    }

    private void menu() {
        System.out.println("(1) Izračunati aritmetičku sredinu sporedne dijagonale.");
        System.out.println("(2) Izračunati sumu neparnih elemenata prvog retka i prvog stupca matrice.");
        System.out.println("(3) Ispisati sve brojeve na parnim indeksima vektora V");
        System.out.println("(4) Izlaz");

        switch (getNumber(1, 4)) {
            case 1:
                float avg = 0;
                for (int i = matSize - 1; i >= 0; i--) {
                    avg += mat[i][i];
                }
                avg /= matSize;
                System.out.println("Aritmetičku sredinu sporedne dijagonale: " + avg);
                break;
            case 2:
                int red = 0, stup = 0;
                for (int i = 0; i < matSize; i++) {
                    if (i % 2 == 0)
                        continue;

                    stup += mat[i][0];
                    red += mat[0][i];
                }
                System.out.println("Suma neparnih elemenata prvog retka: " + red);
                System.out.println("Suma neparnih elemenata prvog stupca: " + stup);
                break;
            case 3:
                for (int y = 0; y < matSize; y++) {
                    for (int x = 0; x < matSize; x++) {
                        if (y % 2 != 0 && x % 2 != 0)
                            continue;
                        System.out.printf("%d,", mat[y][x]);
                    }
                }
                System.out.print("\n");
                break;
            case 4:
                System.exit(0);
                break;
        }

        menu();
    }

    private static int getNumber(int min, int max) {
        int num;
        do {
            try {
                num = Integer.parseInt(SCANNER.nextLine());
            } catch (NumberFormatException e) {
                num = -1;
            }
        } while (num < min || num > max);
        return num;
    }

    public static void main(String[] args) {
        new Zad1(
                getNumber(2, 10),
                getNumber(1, 5)
        );
    }

}
