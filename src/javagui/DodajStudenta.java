/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javagui;

import Hierarchia.ObiektyAgregowane.Kurs;
import Hierarchia.ObiektyAgregowane.Wydzial;
import Hierarchia.Student.Student;
import Hierarchia.Student.StudentDzienny;
import Hierarchia.Student.StudentZaoczny;
import Interfejsy.DoComboBoxa;
import StrategieEdycji.Edycja;
import Interfejsy.Obiekt;
import Interfejsy.Obserwator;
import StrategieEdycji.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import Main.funkcjonalnosc;

/**
 *
 * @author karol
 */
public class DodajStudenta extends javax.swing.JFrame implements Obiekt {


    public void refreshData(){
        if(Program.wydzialy.getLista().get(Wydzial.getSelectedIndex())instanceof Wydzial) {
            Kierunek.setModel(new javax.swing.DefaultComboBoxModel<>(funkcjonalnosc.comboBoxK( ((Hierarchia.ObiektyAgregowane.Wydzial) Program.wydzialy.getLista().get(Wydzial.getSelectedIndex())).getKierunki())));
        }

    }
    public void setOmegaIndex(int omegaIndex) {
        OmegaIndex = omegaIndex;
        kursy=((Student) Program.osoby.getLista().get(OmegaIndex)).getKursyStudenta();
        Imie.setText(((Student) Program.osoby.getLista().get(OmegaIndex)).getImie());
        Nazwisko.setText(((Student) Program.osoby.getLista().get(OmegaIndex)).getNazwisko());
        Pesel.setText(((Student) Program.osoby.getLista().get(OmegaIndex)).getPesel());
        Nr_indeks.setText(((Student) Program.osoby.getLista().get(OmegaIndex)).getNrIneksu().substring(1));
        OplataZaKursy.setText(String.valueOf(((Student) Program.osoby.getLista().get(OmegaIndex)).getOplataZaKursy()));
        Wydzial.setSelectedItem(((Student) Program.osoby.getLista().get(OmegaIndex)).getWydzial().getNazwa());
        Kierunek.setSelectedItem(String.valueOf(((Student) Program.osoby.getLista().get(OmegaIndex)).getKierunek()));
        WybraneKursy.setModel(new javax.swing.table.DefaultTableModel(
               funkcjonalnosc.zapelnijKursy (((Student) Program.osoby.getLista().get(OmegaIndex)).getKursyStudenta()),
                new String [] {
                        "NAZWA", "ECTS", "SEMESTR", "KIERUNEK"
                }
        ));
        if(((Student) Program.osoby.getLista().get(OmegaIndex)).getClass()== StudentDzienny.class){
    Czydzienny.setSelected(true);
        }
        Pesel.setEditable(false);
    }
    private ArrayList<Kurs>kursy=new ArrayList<>();
    private int OmegaIndex;
    private Edycja sposobEdycji=null;
    private Object[] dane= new Object[7];
    private ArrayList<Obserwator> obw=new ArrayList<Obserwator>();
    private Class klasa=StudentZaoczny.class;

    @Override
    public void notifyObservers() {
        for (int i = 0; i < obw.size(); i++) {
            obw.get(i).update(sposobEdycji,dane,klasa, OmegaIndex);
        }
    }

    @Override
    public void addObserver(Obserwator observer) {
        obw.add(observer);
    }

    public DodajStudenta(JTable tKursy) {
        initComponents();
//
        TabelaKursy.setModel(tKursy.getModel());
        WybraneKursy.setModel(new javax.swing.table.DefaultTableModel(
                null,
                new String [] {
                        "NAZWA", "ECTS", "SEMESTR", "KIERUNEK"
                }
        ));
        Wydzial.setModel(new javax.swing.DefaultComboBoxModel<>(funkcjonalnosc.comboBox((ArrayList<DoComboBoxa>) Program.wydzialy.getLista())));
        this.refreshData();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Anuluj = new javax.swing.JButton();
        Zapisz = new javax.swing.JButton();
        Imie = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Pesel = new javax.swing.JTextField();
        Nazwisko = new javax.swing.JTextField();
        Nr_indeks = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        OplataZaKursy = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Usun = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        TabelaKursy = new javax.swing.JTable();
        Kierunek = new javax.swing.JComboBox<>();
        Czydzienny = new javax.swing.JCheckBox();
        Wydzial = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        WybraneKursy = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        Anuluj.setText("Anuluj");
        Anuluj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnulujActionPerformed(evt);
            }
        });

        Zapisz.setText("Zapisz");
        Zapisz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZapiszActionPerformed(evt);
            }
        });

        Imie.setPreferredSize(new java.awt.Dimension(90, 500));
        Imie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImieActionPerformed(evt);
            }
        });

        jLabel1.setText("Imi??");

        jLabel2.setText("Nazwisko");

        jLabel3.setText("Pesel");

        Pesel.setPreferredSize(new java.awt.Dimension(90, 500));
        Pesel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PeselActionPerformed(evt);
            }
        });

        Nazwisko.setPreferredSize(new java.awt.Dimension(90, 500));
        Nazwisko.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NazwiskoActionPerformed(evt);
            }
        });

        Nr_indeks.setPreferredSize(new java.awt.Dimension(90, 500));
        Nr_indeks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nr_indeksActionPerformed(evt);
            }
        });

        jLabel5.setText("Oplata za kursy");

        OplataZaKursy.setPreferredSize(new java.awt.Dimension(90, 500));
        OplataZaKursy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OplataZaKursyActionPerformed(evt);
            }
        });

        jLabel6.setText("Nr Indeksu");

        jLabel7.setText("Kierunek");

        Usun.setText("Usun");
        Usun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsunActionPerformed(evt);
            }
        });


        TabelaKursy.setFocusable(false);
        TabelaKursy.getTableHeader().setReorderingAllowed(false);
        TabelaKursy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TabelaKursyMousePressed(evt);
            }
        });
        jScrollPane11.setViewportView(TabelaKursy);

        Kierunek.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Kierunek.setPreferredSize(new java.awt.Dimension(90, 22));
        Kierunek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KierunekActionPerformed(evt);
            }
        });

        Czydzienny.setText("Czy Dzienny");


        Wydzial.setPreferredSize(new java.awt.Dimension(90, 22));
        Wydzial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WydzialActionPerformed(evt);
            }
        });

        jLabel8.setText("Wydzial");


        WybraneKursy.setFocusable(false);
        WybraneKursy.getTableHeader().setReorderingAllowed(false);
        WybraneKursy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                WybraneKursyMousePressed(evt);
            }
        });
        jScrollPane12.setViewportView(WybraneKursy);

        jLabel4.setText("Wybrane Kursy");

        jLabel9.setText("Kursy do wyboru");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(Usun))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel6)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addGap(16, 16, 16)
                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                .addComponent(jLabel8)
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(Wydzial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                .addComponent(jLabel1)
                                                                                                .addGap(50, 50, 50)
                                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                        .addComponent(Imie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                        .addComponent(Nr_indeks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                .addGap(51, 51, 51)
                                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                        .addComponent(jLabel2)
                                                                                                        .addComponent(jLabel5)))
                                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                                                .addGap(85, 85, 85)
                                                                                                .addComponent(jLabel7)))))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(Kierunek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(Nazwisko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(53, 53, 53)
                                                                                .addComponent(jLabel3)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(Pesel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(OplataZaKursy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(98, 98, 98)
                                                                                .addComponent(Czydzienny, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                .addGap(13, 13, 13)
                                                .addComponent(Zapisz)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(Anuluj))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(27, 27, 27)
                                                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(26, 26, 26)
                                                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(212, 212, 212))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(Imie, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel2)
                                                .addComponent(Nazwisko, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel1))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel3)
                                                .addComponent(Pesel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(OplataZaKursy, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel5)
                                                .addComponent(Czydzienny))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(Nr_indeks, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel6)))
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel8)
                                                .addComponent(Wydzial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel7)
                                                .addComponent(Kierunek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Anuluj)
                                        .addComponent(Zapisz)
                                        .addComponent(Usun))
                                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>

    private void formWindowClosed(java.awt.event.WindowEvent evt) {
        // TODO add your handling code here:
    }

    private void OplataZaKursyActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void Nr_indeksActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void NazwiskoActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void PeselActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void ImieActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void ZapiszActionPerformed(java.awt.event.ActionEvent evt) {
        dane=new Object[]{Imie.getText(),Nazwisko.getText(),Pesel.getText(),Nr_indeks.getText(), Program.wydzialy.getLista().get(Wydzial.getSelectedIndex()),Kierunek.getSelectedIndex(),OplataZaKursy.getText(),kursy};
        if (Usun.isVisible()) {
            sposobEdycji=new Nadpisywanie();
        }
        else{sposobEdycji=new Dodawanie();}
    if (Czydzienny.isSelected())
        klasa= StudentDzienny.class;
    else{klasa=StudentZaoczny.class;}
        notifyObservers();

        this.dispose();
    }

    private void UsunActionPerformed(java.awt.event.ActionEvent evt) {
        sposobEdycji= new Usuwanie();
        notifyObservers();
        this.dispose();
    }

    private void AnulujActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();        // TODO add your handling code here:
    }

    private void TabelaKursyMousePressed(java.awt.event.MouseEvent evt) {
        int row=TabelaKursy.getSelectedRow();
        kursy.add((Kurs) Program.kursy.getLista().get(row));
        Object[] essa=new Object[4];
        for (int j = 0; j < TabelaKursy.getColumnCount(); j++) {
            essa[j]=TabelaKursy.getValueAt(row,j);
        }
        DefaultTableModel model = (DefaultTableModel) WybraneKursy.getModel();
        model.addRow(essa);

      // TODO add your handling code here:
    }

    private void KierunekActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void WydzialActionPerformed(java.awt.event.ActionEvent evt) {
        this.refreshData();
    }

    private void WybraneKursyMousePressed(java.awt.event.MouseEvent evt) {
        int row=WybraneKursy.getSelectedRow();
        kursy.remove(row);
        DefaultTableModel model = (DefaultTableModel) WybraneKursy.getModel();
        model.removeRow(row);
    }

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify
    private javax.swing.JButton Anuluj;
    private javax.swing.JCheckBox Czydzienny;
    private javax.swing.JTextField Imie;
    private javax.swing.JComboBox<String> Kierunek;
    private javax.swing.JTextField Nazwisko;
    private javax.swing.JTextField Nr_indeks;
    private javax.swing.JTextField OplataZaKursy;
    private javax.swing.JTextField Pesel;
    private javax.swing.JTable TabelaKursy;
    protected javax.swing.JButton Usun;
    private javax.swing.JTable WybraneKursy;
    private javax.swing.JComboBox<String> Wydzial;
    private javax.swing.JButton Zapisz;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    // End of variables declaration
}
