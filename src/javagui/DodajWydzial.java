/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javagui;

import Hierarchia.ObiektyAgregowane.Kierunek;
import Hierarchia.ObiektyAgregowane.Wydzial;
import StrategieEdycji.Edycja;
import Interfejsy.Obiekt;
import Interfejsy.Obserwator;
import Interfejsy.MessageListener;
import StrategieEdycji.*;
import Main.funkcjonalnosc;
import java.util.ArrayList;

/**
 *
 * @author karol
 */
public class DodajWydzial extends javax.swing.JFrame implements Obiekt, MessageListener {
    public void onMessage(ArrayList<?> lista){

        kierunki= (ArrayList<Kierunek>) lista;
        refreshData();
    }
    public void refreshData(){
        TabelaKierunki.setModel(new javax.swing.table.DefaultTableModel(
                funkcjonalnosc.zapelnijKierunki(kierunki),
                new String [] {
                        "NAZWA"
                }
        ){public boolean isCellEditable(int row, int column){return false;}});
    }
    private ArrayList<Obserwator> obw=new ArrayList<Obserwator>();
    private Edycja sposobEdycji=null;
    private Object[] dane= new Object[2];
    private int row=-1;
    private ArrayList<Kierunek> kierunki=new ArrayList<Kierunek>();

    public void setRow(int row) {
        this.row = row;
        if (Program.wydzialy.getLista().get(row)instanceof Wydzial){
            Nazwa.setText(((Wydzial) Program.wydzialy.getLista().get(row)).getNazwa());
            kierunki=((Wydzial) Program.wydzialy.getLista().get(row)).getKierunki();
            refreshData();
        }
    }


    @Override
    public void notifyObservers() {
        for (int i = 0; i < obw.size(); i++) {
            obw.get(i).update(sposobEdycji,dane,Wydzial.class, row);
        }

    }
    public void addObserver(Obserwator observer) {
        obw.add(observer);
    }

    /**
     * Creates new form DodajStudenta
     */
    public DodajWydzial() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPanel1 = new javax.swing.JPanel();
        Anuluj = new javax.swing.JButton();
        Zapisz = new javax.swing.JButton();
        Nazwa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        TabelaKierunki = new javax.swing.JTable();
        DodajKierunek = new javax.swing.JButton();
        Usun = new javax.swing.JButton();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

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


        TabelaKierunki.setFocusable(false);
        TabelaKierunki.getTableHeader().setReorderingAllowed(false);
        TabelaKierunki.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TabelaKierunkiMousePressed(evt);
            }
        });
        jScrollPane11.setViewportView(TabelaKierunki);

        DodajKierunek.setText("Dodaj kierunek");
        DodajKierunek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DodajKierunekActionPerformed(evt);
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
                        .addComponent(jLabel1)
                        .addGap(28, 28, 28)
                        .addComponent(Nazwa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(DodajKierunek)))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(7, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(Nazwa, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6))
                        .addGap(30, 30, 30)
                        .addComponent(DodajKierunek))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    }//GEN-LAST:event_NazwaActionPerformed

    private void ZapiszActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZapiszActionPerformed
        dane= new Object[]{Nazwa.getText(),kierunki};
        if (Usun.isVisible()==true) {
            sposobEdycji=new Nadpisywanie();
        }
        else{sposobEdycji=new Dodawanie();}

        notifyObservers();

        this.dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_ZapiszActionPerformed

    private void DodajKierunekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DodajKierunekActionPerformed
        DodajKierunek Okienkone =new DodajKierunek(kierunki,DodajWydzial.this);
       Okienkone.setVisible(true);
       Okienkone.Usun.setVisible(false);
    }//GEN-LAST:event_DodajKierunekActionPerformed

    private void UsunActionPerformed(java.awt.event.ActionEvent evt) {
        sposobEdycji= new Usuwanie();
        notifyObservers();
        this.dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_UsunActionPerformed

    private void AnulujActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnulujActionPerformed
       this.dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_AnulujActionPerformed

    private void TabelaKierunkiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaKierunkiMousePressed
        DodajKierunek Okienkone =new DodajKierunek(kierunki,DodajWydzial.this);
       Okienkone.setVisible(true);
       Okienkone.setRow(TabelaKierunki.getSelectedRow());// TODO add your handling code here:
    }//GEN-LAST:event_TabelaKierunkiMousePressed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Anuluj;
    private javax.swing.JButton DodajKierunek;
    private javax.swing.JTextField Nazwa;
    private javax.swing.JTable TabelaKierunki;
    protected javax.swing.JButton Usun;
    private javax.swing.JButton Zapisz;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane11;
    // End of variables declaration//GEN-END:variables
}
