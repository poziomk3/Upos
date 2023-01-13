package javagui;
import Hierarchia.ObiektyAgregowane.Kurs;
import Hierarchia.ObiektyAgregowane.StanowiskoPracy;
import Hierarchia.ObiektyAgregowane.Wydzial;
import Hierarchia.Osoba;
import Main.ObserwowanaLista;
import Main.funkcjonalnosc;

import java.io.IOException;
import java.util.ArrayList;



public class Program {
    protected static ObserwowanaLista stanowiska=new ObserwowanaLista(new ArrayList<StanowiskoPracy>());
    protected static ObserwowanaLista kursy=new ObserwowanaLista(new ArrayList<Kurs>());
    protected static ObserwowanaLista osoby=new ObserwowanaLista(new ArrayList<Osoba>());
    protected static ObserwowanaLista wydzialy=new ObserwowanaLista(new ArrayList<Wydzial>());
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
           osoby.setLista( Generator.generate(5000, (ArrayList<Osoba>) osoby.getLista()));
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