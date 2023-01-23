package Biblioteki;

import Hierarchia.ObiektyAgregowane.Kurs;
import Hierarchia.ObiektyAgregowane.StanowiskoPracy;
import Hierarchia.ObiektyAgregowane.Wydzial;
import Hierarchia.Osoba;
import Hierarchia.Pracownik.PracownikAdministracyjny;
import Hierarchia.Pracownik.PracownikNaukowy;

import static Program.Program.kursy;
import static Program.Program.osoby;

public abstract class SprawdzeniePriorytetu {


    public static void CzyMoznaUstawicPesel(String pesel) throws WyjatekElementuzBazy{
            for (int i = 0; i < osoby.getLista().size(); i++) {

                if (((Osoba) osoby.getLista().get(i)).getPesel().equals(pesel))
                    throw new WyjatekElementuzBazy("PESEL");

            }
        }


    public static void czyMoznaZmienicStanowisko( StanowiskoPracy st) throws WyjatekElementuzBazy {
        for (int i = 0; i < osoby.getLista().size(); i++) {
            if (osoby.getLista().get(i) instanceof  PracownikAdministracyjny) {
                if(((PracownikAdministracyjny) osoby.getLista().get(i)).getStanowisko().getNazwa().equals(st.getNazwa())){
                    throw new WyjatekElementuzBazy("Stanowisko");
                }
            }
        }
        
    }

    public static void czyMoznaZmienicWydzial( Wydzial wydz) throws WyjatekElementuzBazy {
        for (int i = 0; i < osoby.getLista().size(); i++) {
            if (osoby.getLista().get(i) instanceof PracownikNaukowy) {
                if(((PracownikNaukowy) osoby.getLista().get(i)).getWydzial().getNazwa().equals(wydz.getNazwa())){
                    throw new WyjatekElementuzBazy("Wydzial");
                }
            }
        }
        for (int i = 0; i < kursy.getLista().size(); i++) {
            if (kursy.getLista().get(i) instanceof Kurs) {
                if(((Kurs) kursy.getLista().get(i)).getWydzial().getNazwa().equals(wydz.getNazwa())){
                    throw new WyjatekElementuzBazy("Wydzial");
                }
            }
        }

    }

}
