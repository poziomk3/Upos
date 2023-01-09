package Hierarchia.ObiektyAgregowane;

import Interfejsy.DoComboBoxa;

import java.io.Serializable;

public class Kierunek implements Serializable, DoComboBoxa {
    private String nazwa;


    public Kierunek(String nazwa) {
        this.nazwa = nazwa;

    }
    @Override
    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }


}
