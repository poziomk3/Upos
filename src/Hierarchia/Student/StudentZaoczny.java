package Hierarchia.Student;

import Hierarchia.ObiektyAgregowane.Kierunek;
import Hierarchia.ObiektyAgregowane.Kurs;
import Hierarchia.ObiektyAgregowane.Wydzial;

import java.util.ArrayList;

public class StudentZaoczny extends Student{
    public StudentZaoczny(String imie, String nazwisko, String pesel, String nrIneksu, Wydzial wydzial, int nr_kierunku, int oplataZaKursy, ArrayList<Kurs> kursyStudenta) {
        super(imie, nazwisko, pesel, "z"+nrIneksu, wydzial, nr_kierunku, oplataZaKursy, kursyStudenta);
    }

}
