package Main;

import Interfejsy.Edycja;
import Interfejsy.Obserwator;

import java.util.ArrayList;
import Main.Main;
public class ObserwowanaLista implements Obserwator {
    private ArrayList<?> lista;


    public ObserwowanaLista(ArrayList<?> lista) {
        this.lista = lista;
    }

    public void update(Edycja Edycja, Object obiekt, int wiersz){
        lista=Edycja.opercja(lista,obiekt,wiersz);
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
