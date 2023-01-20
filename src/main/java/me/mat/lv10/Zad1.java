package me.mat.lv10;

import java.util.Scanner;

public class Zad1 {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int target = 25;

        int tries = 0;
        int number;
        while ((number = scanner.nextInt()) != target) {
            System.out.println(number > target ? "manji" : "veci");
            tries++;
        }

        System.out.printf("Bravo! Pogodio/la si broj zadan u programu, trebalo ti je %d pokušaja\n", tries);
    }

}
