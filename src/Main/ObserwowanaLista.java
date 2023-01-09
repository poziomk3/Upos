package Main;

import StrategieEdycji.Edycja;
import Interfejsy.Obserwator;

import java.util.ArrayList;

public class ObserwowanaLista implements Obserwator {
    private ArrayList<?> lista;


    public ObserwowanaLista(ArrayList<?> lista) {
        this.lista = lista;
    }

    public void update(Edycja Edycja, Object [] dane, Class klasa,int wiersz){
        lista=Edycja.opercja(lista,dane,klasa,wiersz);
        Main.Glowne.refreshData();
    }

    public ArrayList<?> getLista() {
        return lista;
    }

    public Object  zwrocObiekt(int rzad) {
        return lista.get(rzad);
    }

    public void setLista(ArrayList<?> lista) {
        this.lista = lista;
    }
}
