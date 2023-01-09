package Main;
import Hierarchia.ObiektyAgregowane.Kurs;
import Hierarchia.ObiektyAgregowane.StanowiskoPracy;
import Hierarchia.ObiektyAgregowane.Wydzial;
import javagui.MainMenu;
import java.util.ArrayList;



public class Main {
public static ObserwowanaLista stanowiska=new ObserwowanaLista(new ArrayList<StanowiskoPracy>());
public static ObserwowanaLista kursy=new ObserwowanaLista(new ArrayList<Kurs>());
    public static ObserwowanaLista osoby=new ObserwowanaLista(new ArrayList<Kurs>());
    public static ObserwowanaLista wydzialy=new ObserwowanaLista(new ArrayList<Wydzial>());
    public static MainMenu Glowne;

    public static void main(String[] args) {
        try{
        stanowiska.setLista(funkcjonalnosc.deserializowanie("src/files/Stanowiska.ser"));
        wydzialy.setLista(funkcjonalnosc.deserializowanie("src/files/Wydzialy.ser"));
        kursy.setLista( funkcjonalnosc.deserializowanie("src/files/Kursy.ser"));
        osoby.setLista(funkcjonalnosc.deserializowanie("src/files/Osoby.ser"));}
        catch (Exception ignored){}

        Glowne=new MainMenu();


        System.out.println("ES");
        funkcjonalnosc.serializowanie("src/files/Stanowiska.ser", stanowiska.getLista());
        funkcjonalnosc.serializowanie("src/files/Osoby.ser",osoby.getLista());
        funkcjonalnosc.serializowanie("src/files/Kursy.ser",kursy.getLista());
        funkcjonalnosc.serializowanie("src/files/Wydzialy.ser",wydzialy.getLista());

    }
}