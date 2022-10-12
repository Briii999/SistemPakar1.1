/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.sikar.view;

import com.sikar.model.Aturan;
import com.sikar.dao.AturanDAO;
import com.sikar.dao.AturanDAOMySQL;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.List;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import java.sql.SQLException;
/**
 *
 * @author admin01
 */
public class TambahAturanFrame extends javax.swing.JFrame {
    private AturanDAO AturanDAO;
    private List<Aturan> recAturan = new ArrayList<Aturan>();
    private static final long serialVersionUID = 1L;
    /**
     * Creates new form TambahAturanFrame
     */
    public TambahAturanFrame() {
        initComponents();
        AturanDAO = new AturanDAOMySQL();
        initStatus();

        tabelAturan.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int row = tabelAturan.getSelectedRow();
                if (row != -1) {
                    textFill();
                }
            }
        });
    }

    public void loadAllAturan() {
        try {
            recAturan = AturanDAO.getAll();
        } catch (SQLException e) {
            Logger.getLogger(TambahAturanFrame.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    void tableFill() {
        Object data[][] = new Object[recAturan.size()][4];
        int x = 0, no = 1;
        for (Aturan a : recAturan) {
            data[x][0] = no++;
            data[x][1] = a.getKodeAturan();
            data[x][2] = a.getJika();
            data[x][3] = a.getMaka();
            x++;
        }
        String judul[] = {"No","Kode Aturan", "Jika", "Maka"};
        tabelAturan.setModel(new DefaultTableModel(data, judul));
    }

    public void textFill() {
        Aturan a = recAturan.get(tabelAturan.getSelectedRow());
        txtKodeAturan.setText(a.getKodeAturan());
        txtJika.setText(a.getJika());
        txtMaka.setText(a.getMaka());
    }

    public void clear() {
        txtKodeAturan.setText("");
        txtJika.setText("");
        txtMaka.setText("");
    }

    void initStatus() {
        clear();
        loadAllAturan();
        tableFill();
    }

    void refresh_page() {
        this.dispose();
        TambahAturanFrame f = new TambahAturanFrame();
        f.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgBlue = new javax.swing.JPanel();
        navbar = new javax.swing.JPanel();
        TambahAturan = new javax.swing.JLabel();
        btnKembali = new javax.swing.JButton();
        DataGejalaBox = new javax.swing.JPanel();
        DataAturan = new javax.swing.JLabel();
        txtKodeAturan = new javax.swing.JTextField();
        labelKodeAturan = new javax.swing.JLabel();
        labelJika = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        txtJika = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelAturan = new javax.swing.JTable();
        labelMaka = new javax.swing.JLabel();
        txtMaka = new javax.swing.JTextField();
        btnEdit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bgBlue.setBackground(new java.awt.Color(5, 101, 201));

        navbar.setBackground(new java.awt.Color(254, 254, 254));

        TambahAturan.setFont(new java.awt.Font("Nunito", 1, 14)); // NOI18N
        TambahAturan.setText("Tambah Aturan");

        btnKembali.setText("Kembali");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout navbarLayout = new javax.swing.GroupLayout(navbar);
        navbar.setLayout(navbarLayout);
        navbarLayout.setHorizontalGroup(
            navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navbarLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(TambahAturan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 408, Short.MAX_VALUE)
                .addComponent(btnKembali)
                .addGap(36, 36, 36))
        );
        navbarLayout.setVerticalGroup(
            navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navbarLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TambahAturan)
                    .addComponent(btnKembali))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        DataGejalaBox.setBackground(new java.awt.Color(254, 254, 254));

        DataAturan.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        DataAturan.setText("Data Aturan");

        labelKodeAturan.setFont(new java.awt.Font("Nunito", 0, 13)); // NOI18N
        labelKodeAturan.setText("Kode Aturan :");

        labelJika.setFont(new java.awt.Font("Nunito", 0, 13)); // NOI18N
        labelJika.setText("Jika :");

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        tabelAturan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tabelAturan);

        labelMaka.setFont(new java.awt.Font("Nunito", 0, 13)); // NOI18N
        labelMaka.setText("Maka :");

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DataGejalaBoxLayout = new javax.swing.GroupLayout(DataGejalaBox);
        DataGejalaBox.setLayout(DataGejalaBoxLayout);
        DataGejalaBoxLayout.setHorizontalGroup(
            DataGejalaBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DataGejalaBoxLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(DataGejalaBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DataGejalaBoxLayout.createSequentialGroup()
                        .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
                    .addGroup(DataGejalaBoxLayout.createSequentialGroup()
                        .addGroup(DataGejalaBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(DataGejalaBoxLayout.createSequentialGroup()
                                .addComponent(labelMaka)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtMaka, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(DataGejalaBoxLayout.createSequentialGroup()
                                .addComponent(labelKodeAturan)
                                .addGap(30, 30, 30)
                                .addComponent(txtKodeAturan, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, DataGejalaBoxLayout.createSequentialGroup()
                                .addComponent(labelJika)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtJika, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(DataAturan, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );
        DataGejalaBoxLayout.setVerticalGroup(
            DataGejalaBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DataGejalaBoxLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(DataAturan)
                .addGap(18, 18, 18)
                .addGroup(DataGejalaBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelKodeAturan)
                    .addComponent(txtKodeAturan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DataGejalaBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelJika)
                    .addComponent(txtJika, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DataGejalaBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMaka)
                    .addComponent(txtMaka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(DataGejalaBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout bgBlueLayout = new javax.swing.GroupLayout(bgBlue);
        bgBlue.setLayout(bgBlueLayout);
        bgBlueLayout.setHorizontalGroup(
            bgBlueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(navbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgBlueLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DataGejalaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bgBlueLayout.setVerticalGroup(
            bgBlueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgBlueLayout.createSequentialGroup()
                .addComponent(navbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(DataGejalaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgBlue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgBlue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        // TODO add your handling code here:
        this.dispose();
        AdminFrame f = new AdminFrame();
        f.setVisible(true);
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
        try {
            Aturan a = new Aturan();
            a.setKodeAturan(txtKodeAturan.getText());
            a.setJika(txtJika.getText());
            a.setMaka(txtMaka.getText());
            AturanDAO.insert(a);
            JOptionPane.showMessageDialog(null, "Berhasil, Data ditambahkan!");
            clear();
            refresh_page();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            Logger.getLogger(TambahAturanFrame.class.getName()).log(Level.SEVERE, null, e);
        } 
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        try {
            Aturan a = new Aturan();
            a.setKodeAturan(txtKodeAturan.getText());
            a.setJika(txtJika.getText());
            a.setMaka(txtMaka.getText());
            AturanDAO.update(a);
            JOptionPane.showMessageDialog(null, "Berhasil, Data diperbaharui!");
            clear();
            refresh_page();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            Logger.getLogger(TambahAturanFrame.class.getName()).log(Level.SEVERE, null, e);
        } 
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        try {
            JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin menghapus data?");
            Aturan a = recAturan.get(tabelAturan.getSelectedRow());
            AturanDAO.delete(a.getKodeAturan());
            JOptionPane.showMessageDialog(null, "Berhasil, Data dihapus!");
            refresh_page();
        } catch (SQLException e) {
            Logger.getLogger(TambahOrangFrame.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TambahAturanFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TambahAturanFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TambahAturanFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TambahAturanFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TambahAturanFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DataAturan;
    private javax.swing.JPanel DataGejalaBox;
    private javax.swing.JLabel TambahAturan;
    private javax.swing.JPanel bgBlue;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnTambah;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelJika;
    private javax.swing.JLabel labelKodeAturan;
    private javax.swing.JLabel labelMaka;
    private javax.swing.JPanel navbar;
    private javax.swing.JTable tabelAturan;
    private javax.swing.JTextField txtJika;
    private javax.swing.JTextField txtKodeAturan;
    private javax.swing.JTextField txtMaka;
    // End of variables declaration//GEN-END:variables
}