package Hierarchia.Pracownik;

import Hierarchia.ObiektyAgregowane.Wydzial;

public class PracownikNaukowy extends Pracownik{
    private Wydzial wydzial;
    private int dorobek;

    public PracownikNaukowy(String imie, String nazwisko, String pesel, String nrPracownika, int dniWolne, Wydzial wydzial, int dorobek) {
        super(imie, nazwisko, pesel, nrPracownika, dniWolne);
        this.wydzial = wydzial;
        this.dorobek = dorobek;
    }

    public PracownikNaukowy(String imie, String nazwisko, String pesel, String nrPracownika,Wydzial wydzial) {
        super(imie, nazwisko, pesel, nrPracownika);
        this.wydzial=wydzial;
    }


    public void setWydzial(Wydzial wydzial) {
        this.wydzial = wydzial;
    }

    public void setDorobek(int dorobek) {
        this.dorobek = dorobek;
    }

    public Wydzial getWydzial() {
        return wydzial;
    }

    public int getDorobek() {
        return dorobek;
    }
}
