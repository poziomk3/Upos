package StrategieEdycji;

import Hierarchia.ObiektyAgregowane.Kurs;
import Hierarchia.ObiektyAgregowane.StanowiskoPracy;
import Hierarchia.ObiektyAgregowane.Wydzial;
import Hierarchia.Osoba;
import Biblioteki.WyjatekElementuzBazy;
import Interfejsy.Edycja;
import Program.Program;
import Biblioteki.SprawdzeniePriorytetu;

import java.util.ArrayList;

public class Nadpisywanie implements Edycja {
    @Override
    public ArrayList<?> operacja(ArrayList<?> ArrayList, Object [] dane, Class klasa, int wiersz) {
        Object obiekt= Biblioteki.createClass.create(dane,klasa);
        if (obiekt == null) {
            return ArrayList;
        }
        ArrayList<Osoba> os;
        if ( obiekt instanceof Osoba ) {
            os=(ArrayList<Osoba>)ArrayList;
            os.set(wiersz, (Osoba) obiekt);
            return os;
        }


        ArrayList<Kurs> kursy;
        if ( obiekt instanceof Kurs ) {
            kursy=(ArrayList<Kurs>)ArrayList;
            kursy.set(wiersz, (Kurs) obiekt);
            return kursy;
        }


        ArrayList<StanowiskoPracy> stanowiska;
        if (obiekt instanceof StanowiskoPracy ) {

                stanowiska = (ArrayList<StanowiskoPracy>) ArrayList;
                try {
                    if(!stanowiska.get(wiersz).getNazwa().equals(((StanowiskoPracy) obiekt).getNazwa()))
                        SprawdzeniePriorytetu.czyMoznaZmienicStanowisko(stanowiska.get(wiersz));

                    stanowiska.set(wiersz, (StanowiskoPracy) obiekt);
                } catch (WyjatekElementuzBazy e) {
                    Program.Glowne.alert("BLAD EDYTOWANIA!");
                }



            return stanowiska;
        }

        ArrayList<Wydzial> wydzialy;
        if (obiekt instanceof Wydzial ) {
            wydzialy=(ArrayList<Wydzial>)ArrayList;
            try {
                if(!wydzialy.get(wiersz).getNazwa().equals(((Wydzial) obiekt).getNazwa()))
                    SprawdzeniePriorytetu.czyMoznaZmienicWydzial(wydzialy.get(wiersz));

                wydzialy.set(wiersz, (Wydzial) obiekt);
            } catch (WyjatekElementuzBazy e) {
                Program.Glowne.alert("BLAD EDYTOWANIA!");
            }
            return wydzialy;
        }
        return null;
    }
}
