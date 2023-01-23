package Program;
import GeneratorOsob.Generator;
import Hierarchia.ObiektyAgregowane.Kurs;
import Hierarchia.ObiektyAgregowane.StanowiskoPracy;
import Hierarchia.ObiektyAgregowane.Wydzial;
import Hierarchia.Osoba;
import Biblioteki.funkcjonalnosc;
import Program.GUI.MainMenu;

import java.io.IOException;
import java.util.ArrayList;



public class Program {
    public  static ObserwujacaLista stanowiska=new ObserwujacaLista(new ArrayList<StanowiskoPracy>());
    public  static ObserwujacaLista kursy=new ObserwujacaLista(new ArrayList<Kurs>());
    public  static ObserwujacaLista osoby=new ObserwujacaLista(new ArrayList<Osoba>());
    public  static ObserwujacaLista wydzialy=new ObserwujacaLista(new ArrayList<Wydzial>());
    public static MainMenu Glowne;

    public Program(){
        try {

            stanowiska.setLista(funkcjonalnosc.deserializowanie("src/files/Stanowiska.ser"));
            wydzialy.setLista(funkcjonalnosc.deserializowanie("src/files/Wydzialy.ser"));
            kursy.setLista(funkcjonalnosc.deserializowanie("src/files/Kursy.ser"));
        osoby.setLista(funkcjonalnosc.deserializowanie("src/files/Osoby.ser"));
        }
        catch (Exception ignored){}



        try {
           osoby.setLista( Generator.generate(0, (ArrayList<Osoba>) osoby.getLista()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Glowne=new MainMenu();



        funkcjonalnosc.serializowanie("src/files/Stanowiska.ser", stanowiska.getLista());
        funkcjonalnosc.serializowanie("src/files/Osoby.ser",osoby.getLista());
        funkcjonalnosc.serializowanie("src/files/Kursy.ser",kursy.getLista());
        funkcjonalnosc.serializowanie("src/files/Wydzialy.ser",wydzialy.getLista());

    }
}