package javagui;

import Hierarchia.ObiektyAgregowane.StanowiskoPracy;
import Hierarchia.ObiektyAgregowane.Wydzial;
import Hierarchia.Osoba;
import Hierarchia.Pracownik.PracownikAdministracyjny;
import Hierarchia.Pracownik.PracownikNaukowy;
import Hierarchia.Student.StudentDzienny;
import Hierarchia.Student.StudentZaoczny;
import Main.WyjatekElementuzBazy;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Stream;

import static Main.funkcjonalnosc.getRandomNumberUsingNextInt;

public class Generator {
    public static Osoba stworzObiekt() throws IOException {
        String Pesel= String.valueOf(getRandomNumberUsingNextInt(1000,10000));
        try {
            SprawdzeniePriorytetu.pesel(Pesel);
        } catch (WyjatekElementuzBazy e) {
            return stworzObiekt();
        }
        String imie = Files.readAllLines(Paths.get("src/GeneratorOsob/Imiona.txt")).get(getRandomNumberUsingNextInt(0,630));
        String nazwisko = Files.readAllLines(Paths.get("src/GeneratorOsob/Nazwiska.txt")).get(getRandomNumberUsingNextInt(0,311241));
        String Nr= String.valueOf(getRandomNumberUsingNextInt(10000,10000000));
        System.out.println(imie+" "+nazwisko);
        int obiekt=getRandomNumberUsingNextInt(0,4);
        int wydzial=getRandomNumberUsingNextInt(0,Program.wydzialy.getLista().size());
        switch(obiekt) {
            case 0:

                return(new StudentDzienny(imie, nazwisko, Pesel, Nr,(Wydzial) Program.wydzialy.getLista().get(wydzial)));

            case 1:
                return(new StudentZaoczny(imie, nazwisko, Pesel, Nr,(Wydzial) Program.wydzialy.getLista().get(wydzial)));
            case 2:
                int stanowisko=getRandomNumberUsingNextInt(0,Program.stanowiska.getLista().size());

                return (new PracownikAdministracyjny(imie, nazwisko, Pesel, Nr, (StanowiskoPracy) Program.stanowiska.getLista().get(stanowisko)));
            case 3:
               return(new PracownikNaukowy(imie, nazwisko, Pesel, Nr, (Wydzial) Program.wydzialy.getLista().get(wydzial)));

        }
        return null;
    }

    public static ArrayList<Osoba> generate(int liczba, ArrayList<Osoba> os) throws IOException {
        for (int i = 0; i < liczba; i++) {

            os.add(stworzObiekt());
            System.out.print(i);
        }
        return os;
    }

}
