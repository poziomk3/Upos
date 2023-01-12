/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javagui;

import Hierarchia.Pracownik.PracownikNaukowy;
import Interfejsy.DoComboBoxa;
import StrategieEdycji.Edycja;
import Interfejsy.Obserwator;
import StrategieEdycji.*;
import Interfejsy.Obiekt;
import java.util.ArrayList;

import Main.funkcjonalnosc;

/**
 *
 * @author karol
 */
public class DodajNaukowego extends javax.swing.JFrame implements Obiekt {
    public void setOmegaIndex(int omegaIndex) {
        OmegaIndex = omegaIndex;
        Imie.setText(((PracownikNaukowy) Program.osoby.getLista().get(OmegaIndex)).getImie());
        Nazwisko.setText(((PracownikNaukowy) Program.osoby.getLista().get(OmegaIndex)).getNazwisko());
        Pesel.setText(((PracownikNaukowy) Program.osoby.getLista().get(OmegaIndex)).getPesel());
        NrPracownika.setText(((PracownikNaukowy) Program.osoby.getLista().get(OmegaIndex)).getNrPracownika());
        Dorobek.setText(String.valueOf(((PracownikNaukowy) Program.osoby.getLista().get(OmegaIndex)).getDorobek()));
        Wydzial.setSelectedItem(((PracownikNaukowy) Program.osoby.getLista().get(OmegaIndex)).getWydzial().getNazwa());
        DniWolne.setText(String.valueOf(((PracownikNaukowy) Program.osoby.getLista().get(OmegaIndex)).getDniWolne()));

    }
    private int OmegaIndex;
    private Edycja sposobEdycji=null;
    private Object[] dane= new Object[7];
    private ArrayList<Obserwator> obw=new ArrayList<Obserwator>();

    @Override
    public void notifyObservers() {
        for (int i = 0; i < obw.size(); i++) {
            obw.get(i).update(sposobEdycji,dane, PracownikNaukowy.class,OmegaIndex);
        }
    }

    @Override
    public void addObserver(Obserwator observer) {
        obw.add(observer);
    }
    /**
     * Creates new form DodajStudenta
     */
    public DodajNaukowego() {
        initComponents();
        Wydzial.setModel(new javax.swing.DefaultComboBoxModel<>(funkcjonalnosc.comboBox((ArrayList<DoComboBoxa>) Program.wydzialy.getLista())));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
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
        WydzialNazwa = new javax.swing.JLabel();
        Wydzial = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        Dorobek = new javax.swing.JTextField();
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

        WydzialNazwa.setText("Wydzial");

        Wydzial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Wydzial.setPreferredSize(new java.awt.Dimension(90, 22));
        Wydzial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WydzialActionPerformed(evt);
            }
        });

        jLabel7.setText("Dorobek");

        Dorobek.setPreferredSize(new java.awt.Dimension(90, 500));
        Dorobek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DorobekActionPerformed(evt);
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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(Usun)
                        .addGap(54, 54, 54)
                        .addComponent(Zapisz)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(Anuluj)
                        .addContainerGap(39, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(NrPracownika, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Imie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Dorobek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Nazwisko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DniWolne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(jLabel3)
                                .addGap(34, 34, 34)
                                .addComponent(Pesel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(WydzialNazwa, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Wydzial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Imie, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(Nazwisko, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pesel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(NrPracownika, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(DniWolne, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WydzialNazwa)
                    .addComponent(Wydzial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Dorobek, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Zapisz)
                    .addComponent(Anuluj)
                    .addComponent(Usun))
                .addGap(55, 55, 55))
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void DniWolneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DniWolneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DniWolneActionPerformed

    private void NrPracownikaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NrPracownikaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NrPracownikaActionPerformed

    private void NazwiskoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NazwiskoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NazwiskoActionPerformed

    private void PeselActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PeselActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PeselActionPerformed

    private void ImieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ImieActionPerformed

    private void ZapiszActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZapiszActionPerformed
        dane= new Object[]{Imie.getText(),Nazwisko.getText(),Pesel.getText(),NrPracownika.getText(),DniWolne.getText(), Program.wydzialy.getLista().get(Wydzial.getSelectedIndex()),Dorobek.getText()};
        if (Usun.isVisible()) {
            sposobEdycji=new Nadpisywanie();
        }
        else{sposobEdycji=new Dodawanie();}

        notifyObservers();

        this.dispose();
    }//GEN-LAST:event_ZapiszActionPerformed

    private void WydzialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WydzialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WydzialActionPerformed

    private void DorobekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DorobekActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DorobekActionPerformed

    private void UsunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsunActionPerformed
        sposobEdycji= new Usuwanie();
        notifyObservers();
        this.dispose();
    }//GEN-LAST:event_UsunActionPerformed

    private void AnulujActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnulujActionPerformed
this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_AnulujActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Anuluj;
    private javax.swing.JTextField DniWolne;
    private javax.swing.JTextField Dorobek;
    private javax.swing.JTextField Imie;
    private javax.swing.JTextField Nazwisko;
    private javax.swing.JTextField NrPracownika;
    private javax.swing.JTextField Pesel;
    protected javax.swing.JButton Usun;
    private javax.swing.JComboBox<String> Wydzial;
    private javax.swing.JLabel WydzialNazwa;
    private javax.swing.JButton Zapisz;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
