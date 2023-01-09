package Hierarchia.Pracownik;

import Hierarchia.ObiektyAgregowane.StanowiskoPracy;

public class PracownikAdministracyjny extends Pracownik{
    private StanowiskoPracy stanowisko;

    public PracownikAdministracyjny(String imie, String nazwisko, String pesel, String nrPracownika, int dniWolne, StanowiskoPracy stanowisko) {
        super(imie, nazwisko, pesel, nrPracownika, dniWolne);
        this.stanowisko = stanowisko;
    }


    public void setStanowisko(StanowiskoPracy stanowisko) {
        this.stanowisko = stanowisko;
    }

    public StanowiskoPracy getStanowisko() {
        return stanowisko;
    }
}
