package Program.GUI;

import Hierarchia.ObiektyAgregowane.Kurs;
import Hierarchia.ObiektyAgregowane.StanowiskoPracy;
import Hierarchia.ObiektyAgregowane.Wydzial;
import Hierarchia.Osoba;
import Biblioteki.funkcjonalnosc;
import Program.Program;

import javax.swing.*;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.util.ArrayList;


public class MainMenu extends javax.swing.JFrame {



    private void WOPCJIActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void WyszukajPesActionPerformed(java.awt.event.ActionEvent evt) {
        new WpiszPesel().setVisible(true);
    }
    public void alert(String message){
        JOptionPane.showMessageDialog(this, message);
    }
    public MainMenu() {
        initComponents();
        this.refreshData();
        setVisible(true);
        setResizable(false);

    }
    public void refreshData() {

        TabelaStudentow.setModel(new javax.swing.table.DefaultTableModel(
                funkcjonalnosc.zapelnijTabeleStudentow((ArrayList<Osoba>) Program.osoby.getLista()),
                new String[]{
                        "INDEKS OGOLNY", "IMIE", "NAZWISKO", "PESEL", "NR INDEKSU"}
        ) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        });

        TabelaNaukowi.setModel(new javax.swing.table.DefaultTableModel(
                funkcjonalnosc.zapelnijTabeleNaukowa((ArrayList<Osoba>) Program.osoby.getLista()),
                new String[]{
                        "INDEKS OGOLNY", "IMIE", "NAZWISKO", "PESEL", "NR PRACOWNIKA", "WYDZIAL",
                }
        ) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        });

        TabelaAdministracji.setModel(new javax.swing.table.DefaultTableModel(

                funkcjonalnosc.zapelnijTabeleAdministracji((ArrayList<Osoba>) Program.osoby.getLista()),
                new String[]{
                        "INDEKS OGOLNY", "IMIE", "NAZWISKO", "PESEL", "NR PRACOWNIKA", "STANOWISKO",
                }
        ) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        });

        TabelaStanowiska.setModel(new javax.swing.table.DefaultTableModel(
                funkcjonalnosc.zapelnijStanowiska((ArrayList<StanowiskoPracy>) Program.stanowiska.getLista()),
                new String[]{
                        "NAZWA"
                }
        ) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        });

        TabelaKursy.setModel(new javax.swing.table.DefaultTableModel(
                funkcjonalnosc.zapelnijKursy((ArrayList<Kurs>) Program.kursy.getLista()),
                new String[]{
                        "NAZWA", "ECTS", "SEMESTR", "KIERUNEK"
                }
        ) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        });

        TabelaWydzialy.setModel(new javax.swing.table.DefaultTableModel(
                funkcjonalnosc.zapelnijWydzialy((ArrayList<Wydzial>) Program.wydzialy.getLista()),
                new String[]{
                        "NAZWA", "LICZBA KIERUNKOW"
                }
        ) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        });




        RowSorter<TableModel> sorter1 = new TableRowSorter<TableModel>(TabelaNaukowi.getModel());
        RowSorter<TableModel> sorter = new TableRowSorter<TableModel>(TabelaStudentow.getModel());
        RowSorter<TableModel> sorter2 = new TableRowSorter<TableModel>(TabelaAdministracji.getModel());
        TabelaStudentow.setRowSorter(sorter);
        TabelaNaukowi.setRowSorter(sorter1);
        TabelaAdministracji.setRowSorter(sorter2);
    }



    private void initComponents() {
        WOPCJI = new javax.swing.JMenu();
        WyszukajPes = new javax.swing.JMenuItem();
        CardPanelPrzeg = new javax.swing.JPanel();
        PanelPrzegOs = new javax.swing.JPanel();
        PanelPrzegStudentow = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelaStudentow = new javax.swing.JTable();
        PanelPrzegAdministracji = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        TabelaAdministracji = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        PanelPrzegNaukowi = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TabelaNaukowi = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        PanelPrzegKSW = new javax.swing.JPanel();
        PanelKursow = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        TabelaKursy = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        PanelStanowiska = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        TabelaStanowiska = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        PanelWK = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        TabelaWydzialy = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        MenuGorne = new javax.swing.JMenuBar();
        MenuPrzegladaj = new javax.swing.JMenu();
        MenuPrzegOsob = new javax.swing.JMenuItem();
        MenuPrzegKSW = new javax.swing.JMenuItem();
        MenuDodaj = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();



        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        CardPanelPrzeg.setLayout(new java.awt.CardLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Studenci");


        TabelaStudentow.setFocusable(false);
        TabelaStudentow.getTableHeader().setReorderingAllowed(false);
        TabelaStudentow.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mousePressed(java.awt.event.MouseEvent evt) {
                TabelaStudentowMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(TabelaStudentow);

        javax.swing.GroupLayout PanelPrzegStudentowLayout = new javax.swing.GroupLayout(PanelPrzegStudentow);
        PanelPrzegStudentow.setLayout(PanelPrzegStudentowLayout);
        PanelPrzegStudentowLayout.setHorizontalGroup(
                PanelPrzegStudentowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PanelPrzegStudentowLayout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(PanelPrzegStudentowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(PanelPrzegStudentowLayout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(36, Short.MAX_VALUE)))
        );
        PanelPrzegStudentowLayout.setVerticalGroup(
                PanelPrzegStudentowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPrzegStudentowLayout.createSequentialGroup()
                                .addContainerGap(20, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(203, 203, 203))
                        .addGroup(PanelPrzegStudentowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPrzegStudentowLayout.createSequentialGroup()
                                        .addContainerGap(64, Short.MAX_VALUE)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20)))
        );


        TabelaAdministracji.setFocusable(false);
        TabelaAdministracji.getTableHeader().setReorderingAllowed(false);
        TabelaAdministracji.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TabelaAdministracjiMousePressed(evt);
            }
        });
        jScrollPane6.setViewportView(TabelaAdministracji);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Administracja");

        javax.swing.GroupLayout PanelPrzegAdministracjiLayout = new javax.swing.GroupLayout(PanelPrzegAdministracji);
        PanelPrzegAdministracji.setLayout(PanelPrzegAdministracjiLayout);
        PanelPrzegAdministracjiLayout.setHorizontalGroup(
                PanelPrzegAdministracjiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPrzegAdministracjiLayout.createSequentialGroup()
                                .addContainerGap(32, Short.MAX_VALUE)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34))
                        .addGroup(PanelPrzegAdministracjiLayout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelPrzegAdministracjiLayout.setVerticalGroup(
                PanelPrzegAdministracjiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPrzegAdministracjiLayout.createSequentialGroup()
                                .addContainerGap(20, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30))
        );


        TabelaNaukowi.setFocusable(false);
        TabelaNaukowi.getTableHeader().setReorderingAllowed(false);
        TabelaNaukowi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TabelaNaukowiMousePressed(evt);
            }
        });
        jScrollPane4.setViewportView(TabelaNaukowi);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Naukowi");

        javax.swing.GroupLayout PanelPrzegNaukowiLayout = new javax.swing.GroupLayout(PanelPrzegNaukowi);
        PanelPrzegNaukowi.setLayout(PanelPrzegNaukowiLayout);
        PanelPrzegNaukowiLayout.setHorizontalGroup(
                PanelPrzegNaukowiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPrzegNaukowiLayout.createSequentialGroup()
                                .addContainerGap(32, Short.MAX_VALUE)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34))
                        .addGroup(PanelPrzegNaukowiLayout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelPrzegNaukowiLayout.setVerticalGroup(
                PanelPrzegNaukowiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPrzegNaukowiLayout.createSequentialGroup()
                                .addContainerGap(20, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout PanelPrzegOsLayout = new javax.swing.GroupLayout(PanelPrzegOs);
        PanelPrzegOs.setLayout(PanelPrzegOsLayout);
        PanelPrzegOsLayout.setHorizontalGroup(
                PanelPrzegOsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PanelPrzegOsLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(PanelPrzegOsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(PanelPrzegStudentow, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(PanelPrzegNaukowi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(PanelPrzegAdministracji, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        PanelPrzegOsLayout.setVerticalGroup(
                PanelPrzegOsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PanelPrzegOsLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(PanelPrzegStudentow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PanelPrzegAdministracji, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(PanelPrzegNaukowi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        CardPanelPrzeg.add(PanelPrzegOs, "card2");


        TabelaKursy.setFocusable(false);
        TabelaKursy.getTableHeader().setReorderingAllowed(false);
        TabelaKursy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TabelaKursyMousePressed(evt);
            }

        });
        jScrollPane8.setViewportView(TabelaKursy);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Kursy");

        javax.swing.GroupLayout PanelKursowLayout = new javax.swing.GroupLayout(PanelKursow);
        PanelKursow.setLayout(PanelKursowLayout);
        PanelKursowLayout.setHorizontalGroup(
                PanelKursowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelKursowLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34))
                        .addGroup(PanelKursowLayout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelKursowLayout.setVerticalGroup(
                PanelKursowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelKursowLayout.createSequentialGroup()
                                .addContainerGap(20, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30))
        );


        TabelaStanowiska.setFocusable(false);
        TabelaStanowiska.getTableHeader().setReorderingAllowed(false);
        TabelaStanowiska.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TabelaStanowiskaMousePressed(evt);
            }
        });
        jScrollPane9.setViewportView(TabelaStanowiska);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Stanowiska");

        javax.swing.GroupLayout PanelStanowiskaLayout = new javax.swing.GroupLayout(PanelStanowiska);
        PanelStanowiska.setLayout(PanelStanowiskaLayout);
        PanelStanowiskaLayout.setHorizontalGroup(
                PanelStanowiskaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelStanowiskaLayout.createSequentialGroup()
                                .addContainerGap(32, Short.MAX_VALUE)
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34))
                        .addGroup(PanelStanowiskaLayout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelStanowiskaLayout.setVerticalGroup(
                PanelStanowiskaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelStanowiskaLayout.createSequentialGroup()
                                .addContainerGap(20, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30))
        );


        TabelaWydzialy.setFocusable(false);
        TabelaWydzialy.getTableHeader().setReorderingAllowed(false);
        TabelaWydzialy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TabelaWydzialyMousePressed(evt);
            }
        });
        jScrollPane10.setViewportView(TabelaWydzialy);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Wydziały");

        javax.swing.GroupLayout PanelWKLayout = new javax.swing.GroupLayout(PanelWK);
        PanelWK.setLayout(PanelWKLayout);
        PanelWKLayout.setHorizontalGroup(
                PanelWKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelWKLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31))
                        .addGroup(PanelWKLayout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelWKLayout.setVerticalGroup(
                PanelWKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelWKLayout.createSequentialGroup()
                                .addContainerGap(20, Short.MAX_VALUE)
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout PanelPrzegKSWLayout = new javax.swing.GroupLayout(PanelPrzegKSW);
        PanelPrzegKSW.setLayout(PanelPrzegKSWLayout);
        PanelPrzegKSWLayout.setHorizontalGroup(
                PanelPrzegKSWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PanelPrzegKSWLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(PanelPrzegKSWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(PanelKursow, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(PanelWK, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(PanelStanowiska, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        PanelPrzegKSWLayout.setVerticalGroup(
                PanelPrzegKSWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PanelPrzegKSWLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(PanelKursow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PanelStanowiska, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PanelWK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26))
        );

        CardPanelPrzeg.add(PanelPrzegKSW, "card2");

        MenuGorne.setBackground(new java.awt.Color(255, 255, 204));
        MenuGorne.setForeground(new java.awt.Color(0, 0, 255));

        MenuPrzegladaj.setText("Menu");


        MenuPrzegOsob.setText("Osoby");
        MenuPrzegOsob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuPrzegOsobActionPerformed(evt);
            }
        });
        MenuPrzegladaj.add(MenuPrzegOsob);

        MenuPrzegKSW.setText("Kursy/Stanowiska/Wydziały");
        MenuPrzegKSW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuPrzegKSWActionPerformed(evt);
            }
        });
        MenuPrzegladaj.add(MenuPrzegKSW);

        MenuGorne.add(MenuPrzegladaj);

        MenuDodaj.setText("Dodaj");


        jMenu1.setText("Osoba");

        jMenuItem5.setText("Student");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DodajStudentaPrzycisk(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem6.setText("P. Naukowy");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DodajNaukowegoPrzycisk(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem7.setText("P. Administracji");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DodajAdministracjePrzycisk(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        MenuDodaj.add(jMenu1);

        jMenuItem2.setText("Kurs");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DodajKursPrzycisk(evt);
            }
        });
        MenuDodaj.add(jMenuItem2);

        jMenuItem3.setText("Stanowisko");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DodajStanowiskoPrzycisk(evt);
            }
        });
        MenuDodaj.add(jMenuItem3);

        jMenuItem4.setText("Wydział");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DodajWydzialPrzycisk(evt);
            }
        });
        MenuDodaj.add(jMenuItem4);


        MenuGorne.add(MenuDodaj);

        WOPCJI.setText("Wiecej opcji");
        WOPCJI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WOPCJIActionPerformed(evt);
            }
        });

        WyszukajPes.setText("Wyszukaj po PESEL");
        WyszukajPes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WyszukajPesActionPerformed(evt);
            }
        });
        WOPCJI.add(WyszukajPes);


        MenuGorne.add(WOPCJI);


        setJMenuBar(MenuGorne);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(CardPanelPrzeg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(CardPanelPrzeg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }





    private void MenuPrzegOsobActionPerformed(java.awt.event.ActionEvent evt) {
        CardPanelPrzeg.removeAll();
        CardPanelPrzeg.add(PanelPrzegOs);
        CardPanelPrzeg.repaint();
        CardPanelPrzeg.revalidate();
    }
    private void MenuPrzegKSWActionPerformed(java.awt.event.ActionEvent evt) {
        CardPanelPrzeg.removeAll();
        CardPanelPrzeg.add(PanelPrzegKSW);
        CardPanelPrzeg.repaint();
        CardPanelPrzeg.revalidate();
    }
    private void DodajKursPrzycisk(java.awt.event.ActionEvent evt) {
        DodajKurs Okienkone = new DodajKurs();
        Okienkone.setVisible(true);
        Okienkone.Usun.setVisible(false);
        Okienkone.addObserver(Program.kursy);

    }
    private void DodajStudentaPrzycisk(java.awt.event.ActionEvent evt) {
        DodajStudenta Okienkone = new DodajStudenta(TabelaKursy);
        Okienkone.setVisible(true);
        Okienkone.Usun.setVisible(false);
        Okienkone.addObserver(Program.osoby);
    }
    private void DodajNaukowegoPrzycisk(java.awt.event.ActionEvent evt) {
        DodajNaukowego Okienkone = new DodajNaukowego();
        Okienkone.setVisible(true);
        Okienkone.Usun.setVisible(false);
        Okienkone.addObserver(Program.osoby);
    }
    private void DodajAdministracjePrzycisk(java.awt.event.ActionEvent evt) {
        DodajAdministracje Okienkone = new DodajAdministracje();
        Okienkone.setVisible(true);
        Okienkone.Usun.setVisible(false);
        Okienkone.addObserver(Program.osoby);
    }
    private void DodajStanowiskoPrzycisk(java.awt.event.ActionEvent evt) {
        DodajStanowisko Okienkone = new DodajStanowisko();
        Okienkone.setVisible(true);
        Okienkone.Usun.setVisible(false);
        Okienkone.addObserver(Program.stanowiska);

    }
    private void DodajWydzialPrzycisk(java.awt.event.ActionEvent evt) {
        DodajWydzial Okienkone = new DodajWydzial();
        Okienkone.setVisible(true);
        Okienkone.Usun.setVisible(false);
        Okienkone.addObserver(Program.wydzialy);

    }
    private void TabelaKursyMousePressed(java.awt.event.MouseEvent evt) {
        DodajKurs Okienkone = new DodajKurs();
        Okienkone.setRow(TabelaKursy.getSelectedRow());
        Okienkone.setVisible(true);
        Okienkone.addObserver(Program.kursy);

    }
    private void TabelaStudentowMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaStudentowMousePressed
//       DodajStanowisko Okienkone= new DodajStanowisko();
        DodajStudenta Okienkone = new DodajStudenta(TabelaKursy);
        Okienkone.setVisible(true);
        Okienkone.setOmegaIndex((Integer) TabelaStudentow.getValueAt(TabelaStudentow.getSelectedRow(), 0));
        Okienkone.addObserver(Program.osoby);

    }
    private void TabelaStanowiskaMousePressed(java.awt.event.MouseEvent evt) {
        DodajStanowisko Okienkone = new DodajStanowisko();
        Okienkone.setRow(TabelaStanowiska.getSelectedRow());
        Okienkone.setVisible(true);
        Okienkone.addObserver(Program.stanowiska);
    }
    private void TabelaWydzialyMousePressed(java.awt.event.MouseEvent evt) {
        DodajWydzial Okienkone = new DodajWydzial();
        Okienkone.setRow(TabelaWydzialy.getSelectedRow());
        Okienkone.setVisible(true);
        Okienkone.addObserver(Program.wydzialy);
    }
    private void TabelaAdministracjiMousePressed(java.awt.event.MouseEvent evt) {
        DodajAdministracje Okienkone = new DodajAdministracje();
        Okienkone.setVisible(true);
        Okienkone.addObserver(Program.osoby);
        Okienkone.setOmegaIndex((Integer) TabelaAdministracji.getValueAt(TabelaAdministracji.getSelectedRow(), 0));
    }
    private void TabelaNaukowiMousePressed(java.awt.event.MouseEvent evt) {

        DodajNaukowego Okienkone = new DodajNaukowego();
        Okienkone.setVisible(true);
        Okienkone.addObserver(Program.osoby);
        Okienkone.setOmegaIndex((Integer) TabelaNaukowi.getValueAt(TabelaNaukowi.getSelectedRow(), 0));
    }
    private void formWindowClosing(java.awt.event.WindowEvent evt) {
        funkcjonalnosc.serializowanie("src/files/Osoby.ser", Program.osoby.getLista());
        funkcjonalnosc.serializowanie("src/files/Kursy.ser", Program.kursy.getLista());
        funkcjonalnosc.serializowanie("src/files/Wydzialy.ser", Program.wydzialy.getLista());
        funkcjonalnosc.serializowanie("src/files/Stanowiska.ser", Program.stanowiska.getLista());
        System.out.println("SERIALIZOWANIE");

    }



    private javax.swing.JPanel CardPanelPrzeg;
    private javax.swing.JMenu MenuDodaj;
    private javax.swing.JMenuBar MenuGorne;
    private javax.swing.JMenuItem MenuPrzegKSW;
    private javax.swing.JMenuItem MenuPrzegOsob;
    private javax.swing.JMenu MenuPrzegladaj;
    private javax.swing.JPanel PanelKursow;
    private javax.swing.JPanel PanelPrzegAdministracji;
    private javax.swing.JPanel PanelPrzegKSW;
    private javax.swing.JPanel PanelPrzegNaukowi;
    private javax.swing.JPanel PanelPrzegOs;
    private javax.swing.JPanel PanelPrzegStudentow;
    private javax.swing.JPanel PanelStanowiska;
    private javax.swing.JPanel PanelWK;
    private javax.swing.JTable TabelaAdministracji;
    private javax.swing.JTable TabelaKursy;
    private javax.swing.JTable TabelaNaukowi;
    private javax.swing.JTable TabelaStanowiska;
    private javax.swing.JTable TabelaStudentow;
    private javax.swing.JTable TabelaWydzialy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JMenu WOPCJI;
    private javax.swing.JMenuItem WyszukajPes;

}
