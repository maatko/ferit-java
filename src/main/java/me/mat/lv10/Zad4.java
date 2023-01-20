package me.mat.lv10;

public class Zad4 {

    public static void main(String[] args) {
        TestAutomobila auto1 = new TestAutomobila("Audi", 10.5f, 100);
        TestAutomobila auto2 = new TestAutomobila("Bmw", 25.25f, 100);

        UsporedbaPotrosnje.usporedi(auto1, auto2);
    }

}
