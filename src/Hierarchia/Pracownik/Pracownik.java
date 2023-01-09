package Hierarchia.Pracownik;

import Hierarchia.ObiektyAgregowane.StanowiskoPracy;
import Hierarchia.Osoba;

public abstract class Pracownik extends Osoba {
    private final String nrPracownika;
    int dniWolne;

    public Pracownik(String imie, String nazwisko, String pesel, String nrPracownika, int dniWolne) {
        super(imie, nazwisko, pesel);
        this.nrPracownika = nrPracownika;
        this.dniWolne = dniWolne;
    }

    public Pracownik(String imie, String nazwisko, String pesel, String nrPracownika) {
        super(imie, nazwisko, pesel);
        this.nrPracownika = nrPracownika;
    }

    public void setDniWolne(int dniWolne) {
        this.dniWolne = dniWolne;
    }

    public String getNrPracownika() {
        return nrPracownika;
    }

    public int getDniWolne() {
        return dniWolne;
    }
}
