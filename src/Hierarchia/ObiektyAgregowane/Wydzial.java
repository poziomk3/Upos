package Hierarchia.ObiektyAgregowane;

import Interfejsy.DoComboBoxa;

import java.io.Serializable;
import java.util.ArrayList;

public class Wydzial implements Serializable, DoComboBoxa {
    private String nazwa;
    private ArrayList<Kierunek> kierunki;

    public Wydzial(String nazwa, ArrayList<Kierunek> kierunki) {
        this.nazwa = nazwa;
        this.kierunki = kierunki;
    }
@Override
    public String getNazwa() {
        return nazwa;
    }

    public ArrayList<Kierunek> getKierunki() {
        return kierunki;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setKierunki(ArrayList<Kierunek> kierunki) {
        this.kierunki = kierunki;
    }
}
