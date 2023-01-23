/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Program.GUI;

import Hierarchia.ObiektyAgregowane.StanowiskoPracy;
import Interfejsy.Edycja;
import Interfejsy.Obiekt;
import Interfejsy.Obserwator;
import StrategieEdycji.*;
import Program.Program;

import java.util.ArrayList;

public class DodajStanowisko extends javax.swing.JFrame implements Obiekt {
    private ArrayList<Obserwator>  obw=new ArrayList<Obserwator>();
    private Edycja sposobEdycji=null;
    private Object[] dane= new Object[1];
    private int row=-1;
    public DodajStanowisko() {
        initComponents();


    }


    public void setRow(int row) {
        this.row = row;
        if (Program.stanowiska.getLista().get(row)instanceof StanowiskoPracy){
        Nazwa.setText(((StanowiskoPracy) Program.stanowiska.getLista().get(row)).getNazwa());
        }
    }


    @Override
    public void notifyObservers() {
        for (int i = 0; i < obw.size(); i++) {
            obw.get(i).update(sposobEdycji,dane,StanowiskoPracy.class,row);
        }

    }
    public void addObserver(Obserwator observer) {
        obw.add(observer);
    }
    private void ZapiszActionPerformed(java.awt.event.ActionEvent evt) {
        dane = new Object[]{Nazwa.getText()};
        if (Usun.isVisible() == true) {
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

    private void AnulujActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnulujActionPerformed
        this.dispose();
    }




    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Anuluj = new javax.swing.JButton();
        Zapisz = new javax.swing.JButton();
        Nazwa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
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

        Nazwa.setPreferredSize(new java.awt.Dimension(90, 500));
        Nazwa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NazwaActionPerformed(evt);
            }
        });

        jLabel1.setText("Nazwa");

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
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(Nazwa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Usun)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Zapisz)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Anuluj)))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Nazwa, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(Usun)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Anuluj)
                    .addComponent(Zapisz))
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
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void NazwaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NazwaActionPerformed
        // TODO add your handling code here:
    }
    private javax.swing.JButton Anuluj;
    private javax.swing.JTextField Nazwa;
    protected javax.swing.JButton Usun;
    private javax.swing.JButton Zapisz;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}