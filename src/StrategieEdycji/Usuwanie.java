package StrategieEdycji;

import Hierarchia.ObiektyAgregowane.StanowiskoPracy;
import Hierarchia.ObiektyAgregowane.Wydzial;
import Main.WyjatekElementuzBazy;
import javagui.Program;
import javagui.SprawdzeniePriorytetu;
import java.util.ArrayList;


public class Usuwanie implements Edycja {


    @Override
    public ArrayList<?> operacja(ArrayList<?> ArrayList, Object [] dane, Class klasa, int wiersz) {
        if(klasa== StanowiskoPracy.class)
        {
            try {
                SprawdzeniePriorytetu.czyMoznaZmienicStanowisko((StanowiskoPracy) ArrayList.get(wiersz));
            } catch (WyjatekElementuzBazy e) {
                Program.Glowne.alert("BLAD USUWANIA!");
                return ArrayList;

            }
        }
        if(klasa== Wydzial.class)
        {
            try {
                SprawdzeniePriorytetu.czyMoznaZmienicWydzial((Wydzial) ArrayList.get(wiersz));
            } catch (WyjatekElementuzBazy e) {
                Program.Glowne.alert("BLAD USUWANIA!");
                return ArrayList;

            }
        }

        ArrayList.remove(wiersz);
        return ArrayList;

    }
}
