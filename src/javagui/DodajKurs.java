/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javagui;

import Hierarchia.ObiektyAgregowane.Kurs;
import Hierarchia.ObiektyAgregowane.Wydzial;
import Interfejsy.DoComboBoxa;
import StrategieEdycji.Edycja;
import Main.funkcjonalnosc;
import Interfejsy.Obiekt;
import Interfejsy.Obserwator;
import StrategieEdycji.*;

import java.util.ArrayList;

/**
 *
 * @author karol
 */
public class DodajKurs extends javax.swing.JFrame implements Obiekt {
    private ArrayList<Obserwator> obw=new ArrayList<Obserwator>();
    private Edycja sposobEdycji=null;
    private Object[] dane= new Object[5];

    private int row=-1;

    public void refreshData(){
        if(Program.wydzialy.getLista().get(Wydzial.getSelectedIndex())instanceof Wydzial) {
            Kierunek.setModel(new javax.swing.DefaultComboBoxModel<>(funkcjonalnosc.comboBoxK( ((Hierarchia.ObiektyAgregowane.Wydzial) Program.wydzialy.getLista().get(Wydzial.getSelectedIndex())).getKierunki())));
        }

    }
    public void setRow(int row) {
        this.row = row;
        if (Program.kursy.getLista().get(row)instanceof Kurs){
            Nazwa.setText(((Kurs) Program.kursy.getLista().get(row)).getNazwa());
            ECts.setText(String.valueOf(((Kurs) Program.kursy.getLista().get(row)).getECTS()));
            semestr.setText(String.valueOf(((Kurs) Program.kursy.getLista().get(row)).getSemestr()));
            Wydzial.setSelectedItem(((Kurs) Program.kursy.getLista().get(row)).getWydzial().getNazwa());
            Kierunek.setSelectedItem(((Kurs) Program.kursy.getLista().get(row)).getKierunek().getNazwa());
        }
    }
    @Override
    public void notifyObservers() {
        for (int i = 0; i < obw.size(); i++) {
            obw.get(i).update(sposobEdycji,dane,Kurs.class, row);
        }
    }

    @Override
    public void addObserver(Obserwator observer) {
        obw.add(observer);
    }
    /**
     * Creates new form DodajStudenta
     */
    public DodajKurs() {
        initComponents();
        Wydzial.setModel(new javax.swing.DefaultComboBoxModel<>(funkcjonalnosc.comboBox((ArrayList<DoComboBoxa>) Program.wydzialy.getLista())));
        this.refreshData();

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Anuluj = new javax.swing.JButton();
        Zapisz = new javax.swing.JButton();
        Nazwa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        semestr = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ECts = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Stanowisko = new javax.swing.JLabel();
        Kierunek = new javax.swing.JComboBox<>();
        Usun = new javax.swing.JButton();
        Stanowisko1 = new javax.swing.JLabel();
        Wydzial = new javax.swing.JComboBox<>();

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

        Nazwa.setPreferredSize(new java.awt.Dimension(90, 500));
        Nazwa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NazwaActionPerformed(evt);
            }
        });

        jLabel1.setText("Nazwa");

        semestr.setPreferredSize(new java.awt.Dimension(90, 500));
        semestr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NrPracownikaActionPerformed(evt);
            }
        });

        jLabel5.setText("ECTS");

        ECts.setPreferredSize(new java.awt.Dimension(90, 500));
        ECts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ECtsActionPerformed(evt);
            }
        });

        jLabel6.setText("Semestr");

        Stanowisko.setText("Kierunek");


        Kierunek.setPreferredSize(new java.awt.Dimension(90, 22));
        Kierunek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KierunekActionPerformed(evt);
            }
        });

        Usun.setText("Usun");
        Usun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsunActionPerformed(evt);
            }
        });

        Stanowisko1.setText("Wydzial");


        Wydzial.setPreferredSize(new java.awt.Dimension(90, 22));
        Wydzial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WydzialActionPerformed(evt);
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
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jLabel5))
                                                .addGap(28, 28, 28)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(Nazwa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(36, 36, 36)
                                                                .addComponent(jLabel6)
                                                                .addGap(44, 44, 44))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(ECts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(14, 14, 14)))
                                                .addComponent(semestr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(9, 9, 9)
                                                .addComponent(Stanowisko1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(Wydzial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(Stanowisko, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Kierunek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel1)
                                                        .addComponent(Nazwa, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(ECts, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel5)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel6)
                                                .addComponent(semestr, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Kierunek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Stanowisko)
                                        .addComponent(Wydzial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Stanowisko1))
                                .addGap(30, 30, 30)
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
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void ECtsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ECtsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ECtsActionPerformed

    private void NrPracownikaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NrPracownikaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NrPracownikaActionPerformed

    private void NazwaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NazwaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NazwaActionPerformed

    private void ZapiszActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZapiszActionPerformed
        dane= new Object[]{Nazwa.getText(), (ECts.getText()),(semestr.getText()), Program.wydzialy.getLista().get(Wydzial.getSelectedIndex()),Kierunek.getSelectedIndex()};
        if (Usun.isVisible()==true) {
            sposobEdycji=new Nadpisywanie();
        }
        else{sposobEdycji=new Dodawanie();}

        notifyObservers();

        this.dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_ZapiszActionPerformed

    private void KierunekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KierunekActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KierunekActionPerformed

    private void UsunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsunActionPerformed
        sposobEdycji= new Usuwanie();
        notifyObservers();
        this.dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_UsunActionPerformed

    private void AnulujActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnulujActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_AnulujActionPerformed

    private void WydzialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WydzialActionPerformed
      this.refreshData(); // TODO add your handling code here:
    }//GEN-LAST:event_WydzialActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Anuluj;
    private javax.swing.JTextField ECts;
    private javax.swing.JComboBox<String> Kierunek;
    private javax.swing.JTextField Nazwa;
    private javax.swing.JTextField semestr;
    private javax.swing.JLabel Stanowisko;
    private javax.swing.JLabel Stanowisko1;
    protected javax.swing.JButton Usun;
    private javax.swing.JComboBox<String> Wydzial;
    private javax.swing.JButton Zapisz;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;


    // End of variables declaration//GEN-END:variables
}
