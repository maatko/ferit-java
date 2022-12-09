package me.mat.lv1;

import java.util.Scanner;

// https://moodle.srce.hr/2022-2023/pluginfile.php/7507804/mod_resource/content/1/prva_vjezba.pdf

public class Zad6 {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.printf("Unesite prvi broj: ");
        int first = scanner.nextInt();

        System.out.printf("Unesite drugi broj: ");
        int second = scanner.nextInt();

        System.out.printf("%d + %d = %d\n", first, second, first + second);
        System.out.printf("%d - %d = %d\n", first, second, first - second);
        System.out.printf("%d * %d = %d\n", first, second, first * second);
        System.out.printf("%d / %d = %d\n", first, second, first / second);
        System.out.printf("%d mod %d = %d\n", first, second, first % second);
    }

}
