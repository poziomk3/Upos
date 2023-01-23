package Program;
import Hierarchia.Pracownik.PracownikNaukowy;
import Hierarchia.Pracownik.PracownikAdministracyjny;
import Interfejsy.Edycja;
import Interfejsy.Obserwator;

import java.util.ArrayList;

public class ObserwujacaLista implements Obserwator {
    private ArrayList<?> lista;


    public ObserwujacaLista(ArrayList<?> lista) {
        this.lista = lista;
    }

    public void update(Edycja Edycja, Object [] dane, Class klasa,int wiersz){
//        if(klasa== PracownikNaukowy.class &&  Integer.parseInt((String) dane[6])>10)
//            Program.Glowne.alert("NALEZY SIE NAGRODA ZA DOROBEK!");

        lista=Edycja.operacja(lista,dane,klasa,wiersz);
        Program.Glowne.refreshData();
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
