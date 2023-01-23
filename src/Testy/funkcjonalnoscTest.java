package Testy;


import Biblioteki.funkcjonalnosc;
import Biblioteki.createClass;
import Hierarchia.ObiektyAgregowane.*;
import Hierarchia.ObiektyAgregowane.StanowiskoPracy;
import Hierarchia.Osoba;
import Hierarchia.ObiektyAgregowane.Kurs;
import Hierarchia.Pracownik.PracownikAdministracyjny;
import Hierarchia.Pracownik.PracownikNaukowy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class funkcjonalnoscTest {
    @Test
    void WyszukajPESELKtoryJestWBazie(){
        ArrayList<Osoba> os= new ArrayList<>();
        os.add(new PracownikAdministracyjny("", "", "100", "", 0, new StanowiskoPracy("PORTIER")));
        Assertions.assertEquals(0, funkcjonalnosc.znajdzIndex("100", os));

    }
    @Test
    void WyszukajPESELktoregoNieMaWBazie(){
        ArrayList<Osoba> os= new ArrayList<>();
        os.add(new PracownikAdministracyjny("", "", "100", "", 0, new StanowiskoPracy("PORTIER")));
        assertEquals(-1, funkcjonalnosc.znajdzIndex("20000", os));
    }

    @Test
    void TworzenieStanowiska() {
        assertInstanceOf(StanowiskoPracy.class, createClass.create(new Object[]{""},StanowiskoPracy.class));
    }

}