package me.mat.lv6.zadatak3.drugi;

import me.mat.lv6.zadatak3.prvi.Radni;

public class Tajnica implements Zaposlenik, Radni {

    private String id;

    private String ime;

    private String prezime;

    public Tajnica(String id, String ime, String prezime) {
        this.id = id;
        this.ime = ime;
        this.prezime = prezime;
    }

    @Override
    public void predstaviSe() {
        System.out.println("ID: " + id);
        System.out.println("Ime: " + ime);
        System.out.println("Prezime: " + prezime);
    }

    @Override
    public void radi() {
        System.out.println("Dogovaram");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

}
