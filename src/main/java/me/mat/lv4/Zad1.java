package me.mat.lv4;

import java.io.File;

// https://moodle.srce.hr/2022-2023/pluginfile.php/7507807/mod_resource/content/1/4LV.pdf
public class Zad1 {

    public Zad1(String path) {
        this.walk(new File(path), "", false);
        System.out.println("##################################");
        this.walk(new File(path), "", true);
    }

    private void walk(File directory, String path, boolean transform) {
        File[] files = directory.listFiles();
        if (files == null) {
            return;
        }

        for (File file : files) {
            String name = file.getName();
            if (transform) {
                char firstLetter = name.charAt(0);
                if (firstLetter > 'a' && firstLetter < 'n') {
                    name = Character.toUpperCase(firstLetter) + name.substring(1);
                } else if (firstLetter > 'o' && firstLetter < 'z' && Character.isLowerCase(name.charAt(name.length() - 1))) {
                    name = name.toUpperCase();
                }
            }

            System.out.println(path + name);
            if (file.isDirectory()) {
                walk(file, path + '\t', transform);
            }
        }
    }

    public static void main(String[] args) {
        new Zad1(".");
    }

}
