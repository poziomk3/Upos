package Program.GUI;

import Hierarchia.Pracownik.PracownikAdministracyjny;
import Interfejsy.DoComboBoxa;
import Interfejsy.Edycja;
import Biblioteki.funkcjonalnosc;
import Interfejsy.Obiekt;
import Interfejsy.Obserwator;
import StrategieEdycji.*;
import Program.Program;

import java.util.ArrayList;


public class DodajAdministracje extends javax.swing.JFrame implements Obiekt {
    private Edycja sposobEdycji;
    private Object[] dane= new Object[5];
    private ArrayList<Obserwator> obw=new ArrayList<Obserwator>();
    private int OmegaIndex=-1;
    public DodajAdministracje() {
        initComponents();
        this.refreshData();
    }


    public void refreshData(){

        Stanowisko.setModel(new javax.swing.DefaultComboBoxModel<>(funkcjonalnosc.comboBox((ArrayList<DoComboBoxa>) Program.stanowiska.getLista())));

    }
    public void setOmegaIndex(int omegaIndex) {
        OmegaIndex = omegaIndex;
        Imie.setText(((PracownikAdministracyjny) Program.osoby.getLista().get(OmegaIndex)).getImie());
        Nazwisko.setText(((PracownikAdministracyjny) Program.osoby.getLista().get(OmegaIndex)).getNazwisko());
        Pesel.setText(((PracownikAdministracyjny) Program.osoby.getLista().get(OmegaIndex)).getPesel());
        NrPracownika.setText(((PracownikAdministracyjny) Program.osoby.getLista().get(OmegaIndex)).getNrPracownika());
        DniWolne.setText(String.valueOf(((PracownikAdministracyjny) Program.osoby.getLista().get(OmegaIndex)).getDniWolne()));
        Stanowisko.setSelectedItem(((PracownikAdministracyjny) Program.osoby.getLista().get(OmegaIndex)).getStanowisko().getNazwa());
        Pesel.setEditable(false);
    }
    @Override
    public void notifyObservers() {
        for (int i = 0; i < obw.size(); i++) {
            obw.get(i).update(sposobEdycji,dane,PracownikAdministracyjny.class, OmegaIndex);
        }
    }
    @Override
    public void addObserver(Obserwator observer) {
        obw.add(observer);
    }

    private void ZapiszActionPerformed(java.awt.event.ActionEvent evt) {
        dane = new Object[]{Imie.getText(), Nazwisko.getText(), Pesel.getText(), NrPracownika.getText(), DniWolne.getText(), Program.stanowiska.getLista().get(Stanowisko.getSelectedIndex())};
        if (Usun.isVisible()) {
            sposobEdycji = new Nadpisywanie();
        } else {
            sposobEdycji = new Dodawanie();
        }
        notifyObservers();

        this.dispose();
    }

    private void UsunActionPerformed(java.awt.event.ActionEvent evt) {
        sposobEdycji = new Usuwanie();
        notifyObservers();
        this.dispose();
    }

    private void AnulujActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
    }



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
        NrPracownika = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        DniWolne = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Stanowisko = new javax.swing.JComboBox<>();
        Usun = new javax.swing.JButton();

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

        Imie.setEnabled(true);
        Imie.setPreferredSize(new java.awt.Dimension(90, 500));
        Imie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImieActionPerformed(evt);
            }
        });

        jLabel1.setText("Imię");

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

        NrPracownika.setPreferredSize(new java.awt.Dimension(90, 500));
        NrPracownika.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NrPracownikaActionPerformed(evt);
            }
        });

        jLabel5.setText("Dni Wolne");

        DniWolne.setPreferredSize(new java.awt.Dimension(90, 500));
        DniWolne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DniWolneActionPerformed(evt);
            }
        });

        jLabel6.setText("Nr pracownika");

        jLabel10.setText("Stanowisko");

        Stanowisko.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Stanowisko.setPreferredSize(new java.awt.Dimension(90, 500));
        Stanowisko.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _stanowiskoActionPerformed(evt);
            }
        });

        Usun.setText("Usun");
        Usun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsunActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Usun)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Zapisz)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Anuluj)
                .addGap(25, 25, 25))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(Imie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(NrPracownika, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(DniWolne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Stanowisko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Nazwisko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(jLabel3)
                        .addGap(34, 34, 34)
                        .addComponent(Pesel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(Nazwisko, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pesel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(Imie, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(NrPracownika, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(DniWolne, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Stanowisko, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Anuluj)
                    .addComponent(Zapisz)
                    .addComponent(Usun))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    private void _stanowiskoActionPerformed(java.awt.event.ActionEvent evt){}
    private void formWindowClosed(java.awt.event.WindowEvent evt) {}
    private void DniWolneActionPerformed(java.awt.event.ActionEvent evt) {}

    private void NrPracownikaActionPerformed(java.awt.event.ActionEvent evt) {}
    private void NazwiskoActionPerformed(java.awt.event.ActionEvent evt) {}

    private void PeselActionPerformed(java.awt.event.ActionEvent evt) {}

    private void ImieActionPerformed(java.awt.event.ActionEvent evt) {}


    private javax.swing.JButton Anuluj;
    private javax.swing.JTextField DniWolne;
    private javax.swing.JTextField Imie;
    private javax.swing.JTextField Nazwisko;
    private javax.swing.JTextField NrPracownika;
    private javax.swing.JTextField Pesel;
    private javax.swing.JLabel jLabel10;
    protected javax.swing.JButton Usun;
    private javax.swing.JButton Zapisz;
    private javax.swing.JComboBox<String> Stanowisko;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;


}
