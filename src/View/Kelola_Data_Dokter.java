/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author ACER
 */
public class Kelola_Data_Dokter extends javax.swing.JFrame {

    /**
     * Creates new form Kelola_Data_Dokter
     */
    public Kelola_Data_Dokter() {
        initComponents();
    }

    public Object getBtnHapusDataDokter() {
        return btnHapusDataDokter;
    }

    public Object getBtnKembali() {
        return btnKembali;
    }

    public Object getBtnLihatDataDokter() {
        return btnLihatDataDokter;
    }

    public Object getBtnRegisDokter() {
        return btnRegisDokter;
    }

    public Object getBtnUbahDataDokter() {
        return btnUbahDataDokter;
    }

    public Object getBtnLogout() {
        return btnLogout;
    }

    public String getTxIdPetugas() {
        return txIdPetugas.getText();
    }

    public void setTxIdPetugas(String txIdPetugas) {
        this.txIdPetugas.setText(txIdPetugas);
    }
    
    public void addActionListener(ActionListener e){
        btnKembali.addActionListener(e);
        btnLogout.addActionListener(e);
        btnHapusDataDokter.addActionListener(e);
        btnLihatDataDokter.addActionListener(e);
        btnRegisDokter.addActionListener(e);
        btnUbahDataDokter.addActionListener(e);
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
        jPanel1 = new javax.swing.JPanel();
        btnRegisDokter = new javax.swing.JButton();
        btnUbahDataDokter = new javax.swing.JButton();
        btnHapusDataDokter = new javax.swing.JButton();
        btnLihatDataDokter = new javax.swing.JButton();
        JLIdPetugas = new javax.swing.JLabel();
        txIdPetugas = new javax.swing.JTextField();
        btnKembali = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JLjudul.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JLjudul.setText("RUMAH SAKIT KURNIAWAN");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Kelola Data Dokter"));

        btnRegisDokter.setText("Registrasi Dokter");

        btnUbahDataDokter.setText("Ubah Data Dokter");

        btnHapusDataDokter.setText("Hapus Data Dokter");

        btnLihatDataDokter.setText("Lihat Data Dokter");

        JLIdPetugas.setText("ID Petugas anda :");

        txIdPetugas.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLihatDataDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUbahDataDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegisDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHapusDataDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(JLIdPetugas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txIdPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txIdPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLIdPetugas))
                .addGap(18, 18, 18)
                .addComponent(btnRegisDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUbahDataDokter)
                .addGap(4, 4, 4)
                .addComponent(btnHapusDataDokter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLihatDataDokter)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        btnKembali.setText("Kembali");

        btnLogout.setText("LogOut");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JLjudul))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnKembali)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLogout))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(JLjudul, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLogout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnKembali)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLIdPetugas;
    private javax.swing.JLabel JLjudul;
    private javax.swing.JButton btnHapusDataDokter;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnLihatDataDokter;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnRegisDokter;
    private javax.swing.JButton btnUbahDataDokter;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txIdPetugas;
    // End of variables declaration//GEN-END:variables
}
