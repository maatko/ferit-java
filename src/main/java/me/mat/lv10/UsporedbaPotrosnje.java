package me.mat.lv10;

public class UsporedbaPotrosnje {

    public static void usporedi(TestAutomobila auto1, TestAutomobila auto2) {
        float consuptionFirst = (auto1.getPotrosnjaGoriva() / auto1.getPredenPut()) * 100.0f;
        float consuptionSecond = (auto2.getPotrosnjaGoriva() / auto2.getPredenPut()) * 100.0f;

        System.out.println("Potrosnja " + auto1.getNaziv() + ": " + consuptionFirst + "L");
        System.out.println("Potrosnja " + auto2.getNaziv() + ": " + consuptionSecond + "L");

        System.out.println((consuptionFirst < consuptionSecond ? auto1.getNaziv() : auto2.getNaziv()) + " je stedljiviji");
    }

}
