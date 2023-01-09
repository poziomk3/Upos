package Main;

import Hierarchia.ObiektyAgregowane.Kierunek;
import Hierarchia.ObiektyAgregowane.Kurs;
import Hierarchia.ObiektyAgregowane.StanowiskoPracy;
import Hierarchia.ObiektyAgregowane.Wydzial;
import Hierarchia.Osoba;
import Hierarchia.Pracownik.PracownikAdministracyjny;
import Hierarchia.Pracownik.PracownikNaukowy;
import Hierarchia.Student.Student;
import Interfejsy.DoComboBoxa;


import java.io.*;
import java.util.ArrayList;

public class funkcjonalnosc {

public static String[] comboBox(ArrayList<DoComboBoxa> nazwy){
    ArrayList<String> result= new ArrayList<>();

    for (DoComboBoxa  item:nazwy)
        result.add(item.getNazwa());

    return result.toArray(new String[result.size()]);
}

    public static String[] comboBoxK(ArrayList<Kierunek> nazwy){
        ArrayList<String> result= new ArrayList<>();

        for (DoComboBoxa  item:nazwy)
            result.add(item.getNazwa());

        return result.toArray(new String[result.size()]);
    }



    public static Object[][] zapelnijTabeleStudentow(ArrayList<Osoba> baza) {
        ArrayList< Object[]> wynik=new ArrayList<Object[]>() ;

        for (int i = 0; i < baza.size(); i++)
            if (baza.get(i) instanceof Student)
                wynik.add(new Object[]{i, baza.get(i).getImie(), baza.get(i).getNazwisko(), baza.get(i).getPesel(), ((Student) baza.get(i)).getNrIneksu()});


        return returnFormat(wynik);
    }
    public static Object[][] zapelnijTabeleAdministracji(ArrayList<Osoba> baza) {
        ArrayList< Object[]> wynik=new ArrayList<Object[]>() ;

        for (int i = 0; i < baza.size(); i++)
            if (baza.get(i) instanceof PracownikAdministracyjny)
                wynik.add(new Object[]{i, baza.get(i).getImie(), baza.get(i).getNazwisko(), baza.get(i).getPesel(), ((PracownikAdministracyjny) baza.get(i)).getNrPracownika(), ((PracownikAdministracyjny) baza.get(i)).getStanowisko().getNazwa()});


        return returnFormat(wynik);
    }
    public static Object[][] zapelnijTabeleNaukowa(ArrayList<Osoba> baza) {
        ArrayList< Object[]> wynik=new ArrayList<Object[]>() ;

        for (int i = 0; i < baza.size(); i++)
            if (baza.get(i) instanceof PracownikNaukowy)
                wynik.add(new Object[]{i, baza.get(i).getImie(), baza.get(i).getNazwisko(), baza.get(i).getPesel(), ((PracownikNaukowy) baza.get(i)).getNrPracownika(), ((PracownikNaukowy) baza.get(i)).getWydzial().getNazwa()});

        return returnFormat(wynik);
    }
    public static Object[][] zapelnijKursy(ArrayList<Kurs> kursy) {
        ArrayList< Object[]> wynik=new ArrayList<Object[]>() ;

        for (Kurs kurs : kursy)
            wynik.add(new Object[]{kurs.getNazwa(), kurs.getECTS(), kurs.getSemestr(), kurs.getKierunek().getNazwa()});

        return returnFormat(wynik);
    }
    public static Object[][] zapelnijWydzialy(ArrayList<Wydzial> wydzialy) {
        ArrayList< Object[]> wynik=new ArrayList<Object[]>() ;

        for (Wydzial wydzial : wydzialy)
            wynik.add(new Object[]{wydzial.getNazwa(), wydzial.getKierunki().size()});

        return returnFormat(wynik);
    }
    public static Object[][] zapelnijKierunki(ArrayList<Kierunek> kierunki) {
        ArrayList< Object[]> wynik=new ArrayList<Object[]>() ;

        for (Kierunek kierunek : kierunki)
            wynik.add(new Object[]{kierunek.getNazwa()});

        return returnFormat(wynik);
    }

    public static Object[][] zapelnijStanowiska(ArrayList<StanowiskoPracy> stanowiska) {
        if (stanowiska ==null)return null;
        ArrayList<Object[]> wynik = new ArrayList<Object[]>();

        for (StanowiskoPracy stanowiskoPracy : stanowiska)
            wynik.add(new Object[]{stanowiskoPracy.getNazwa()});


        return returnFormat(wynik);
    }

    public static Object[][] returnFormat( ArrayList< Object[]> wynik) {
        Object[][] result= new Object[wynik.size()][];

        for (int i = 0; i < wynik.size(); i++)
            result[i] = wynik.get(i);

        return result;
    }



    public static void serializowanie(String path, ArrayList<?> e){
        try {
            FileOutputStream fileOut = new FileOutputStream(path);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
        } catch (IOException i) {
            i.printStackTrace();
        }

    }
    public static ArrayList<?> deserializowanie(String path ){

        ArrayList<Object> wynik = new ArrayList<Object>();
        try {

            FileInputStream fileIn = new FileInputStream(path);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            wynik= (ArrayList<Object>) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException | ClassNotFoundException c ) {
            c.printStackTrace();
        }
        return wynik;
    }


}
