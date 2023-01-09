package StrategieEdycji;

import Interfejsy.Edycja;

import java.util.ArrayList;

public class Usuwanie implements Edycja {


    @Override
    public ArrayList<?> opercja(ArrayList<?> ArrayList, Object obiekt, int wiersz) {
        ArrayList.remove(wiersz);
        return ArrayList;

    }
}
