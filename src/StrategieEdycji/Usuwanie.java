package StrategieEdycji;

import java.util.ArrayList;

public class Usuwanie implements Edycja {


    @Override
    public ArrayList<?> operacja(ArrayList<?> ArrayList, Object [] dane, Class klasa, int wiersz) {
        ArrayList.remove(wiersz);
        return ArrayList;

    }
}
