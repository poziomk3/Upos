package Hierarchia;

import java.io.Serializable;

public abstract class Osoba implements Serializable {
    private final String imie;
    private final String nazwisko;
    private final String pesel;


    public Osoba(String imie, String nazwisko, String pesel) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getPesel() {
        return pesel;
    }
}
