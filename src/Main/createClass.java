package Main;

import Hierarchia.ObiektyAgregowane.Kierunek;
import Hierarchia.ObiektyAgregowane.Kurs;
import Hierarchia.ObiektyAgregowane.StanowiskoPracy;
import Hierarchia.ObiektyAgregowane.Wydzial;
import Hierarchia.Pracownik.PracownikAdministracyjny;
import Hierarchia.Pracownik.PracownikNaukowy;
import Hierarchia.Student.StudentDzienny;
import Hierarchia.Student.StudentZaoczny;

import java.util.ArrayList;

public class createClass {


    public static Object create(Object[] dane, Class klasa){

        try {
            if (klasa == StudentZaoczny.class)
                return new StudentZaoczny((String) dane[0], (String) dane[1], (String) dane[2], (String) dane[3], (Wydzial) dane[4], (Integer) dane[5], Integer.parseInt((String)dane[6]), (ArrayList<Kurs>) dane[7]);
            if (klasa == StudentDzienny.class)
                return new StudentDzienny((String) dane[0], (String) dane[1], (String) dane[2], (String) dane[3], (Wydzial) dane[4], (Integer) dane[5], Integer.parseInt((String) dane[6]), (ArrayList<Kurs>) dane[7]);
            if (klasa == PracownikAdministracyjny.class)
                return new PracownikAdministracyjny((String) dane[0], (String) dane[1], (String) dane[2], (String) dane[3], Integer.parseInt((String) dane[4]), (StanowiskoPracy) dane[5]);
            if (klasa == PracownikNaukowy.class)
                return new PracownikNaukowy((String) dane[0], (String) dane[1], (String) dane[2], (String) dane[3], Integer.parseInt((String) dane[4]), (Wydzial) dane[5], Integer.parseInt((String) dane[6]));
            if (klasa == Kurs.class)
                return new Kurs((String) dane[0], Integer.parseInt((String) dane[1]), Integer.parseInt((String) dane[2]), (Wydzial) dane[3], (Integer) dane[4]);
            if (klasa == Wydzial.class)
                return new Wydzial((String) dane[0], (ArrayList<Kierunek>) dane[1]);
            if (klasa == StanowiskoPracy.class)
                return new StanowiskoPracy((String) dane[0]);
            if (klasa == Kierunek.class)
                return new Kierunek((String) dane[0]);
        } catch (NumberFormatException ignored) { }
        return null;
    }

}
