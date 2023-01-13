package Interfejsy;

import StrategieEdycji.Edycja;

public interface Obserwator {
   public void update(Edycja Edycja, Object [] dane, Class klasa,int wiersz);
}
