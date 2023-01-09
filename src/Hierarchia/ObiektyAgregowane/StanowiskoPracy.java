package Hierarchia.ObiektyAgregowane;

import Interfejsy.DoComboBoxa;

import java.io.Serializable;

public class StanowiskoPracy implements Serializable, DoComboBoxa {
    private String nazwa;

    public StanowiskoPracy(String nazwa) {
        this.nazwa = nazwa;
    }
@Override
    public String getNazwa() {
        return nazwa;
    }

}
