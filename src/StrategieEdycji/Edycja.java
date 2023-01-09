package StrategieEdycji;

import Hierarchia.ObiektyAgregowane.Kurs;
import Hierarchia.ObiektyAgregowane.StanowiskoPracy;
import Hierarchia.ObiektyAgregowane.Wydzial;
import Hierarchia.Osoba;

import java.util.ArrayList;

public interface Edycja {
    public ArrayList<?> opercja(ArrayList<?> ArrayList, Object [] dane, Class klasa,int wiersz);

}
