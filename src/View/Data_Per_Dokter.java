/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.SimpleDateFormat;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author ASUS
 */
public class Data_Per_Dokter extends javax.swing.JFrame {

    /**
     * Creates new form Data_Per_Dokter
     */
    public Data_Per_Dokter() {
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

        JLjudul = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        JLDokter = new javax.swing.JLabel();
        JLnama = new javax.swing.JLabel();
        JLNip = new javax.swing.JLabel();
        JLTglLahir = new javax.swing.JLabel();
        JLalamat = new javax.swing.JLabel();
        JLjenisKelamin = new javax.swing.JLabel();
        txNamaDokter = new javax.swing.JTextField();
        txNIP = new javax.swing.JTextField();
        txAlamat = new javax.swing.JTextField();
        txJK = new javax.swing.JTextField();
        txIdDokter = new javax.swing.JTextField();
        txTGL = new de.wannawork.jcalendar.JCalendarComboBox();
        jPanel2 = new javax.swing.JPanel();
        JLspesialis = new javax.swing.JLabel();
        JLPasien = new javax.swing.JLabel();
        JLjumlahPasien = new javax.swing.JLabel();
        txSpesialis = new javax.swing.JTextField();
        txJumPasien = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaPasien = new javax.swing.JTextArea();
        btnKembali = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JLjudul.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JLjudul.setText("RUMAH SAKIT KURNIAWAN");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Data Dokter"));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        JLDokter.setText("ID Dokter");

        JLnama.setText("Nama");

        JLNip.setText("NIP  ");

        JLTglLahir.setText(" Tgl Lahir");

        JLalamat.setText("Alamat");

        JLjenisKelamin.setText("Jenis Kelamin");

        txNamaDokter.setEditable(false);
        txNamaDokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txNamaDokterActionPerformed(evt);
            }
        });

        txNIP.setEditable(false);
        txNIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txNIPActionPerformed(evt);
            }
        });

        txAlamat.setEditable(false);
        txAlamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txAlamatActionPerformed(evt);
            }
        });

        txJK.setEditable(false);
        txJK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txJKActionPerformed(evt);
            }
        });

        txIdDokter.setEditable(false);
        txIdDokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txIdDokterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JLjenisKelamin)
                        .addGap(18, 18, 18)
                        .addComponent(txJK, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLTglLahir)
                            .addComponent(JLalamat)
                            .addComponent(JLNip)
                            .addComponent(JLnama)
                            .addComponent(JLDokter))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txIdDokter, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txNamaDokter)
                            .addComponent(txNIP)
                            .addComponent(txAlamat)
                            .addComponent(txTGL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLDokter)
                    .addComponent(txIdDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLnama)
                    .addComponent(txNamaDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txNIP, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLNip, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JLTglLahir)
                    .addComponent(txTGL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLalamat, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLjenisKelamin, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txJK, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        JLspesialis.setText("Spesialis              :");

        JLPasien.setText("Pasien                 :");

        JLjumlahPasien.setText("Jumlah Pasien     :");

        txSpesialis.setEditable(false);
        txSpesialis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txSpesialisActionPerformed(evt);
            }
        });

        txJumPasien.setEditable(false);
        txJumPasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txJumPasienActionPerformed(evt);
            }
        });

        txaPasien.setEditable(false);
        txaPasien.setColumns(20);
        txaPasien.setRows(5);
        jScrollPane1.setViewportView(txaPasien);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(JLPasien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JLspesialis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txSpesialis, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(JLjumlahPasien)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txJumPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLspesialis)
                    .addComponent(txSpesialis, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLPasien)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLjumlahPasien)
                    .addComponent(txJumPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(102, 102, 102))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(199, 199, 199))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnKembali.setText("Kembali");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        btnLogOut.setText("LogOut");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnKembali)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnLogOut)
                                    .addComponent(JLjudul))
                                .addGap(9, 9, 9)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLjudul)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogOut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnKembali)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txIdDokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txIdDokterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txIdDokterActionPerformed

    private void txNamaDokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txNamaDokterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txNamaDokterActionPerformed

    private void txNIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txNIPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txNIPActionPerformed

    private void txSpesialisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txSpesialisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txSpesialisActionPerformed

    private void txAlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txAlamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txAlamatActionPerformed

    private void txJKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txJKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txJKActionPerformed

    private void txJumPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txJumPasienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txJumPasienActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnKembaliActionPerformed

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
            java.util.logging.Logger.getLogger(Data_Per_Dokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Data_Per_Dokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Data_Per_Dokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Data_Per_Dokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Data_Per_Dokter().setVisible(true);
            }
        });
    }
    public Object getBtnKembali() {
        return btnKembali;
    }
    public String getID(){
        return txIdDokter.getText();
    }
    public String getNama(){
        return txNamaDokter.getName();
    }
    public String getNIP(){
        return txNIP.getText();
    }
    public String getTxTGL() {
         String tgl;
        SimpleDateFormat Format = new SimpleDateFormat("dd - MM - yyyy");
        tgl = Format.format(txTGL.getDate());
        return tgl;
    }

    public void setTxTGL(Date txTGL) {
        this.txTGL.setDate(txTGL);
    
    }
    public String getAlamat(){
        return txAlamat.getText();
    }
    
    public String getTxJK() {
        return txJK.getText();
    }
   
    public void setTxJK(String txJK) {
        this.txJK.setText(txJK);
        //this.txjenisKelamin.setText(txjenisKelamin) ;
    }
    
    public int getJumPasien(){
        return Integer.parseInt(txJumPasien.getText());
    }

    public Object getBtnLogOut() {
        return btnLogOut;
    }

    public String getTxAlamat() {
        return txAlamat.getText();
    }

    public void setTxAlamat(String txAlamat) {
        this.txAlamat.setText(txAlamat);
    }

    public String getTxIdDokter() {
        return txIdDokter.getText();
    }

    public void setTxIdDokter(String txIdDokter) {
        this.txIdDokter.setText(txIdDokter);
    }

    public int getTxJumPasien() {
        return Integer.parseInt(txJumPasien.getText());
    }

    public void setTxJumPasien(int txJumPasien) {
        this.txJumPasien.setText(String.valueOf(txJumPasien));
    }

    public String getTxNIP() {
        return txNIP.getText();
    }

    public void setTxNIP(String txNIP) {
        this.txNIP.setText(txNIP);
    }

    public String getTxSpesialis() {
        return txSpesialis.getText();
    }

    public void setTxSpesialis(String txSpesialis) {
        this.txSpesialis.setText(txSpesialis);
    }

    public String getTxaPasien() {
        return txaPasien.getText();
    }

    public void setTxaPasien(String txaPasien) {
        this.txaPasien.setText(txaPasien);
    }

    public String getTxNamaDokter() {
        return txNamaDokter.getText();
    }

    public void setTxNamaDokter(String txNamaDokter) {
        this.txNamaDokter.setText(txNamaDokter);
    }
    
    public void addActionListener(ActionListener e){
        btnKembali.addActionListener(e);
        btnLogOut.addActionListener(e);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLDokter;
    private javax.swing.JLabel JLNip;
    private javax.swing.JLabel JLPasien;
    private javax.swing.JLabel JLTglLahir;
    private javax.swing.JLabel JLalamat;
    private javax.swing.JLabel JLjenisKelamin;
    private javax.swing.JLabel JLjudul;
    private javax.swing.JLabel JLjumlahPasien;
    private javax.swing.JLabel JLnama;
    private javax.swing.JLabel JLspesialis;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txAlamat;
    private javax.swing.JTextField txIdDokter;
    private javax.swing.JTextField txJK;
    private javax.swing.JTextField txJumPasien;
    private javax.swing.JTextField txNIP;
    private javax.swing.JTextField txNamaDokter;
    private javax.swing.JTextField txSpesialis;
    private de.wannawork.jcalendar.JCalendarComboBox txTGL;
    private javax.swing.JTextArea txaPasien;
    // End of variables declaration//GEN-END:variables
}
