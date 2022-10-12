/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.sikar.view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin01
 */
public class DiagnosaFrame extends javax.swing.JFrame {

    /**
     * Creates new form DiagnosaFrame
     */
    public DiagnosaFrame() {
        initComponents();
    }

    void penyakitPage() {
        new PenyakitFrame().setVisible(true);
        dispose();
    }

    String checkDiagnosa() {
        String Rule_Gejala = null;
        if (Lemas.isSelected()&&Demam.isSelected()&&Mual.isSelected()&&Sesak.isSelected()&&Pusing.isSelected()&&Nyeri.isSelected()&&Pucat.isSelected()&&Batuk.isSelected()) {
            Rule_Gejala = "P52";
        } else if ((Lemas.isSelected()&&Demam.isSelected()&&Mual.isSelected())) {
            Rule_Gejala = "P01";
        } else if (Lemas.isSelected()&&Demam.isSelected()&&Batuk.isSelected()){
            Rule_Gejala = "P02";               
        } else if (Sesak.isSelected()&&Nyeri.isSelected()&&Batuk.isSelected()){
            Rule_Gejala = "P03";          
        } else if (Batuk.isSelected()&&Pusing.isSelected()&&Sesak.isSelected()) {
            Rule_Gejala = "P04";
        } else if (Batuk.isSelected()&&Sesak.isSelected()&&Demam.isSelected()) {
            Rule_Gejala = "P05";
        } else if (Batuk.isSelected()&&Demam.isSelected()&&Nyeri.isSelected()) {
            Rule_Gejala = "P06";
        } else if (Batuk.isSelected()&&Sesak.isSelected()) {
            Rule_Gejala = "P07";
        } else if (Batuk.isSelected()&&Sesak.isSelected()&&Pucat.isSelected()) {
            Rule_Gejala = "P08";
        } else if (Batuk.isSelected()&&Sesak.isSelected()&&Lemas.isSelected()) {
            Rule_Gejala = "P09";
        } else if (Sesak.isSelected()&&Batuk.isSelected()&&Mual.isSelected()) {
            Rule_Gejala = "P10";
        } else if ((Batuk.isSelected()&&Sesak.isSelected())&&Nyeri.isSelected()&&Pucat.isSelected()) {
            Rule_Gejala = "P11";
        } else if (Batuk.isSelected()&&Sesak.isSelected()&&Demam.isSelected()&&Pucat.isSelected()) {
            Rule_Gejala = "P12";
        } else if (Batuk.isSelected()&&Sesak.isSelected()&&Lemas.isSelected()&&Pucat.isSelected()) {
            Rule_Gejala = "P13";
        } else if (Demam.isSelected()&&Batuk.isSelected()&&Sesak.isSelected()&&Nyeri.isSelected()) {
            Rule_Gejala = "P14";
        } else if (Batuk.isSelected()&&Sesak.isSelected()) {
            Rule_Gejala = "P15";
        } else if (Batuk.isSelected()&&Sesak.isSelected()&&Nyeri.isSelected()&&Pusing.isSelected()) {
            Rule_Gejala = "P16";
        } else if (Batuk.isSelected()&&Demam.isSelected()&&Nyeri.isSelected()&&Sesak.isSelected()) {
            Rule_Gejala = "P17";
        } else if (Batuk.isSelected()&&Sesak.isSelected()&&Mual.isSelected()) {
            Rule_Gejala = "P18";
        } else if (Nyeri.isSelected()&&Pusing.isSelected()&&Batuk.isSelected()) {
            Rule_Gejala = "P19";
        } else if (Batuk.isSelected()&&Sesak.isSelected()&&Demam.isSelected()&&Pusing.isSelected()) {
            Rule_Gejala = "P20";
        } else if (Batuk.isSelected()&&Nyeri.isSelected()&&Pusing.isSelected()&&Mual.isSelected()) {
            Rule_Gejala = "P21";
        } else if (Sesak.isSelected()&&Demam.isSelected()&&Pucat.isSelected()&&Pusing.isSelected()) {
            Rule_Gejala = "P22";
        } else if (Batuk.isSelected()&&Sesak.isSelected()&&Demam.isSelected()&&Nyeri.isSelected()&&Mual.isSelected()) {
            Rule_Gejala = "P23";
        }  else if (Batuk.isSelected()&&Demam.isSelected()&&Nyeri.isSelected()&&Pusing.isSelected()&&Pucat.isSelected()) {
            Rule_Gejala = "P24";
        } else if (Batuk.isSelected()&&Demam.isSelected()&&Nyeri.isSelected()&&Mual.isSelected()&&Pucat.isSelected()) {
            Rule_Gejala = "P25";
        } else if (Batuk.isSelected()&&Demam.isSelected()&&Nyeri.isSelected()&&Sesak.isSelected()&&Mual.isSelected()&&Lemas.isSelected()) {
            Rule_Gejala = "P26";
        } else if (Batuk.isSelected()&&Demam.isSelected()&&Nyeri.isSelected()&&Sesak.isSelected()&&Mual.isSelected()&&Lemas.isSelected()&&Pusing.isSelected()) {
            Rule_Gejala = "P27";
        } else if (Batuk.isSelected()&&Demam.isSelected()&&Nyeri.isSelected()&&Sesak.isSelected()&&Mual.isSelected()&&Lemas.isSelected()&&Pucat.isSelected()) {
            Rule_Gejala = "P28";
        } else if (Batuk.isSelected()&&Demam.isSelected()&&Sesak.isSelected()&&Lemas.isSelected()) {
            Rule_Gejala = "P29";
        } else if (Lemas.isSelected()&&Sesak.isSelected()&&Pucat.isSelected()) {
            Rule_Gejala = "P30";
        } else if (Demam.isSelected()&&Sesak.isSelected()&&Batuk.isSelected()&&Pusing.isSelected()&&Nyeri.isSelected()) {
            Rule_Gejala = "P31";
        } else if (Demam.isSelected()&&Pusing.isSelected()&&Pucat.isSelected()&&Batuk.isSelected()&&Lemas.isSelected()&&Nyeri.isSelected()) {
            Rule_Gejala = "P32";
        } else if (Mual.isSelected()&&Pusing.isSelected()&&Pucat.isSelected()) {
            Rule_Gejala = "P33";
        } else if (Lemas.isSelected()&&Pucat.isSelected()&&Demam.isSelected()) {
            Rule_Gejala = "P34";
        } else if (Nyeri.isSelected()&&Pusing.isSelected()&&Mual.isSelected()) {
            Rule_Gejala = "P35";
        } else if (Pusing.isSelected()&&Lemas.isSelected()&&Pucat.isSelected()&&Sesak.isSelected()) {
            Rule_Gejala = "P36";
        } else if (Pusing.isSelected()&&Lemas.isSelected()&&Pucat.isSelected()&&Mual.isSelected()) {
            Rule_Gejala = "P37";
        } else if (Pusing.isSelected()&&Lemas.isSelected()) {
            Rule_Gejala = "P38";
        } else if (Pucat.isSelected()&&Batuk.isSelected()&&Sesak.isSelected()&&Mual.isSelected()) {
            Rule_Gejala = "P39";
        } else if (Mual.isSelected()&&Demam.isSelected()) {
            Rule_Gejala = "P40";
        } else if (Demam.isSelected()&&Sesak.isSelected()&&Mual.isSelected()&&Pucat.isSelected()) {
            Rule_Gejala = "P41";
        } else if (Demam.isSelected()&&Nyeri.isSelected()&&Mual.isSelected()) {
            Rule_Gejala = "P42";
        } else if (Mual.isSelected()&&Pusing.isSelected()&&Nyeri.isSelected()) {
            Rule_Gejala = "P43";
        } else if (Demam.isSelected()&&Lemas.isSelected()&&Pusing.isSelected()&&Sesak.isSelected()) {
            Rule_Gejala = "P44";
        } else if (Demam.isSelected()&&Lemas.isSelected()&&Pucat.isSelected()&&Pusing.isSelected()&Mual.isSelected()) {
            Rule_Gejala = "P45";
        } else if (Nyeri.isSelected()&&Sesak.isSelected()&&Lemas.isSelected()) {
            Rule_Gejala = "P46";
        } else if (Nyeri.isSelected()&&Demam.isSelected()&&Lemas.isSelected()&&Pusing.isSelected()) {
            Rule_Gejala = "P47";
        } else if (Nyeri.isSelected()&&Lemas.isSelected()) {
            Rule_Gejala = "P48";
        } else if (Mual.isSelected()&&Lemas.isSelected()&&Pusing.isSelected()&&Batuk.isSelected()) {
            Rule_Gejala = "P49";
        } else if (Mual.isSelected()&&Lemas.isSelected()&&Pusing.isSelected()&&Batuk.isSelected()&&Lemas.isSelected()&&Pucat.isSelected()) {
            Rule_Gejala = "P50";
        } else if (Demam.isSelected()&&Pusing.isSelected()&&Mual.isSelected()) {
            Rule_Gejala = "P51";
        } else{
            Rule_Gejala = "";

        } 
        return Rule_Gejala;
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
        Aturan = new javax.swing.JLabel();
        btnKembali = new javax.swing.JButton();
        DataPenyakitBox = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Lemas = new javax.swing.JRadioButton();
        Demam = new javax.swing.JRadioButton();
        Mual = new javax.swing.JRadioButton();
        Sesak = new javax.swing.JRadioButton();
        Pusing = new javax.swing.JRadioButton();
        Nyeri = new javax.swing.JRadioButton();
        Pucat = new javax.swing.JRadioButton();
        Batuk = new javax.swing.JRadioButton();
        btnDiagnosa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        j1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        j2 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bgBlue.setBackground(new java.awt.Color(5, 101, 201));

        navbar.setBackground(new java.awt.Color(254, 254, 254));

        Aturan.setFont(new java.awt.Font("Nunito", 1, 14)); // NOI18N
        Aturan.setText("Diagnosa");

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
                .addComponent(Aturan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1039, Short.MAX_VALUE)
                .addComponent(btnKembali)
                .addGap(36, 36, 36))
        );
        navbarLayout.setVerticalGroup(
            navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navbarLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Aturan)
                    .addComponent(btnKembali))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        DataPenyakitBox.setBackground(new java.awt.Color(254, 254, 254));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SILAKAN PILIH GEJALA YANG TERASA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(282, 282, 282))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        Lemas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Lemas.setText("Lemas / Lelah");
        Lemas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LemasActionPerformed(evt);
            }
        });

        Demam.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Demam.setText("Demam");
        Demam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DemamActionPerformed(evt);
            }
        });

        Mual.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Mual.setText("Mual/Muntah");
        Mual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MualActionPerformed(evt);
            }
        });

        Sesak.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Sesak.setText("Sesak Nafas");

        Pusing.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Pusing.setText("Pusing");

        Nyeri.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Nyeri.setText("Nyeri Otot/sendi");

        Pucat.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Pucat.setText("Kulit Pucat");
        Pucat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PucatActionPerformed(evt);
            }
        });

        Batuk.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Batuk.setText("Batuk");
        Batuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BatukActionPerformed(evt);
            }
        });

        btnDiagnosa.setBackground(new java.awt.Color(5, 101, 201));
        btnDiagnosa.setForeground(new java.awt.Color(254, 254, 254));
        btnDiagnosa.setText("Diagnosa");
        btnDiagnosa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagnosaActionPerformed(evt);
            }
        });

        j1.setColumns(20);
        j1.setLineWrap(true);
        j1.setRows(5);
        jScrollPane1.setViewportView(j1);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Kode Penyakit", "Nama Penyakit", "Deskripsi Penyakit", "Solusi"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        j2.setColumns(20);
        j2.setLineWrap(true);
        j2.setRows(5);
        jScrollPane3.setViewportView(j2);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Deskripsi Penyakit");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Solusi");

        javax.swing.GroupLayout DataPenyakitBoxLayout = new javax.swing.GroupLayout(DataPenyakitBox);
        DataPenyakitBox.setLayout(DataPenyakitBoxLayout);
        DataPenyakitBoxLayout.setHorizontalGroup(
            DataPenyakitBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(DataPenyakitBoxLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(DataPenyakitBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(DataPenyakitBoxLayout.createSequentialGroup()
                        .addGroup(DataPenyakitBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DataPenyakitBoxLayout.createSequentialGroup()
                                .addGroup(DataPenyakitBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Lemas)
                                    .addComponent(Sesak))
                                .addGap(18, 18, 18)
                                .addGroup(DataPenyakitBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Demam)
                                    .addComponent(Pusing))
                                .addGroup(DataPenyakitBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(DataPenyakitBoxLayout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(Mual)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DataPenyakitBoxLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                                        .addComponent(Nyeri)
                                        .addGap(18, 18, 18))))
                            .addGroup(DataPenyakitBoxLayout.createSequentialGroup()
                                .addGroup(DataPenyakitBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnDiagnosa, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(DataPenyakitBoxLayout.createSequentialGroup()
                                        .addComponent(Pucat)
                                        .addGap(43, 43, 43)
                                        .addComponent(Batuk)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(DataPenyakitBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addGap(30, 30, 30))
        );
        DataPenyakitBoxLayout.setVerticalGroup(
            DataPenyakitBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DataPenyakitBoxLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DataPenyakitBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DataPenyakitBoxLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addComponent(Lemas)
                    .addComponent(Mual)
                    .addGroup(DataPenyakitBoxLayout.createSequentialGroup()
                        .addComponent(Demam)
                        .addGap(44, 44, 44)
                        .addGroup(DataPenyakitBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Pusing)
                            .addComponent(Sesak)
                            .addComponent(Nyeri))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DataPenyakitBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(DataPenyakitBoxLayout.createSequentialGroup()
                        .addGroup(DataPenyakitBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Pucat)
                            .addComponent(Batuk))
                        .addGap(22, 22, 22)
                        .addComponent(btnDiagnosa, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout bgBlueLayout = new javax.swing.GroupLayout(bgBlue);
        bgBlue.setLayout(bgBlueLayout);
        bgBlueLayout.setHorizontalGroup(
            bgBlueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(navbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgBlueLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DataPenyakitBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
        bgBlueLayout.setVerticalGroup(
            bgBlueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgBlueLayout.createSequentialGroup()
                .addComponent(navbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(DataPenyakitBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgBlue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bgBlue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        // TODO add your handling code here:
        this.dispose();
        UserFrame f = new UserFrame();
        f.setVisible(true);
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void btnDiagnosaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagnosaActionPerformed
        // TODO add your handling code here:
         try {
        String sql ="SELECT * FROM penyakit WHERE kode_penyakit = '"+checkDiagnosa()+"'";
        java.sql.Connection conn =(java.sql.Connection)com.sikar.database.DatabaseMySQL.connectDB();
        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
        java.sql.ResultSet rs=pst.executeQuery(sql);
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        String [] data = new String[10];
        
            if(rs.next()){
                JOptionPane.showMessageDialog(this, "Hasil Diagnosa : "+rs.getString(2));
                data[0] = rs.getString(1);
                data[1] = rs.getString(2);
                data[2] = rs.getString(3);
                data[3] = rs.getString(4);
                
                dtm.addRow(data);
                j1.setText(rs.getString("deskripsi_penyakit"));     
                j2.setText(rs.getString("solusi"));     

        }else{
            JOptionPane.showMessageDialog(this, "Penyakit Tidak Ditemukan");
        }
    } catch (Exception e) {
         JOptionPane.showMessageDialog(this, e.getMessage());
    }//GEN-LAST:event_btnDiagnosaActionPerformed
         
    }
    
    private void MualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MualActionPerformed

    private void PucatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PucatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PucatActionPerformed

    private void LemasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LemasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LemasActionPerformed

    private void DemamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DemamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DemamActionPerformed

    private void BatukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BatukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BatukActionPerformed

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
            java.util.logging.Logger.getLogger(DiagnosaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DiagnosaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DiagnosaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DiagnosaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DiagnosaFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Aturan;
    private javax.swing.JRadioButton Batuk;
    private javax.swing.JPanel DataPenyakitBox;
    private javax.swing.JRadioButton Demam;
    private javax.swing.JRadioButton Lemas;
    private javax.swing.JRadioButton Mual;
    private javax.swing.JRadioButton Nyeri;
    private javax.swing.JRadioButton Pucat;
    private javax.swing.JRadioButton Pusing;
    private javax.swing.JRadioButton Sesak;
    private javax.swing.JPanel bgBlue;
    private javax.swing.JButton btnDiagnosa;
    private javax.swing.JButton btnKembali;
    private javax.swing.JTextArea j1;
    private javax.swing.JTextArea j2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel navbar;
    // End of variables declaration//GEN-END:variables
}
