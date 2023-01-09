package StrategieEdycji;

import Hierarchia.ObiektyAgregowane.Kurs;
import Hierarchia.ObiektyAgregowane.StanowiskoPracy;
import Hierarchia.ObiektyAgregowane.Wydzial;
import Hierarchia.Osoba;

import java.util.ArrayList;

public class Dodawanie implements Edycja {

    @Override
    public ArrayList<?> opercja(ArrayList<?> ArrayList, Object [] dane, Class klasa,int wiersz) {
        Object obiekt=Main.createClass.create(dane,klasa);
        System.out.println("DODANO");
        ArrayList<Osoba> os=new ArrayList<Osoba>();
        if (ArrayList.getClass()==os.getClass()&& obiekt instanceof Osoba ) {
            os=(ArrayList<Osoba>)ArrayList;
            os.add((Osoba)obiekt);
            return os;
        }

        ArrayList<Kurs> kursy=new ArrayList<Kurs>();
        if (ArrayList.getClass()==os.getClass()&& obiekt instanceof Kurs ) {
            kursy=(ArrayList<Kurs>)ArrayList;
            kursy.add((Kurs)obiekt);
            return kursy;
        }


        ArrayList<StanowiskoPracy> stanowiska=new ArrayList<StanowiskoPracy>();
        if (ArrayList.getClass()==os.getClass()&& obiekt instanceof StanowiskoPracy ) {
            stanowiska=(ArrayList<StanowiskoPracy>)ArrayList;
            stanowiska.add((StanowiskoPracy) obiekt);
            return stanowiska;
        }

        ArrayList<Wydzial> wydzialy=new ArrayList<Wydzial>();
        if (ArrayList.getClass()==os.getClass()&& obiekt instanceof Wydzial ) {
            wydzialy=(ArrayList<Wydzial>)ArrayList;
            wydzialy.add((Wydzial) obiekt);
            return wydzialy;
        }
        return null;
    }
}
