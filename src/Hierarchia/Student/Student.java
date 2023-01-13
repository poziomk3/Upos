package Hierarchia.Student;

import Hierarchia.ObiektyAgregowane.Kierunek;
import Hierarchia.ObiektyAgregowane.Kurs;
import Hierarchia.ObiektyAgregowane.Wydzial;
import Hierarchia.Osoba;
import static Main.funkcjonalnosc.getRandomNumberUsingNextInt;
import java.util.ArrayList;

public abstract class Student extends Osoba {

    private final String nrIneksu;

    private Wydzial wydzial;
    private Kierunek kierunek;
    private int oplataZaKursy;
    private ArrayList<Kurs> kursyStudenta;

    public Student(String imie, String nazwisko, String pesel, String nrIneksu, Wydzial wydzial,int nr_kierunku, int oplataZaKursy, ArrayList<Kurs> kursyStudenta) {
        super(imie, nazwisko, pesel);
        this.nrIneksu = nrIneksu;
        this.wydzial =wydzial;
        this.kierunek=wydzial.getKierunki().get(nr_kierunku);
        this.oplataZaKursy = oplataZaKursy;
        this.kursyStudenta = kursyStudenta;
    }

    public Student(String imie, String nazwisko, String pesel, String nrIneksu,Wydzial wydzial) {
        super(imie, nazwisko, pesel);
        this.nrIneksu = nrIneksu;
        this.wydzial =wydzial;
        this.kierunek=wydzial.getKierunki().get(getRandomNumberUsingNextInt(0,wydzial.getKierunki().size()));
        this.kursyStudenta=new ArrayList<>();
    }

    public Wydzial getWydzial() {
        return wydzial;
    }

    public void setWydzial(Wydzial wydzial) {
        this.wydzial = wydzial;
    }

    public void setKierunek(Kierunek kierunek) {
        this.kierunek = kierunek;
    }

    public void setOplataZaKursy(int oplataZaKursy) {
        this.oplataZaKursy = oplataZaKursy;
    }

    public void setKursyStudenta(ArrayList<Kurs> kursyStudenta) {
        this.kursyStudenta = kursyStudenta;
    }

    public String getNrIneksu() {
        return nrIneksu;
    }

    public Kierunek getKierunek() {
        return kierunek;
    }

    public int getOplataZaKursy() {
        return oplataZaKursy;
    }

    public ArrayList<Kurs> getKursyStudenta() {
        return kursyStudenta;
    }
}
