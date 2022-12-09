package me.mat.lv4;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

// https://moodle.srce.hr/2022-2023/pluginfile.php/7507807/mod_resource/content/1/4LV.pdf
public class Zad2 {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        Student[] students = new Student[2];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(
                    getNumber(String.format("[%d] Unesi maticni broj", i)).intValue(),
                    getString(String.format("[%d] Unesi ime", i)),
                    getString(String.format("[%d] Unesi prezime", i)),
                    getString(String.format("[%d] Unesi fakultet", i)),
                    getString(String.format("[%d] Unesi smjer", i)),
                    getNumber(String.format("[%d] Unesi godine", i)).intValue(),
                    getNumber(String.format("[%d] Unesi prosjek ocjena", i)).floatValue()
            );
        }
        final File studentsFile = new File("students.bin");
        Student.save(students, studentsFile);

        students = Student.load(studentsFile);
        System.out.println(Arrays.toString(students));

        float prosjek = 0.0f;
        for (Student student : students) {
            prosjek += student.getProsjekOcjena();
        }
        prosjek /= students.length;

        System.out.println("Prosjek ocjena: " + prosjek);
    }

    public static String getString(String message) {
        System.out.println(message);
        return SCANNER.nextLine();
    }

    private static Number getNumber(String message) {
        System.out.println(message);
        try {
            return Double.parseDouble(SCANNER.nextLine());
        } catch (NumberFormatException e) {
            return getNumber(message);
        }
    }

}
