/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;

import javax.swing.JOptionPane;

/**
 *
 * @author H4NS
 */
public class praktikum extends javax.swing.JFrame {

    /**
     * Creates new form Uji_Boleh_1
     */
    public praktikum() {
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

        Campur = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        Judul = new javax.swing.JLabel();
        Nama = new javax.swing.JLabel();
        Tinggi = new javax.swing.JLabel();
        BB = new javax.swing.JLabel();
        JK = new javax.swing.JLabel();
        TNama = new javax.swing.JTextField();
        Cm = new javax.swing.JLabel();
        Kg = new javax.swing.JLabel();
        TTinggi = new javax.swing.JTextField();
        TBB = new javax.swing.JTextField();
        RDB1 = new javax.swing.JRadioButton();
        RDB2 = new javax.swing.JRadioButton();
        HITUNG = new javax.swing.JButton();
        Cobal = new javax.swing.JButton();
        Keluar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        TF1 = new javax.swing.JTextField();
        KgID = new javax.swing.JLabel();
        Diagnosa = new javax.swing.JLabel();
        TFHasil1 = new javax.swing.JTextField();
        TFHasil2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 102, 0));

        Judul.setFont(new java.awt.Font("Monospaced", 3, 27)); // NOI18N
        Judul.setForeground(new java.awt.Color(255, 255, 255));
        Judul.setText("Cek Kesehatan Tubuh Anda");

        Nama.setFont(new java.awt.Font("Monospaced", 3, 16)); // NOI18N
        Nama.setForeground(new java.awt.Color(255, 255, 255));
        Nama.setText("Nama");

        Tinggi.setFont(new java.awt.Font("Monospaced", 3, 16)); // NOI18N
        Tinggi.setForeground(new java.awt.Color(255, 255, 255));
        Tinggi.setText("Tinggi");

        BB.setFont(new java.awt.Font("Monospaced", 3, 16)); // NOI18N
        BB.setForeground(new java.awt.Color(255, 255, 255));
        BB.setText("Berat Badan");

        JK.setFont(new java.awt.Font("Monospaced", 3, 16)); // NOI18N
        JK.setForeground(new java.awt.Color(255, 255, 255));
        JK.setText("Jenis Kelamin");

        TNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TNamaActionPerformed(evt);
            }
        });

        Cm.setFont(new java.awt.Font("Monospaced", 3, 16)); // NOI18N
        Cm.setForeground(new java.awt.Color(255, 255, 255));
        Cm.setText("Cm");

        Kg.setFont(new java.awt.Font("Monospaced", 3, 16)); // NOI18N
        Kg.setForeground(new java.awt.Color(255, 255, 255));
        Kg.setText("Kg");

        Campur.add(RDB1);
        RDB1.setText("Laki-Laki");

        Campur.add(RDB2);
        RDB2.setText("Perempuan");
        RDB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RDB2ActionPerformed(evt);
            }
        });

        HITUNG.setBackground(new java.awt.Color(255, 0, 0));
        HITUNG.setFont(new java.awt.Font("Monospaced", 3, 16)); // NOI18N
        HITUNG.setForeground(new java.awt.Color(255, 255, 255));
        HITUNG.setText("HITUNG");
        HITUNG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HITUNGActionPerformed(evt);
            }
        });

        Cobal.setBackground(new java.awt.Color(255, 0, 0));
        Cobal.setFont(new java.awt.Font("Monospaced", 3, 16)); // NOI18N
        Cobal.setForeground(new java.awt.Color(255, 255, 255));
        Cobal.setText("Coba Lagi");
        Cobal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CobalActionPerformed(evt);
            }
        });

        Keluar.setBackground(new java.awt.Color(255, 0, 0));
        Keluar.setFont(new java.awt.Font("Monospaced", 3, 16)); // NOI18N
        Keluar.setForeground(new java.awt.Color(255, 255, 255));
        Keluar.setText("Keluar");
        Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Monospaced", 3, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Berat Badan Ideal Anda Adalah");

        KgID.setFont(new java.awt.Font("Monospaced", 3, 16)); // NOI18N
        KgID.setForeground(new java.awt.Color(255, 255, 255));
        KgID.setText("Kg");

        Diagnosa.setFont(new java.awt.Font("Monospaced", 3, 16)); // NOI18N
        Diagnosa.setForeground(new java.awt.Color(255, 255, 255));
        Diagnosa.setText("Hasil Diagnosa Kesehatan");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Judul)
                .addGap(133, 133, 133))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BB)
                                .addGap(18, 18, 18)
                                .addComponent(TBB, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Kg))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Tinggi)
                                .addGap(40, 40, 40)
                                .addComponent(TTinggi, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Cm))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(JK)
                                .addGap(18, 18, 18)
                                .addComponent(RDB1)
                                .addGap(31, 31, 31)
                                .addComponent(RDB2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Nama)
                                .addGap(60, 60, 60)
                                .addComponent(TNama, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(HITUNG)
                        .addGap(18, 18, 18)
                        .addComponent(Cobal)
                        .addGap(18, 18, 18)
                        .addComponent(Keluar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TFHasil1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFHasil2, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(157, 157, 157)
                                .addComponent(Diagnosa))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TF1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(KgID)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(Judul)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nama)
                    .addComponent(TNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tinggi)
                    .addComponent(Cm)
                    .addComponent(TTinggi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BB)
                    .addComponent(TBB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Kg))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JK)
                    .addComponent(RDB1)
                    .addComponent(RDB2))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HITUNG)
                    .addComponent(Cobal)
                    .addComponent(Keluar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KgID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(Diagnosa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TFHasil1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TFHasil2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 660, 620);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TNamaActionPerformed

    private void RDB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RDB2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RDB2ActionPerformed

    private void KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_KeluarActionPerformed

    private void HITUNGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HITUNGActionPerformed
        // TODO add your handling code here:
        if (TNama.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "No data entered");
        }else if (TTinggi.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "No data entered");
        }else if (TTinggi.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "No data entered");
        } else if (TBB.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "No data entered");
        } else {

        }
        double Tinggi = Double.valueOf(TTinggi.getText());
        double BB = Double.valueOf(TBB.getText());
        double h1 = 0;
        if (RDB1.isSelected()) {
            h1 = (Tinggi - 100) * 1;
        } else if (RDB2.isSelected()) {
            h1 = (Tinggi - 104) * 1;
        }
        String temp = Double.toString(h1);
        if (h1 < Tinggi) {
            TF1.setText(temp);
            TFHasil1.setText("Maaf : " + TNama.getText() + " , Sepertiya anda Overweight :( ");
            TFHasil2.setText("Banyaklah Berolahraga dan Hindari Makanan Berkolesterol");
        } else if (h1 > Tinggi) {
            TF1.setText(temp);
            TFHasil1.setText("Maaf : " + TNama.getText() + " , Sepertiya anda Underweight :( ");
            TFHasil2.setText("Banyaklah Mengkonsumsi Makanan yang Berkarbohidrat");
        } else {
            TF1.setText(temp);
            TFHasil1.setText("Maaf : " + TNama.getText() + " , Berat Badn Anda Sudah Ideal :) ");
            TFHasil2.setText("Lanjutkan pola Makan Teratur dan Gaya  Hidup Sehat :) ");
        }

    }//GEN-LAST:event_HITUNGActionPerformed

    private void CobalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CobalActionPerformed
        TTinggi.setText("");
        TNama.setText("");
        TBB.setText("");
        Campur.clearSelection();

    }//GEN-LAST:event_CobalActionPerformed

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
            java.util.logging.Logger.getLogger(praktikum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(praktikum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(praktikum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(praktikum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new praktikum().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BB;
    private javax.swing.ButtonGroup Campur;
    private javax.swing.JLabel Cm;
    private javax.swing.JButton Cobal;
    private javax.swing.JLabel Diagnosa;
    private javax.swing.JButton HITUNG;
    private javax.swing.JLabel JK;
    private javax.swing.JLabel Judul;
    private javax.swing.JButton Keluar;
    private javax.swing.JLabel Kg;
    private javax.swing.JLabel KgID;
    private javax.swing.JLabel Nama;
    private javax.swing.JRadioButton RDB1;
    private javax.swing.JRadioButton RDB2;
    private javax.swing.JTextField TBB;
    private javax.swing.JTextField TF1;
    private javax.swing.JTextField TFHasil1;
    private javax.swing.JTextField TFHasil2;
    private javax.swing.JTextField TNama;
    private javax.swing.JTextField TTinggi;
    private javax.swing.JLabel Tinggi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
