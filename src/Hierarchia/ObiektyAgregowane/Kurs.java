package Hierarchia.ObiektyAgregowane;

import java.io.Serializable;

public class Kurs implements Serializable {
    private String nazwa;
    private int ECTS;
    private int semestr;
    private Wydzial wydzial;
    private Kierunek kierunek;

    public Kurs(String nazwa, int ECTS, int semestr, Wydzial wydzial, int nr_kierunku) {
        this.nazwa = nazwa;
        this.ECTS = ECTS;
        this.semestr = semestr;
        this.wydzial = wydzial;
        this.kierunek = (Kierunek) wydzial.getKierunki().get(nr_kierunku);
    }




    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getECTS() {
        return ECTS;
    }

    public void setECTS(int ECTS) {
        this.ECTS = ECTS;
    }

    public int getSemestr() {
        return semestr;
    }

    public void setSemestr(int semestr) {
        this.semestr = semestr;
    }

    public Kierunek getKierunek() {
        return kierunek;
    }

    public void setKierunek(Kierunek kierunek) {
        this.kierunek = kierunek;
    }

    public Wydzial getWydzial() {
        return wydzial;
    }

    public void setWydzial(Wydzial wydzial) {
        this.wydzial = wydzial;
    }
}
