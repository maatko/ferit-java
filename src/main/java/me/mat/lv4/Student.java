package me.mat.lv4;

import java.io.*;
import java.nio.file.Files;

public class Student implements Serializable {

    private int maticniBroj;

    private String ime;

    private String prezime;

    private String fakultet;

    private String smjer;

    private int godina;

    private float prosjekOcjena;

    public Student(int maticniBroj, String ime, String prezime, String fakultet, String smjer, int godina, float prosjekOcjena) {
        this.maticniBroj = maticniBroj;
        this.ime = ime;
        this.prezime = prezime;
        this.fakultet = fakultet;
        this.smjer = smjer;
        this.godina = godina;
        this.prosjekOcjena = prosjekOcjena;
    }

    public int getMaticniBroj() {
        return maticniBroj;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public String getFakultet() {
        return fakultet;
    }

    public String getSmjer() {
        return smjer;
    }

    public int getGodina() {
        return godina;
    }

    public float getProsjekOcjena() {
        return prosjekOcjena;
    }

    @Override
    public String toString() {
        return "Student{" +
                "maticniBroj=" + maticniBroj +
                ", ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", fakultet='" + fakultet + '\'' +
                ", smjer='" + smjer + '\'' +
                ", godina=" + godina +
                ", prosjekOcjena=" + prosjekOcjena +
                '}';
    }

    protected static void save(Student[] students, File file) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(Files.newOutputStream(file.toPath()))) {
            outputStream.writeObject(students);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    protected static Student[] load(File file) {
        try (ObjectInputStream inputStream = new ObjectInputStream(Files.newInputStream(file.toPath()))) {
            Object object = inputStream.readObject();
            if (!(object instanceof Student[])) {
                throw new RuntimeException("Failed to read the array of students");
            }
            return (Student[]) object;
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
