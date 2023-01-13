package Hierarchia.Student;

import Hierarchia.ObiektyAgregowane.Kierunek;
import Hierarchia.ObiektyAgregowane.Kurs;
import Hierarchia.ObiektyAgregowane.Wydzial;

import java.util.ArrayList;

public class StudentDzienny extends Student {
    public StudentDzienny(String imie, String nazwisko, String pesel, String nrIneksu,Wydzial wydzial) {
        super(imie, nazwisko, pesel, "d"+nrIneksu,wydzial);

    }

    public StudentDzienny(String imie, String nazwisko, String pesel, String nrIneksu, Wydzial wydzial, int nr_kierunku, int oplataZaKursy, ArrayList<Kurs> kursyStudenta) {
        super(imie, nazwisko, pesel, "d"+nrIneksu, wydzial, nr_kierunku, oplataZaKursy, kursyStudenta);
    }




}
