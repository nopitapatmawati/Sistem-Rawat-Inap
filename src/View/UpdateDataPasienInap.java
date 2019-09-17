package View;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class UpdateDataPasienInap extends javax.swing.JFrame {

    /**
     * Creates new form UpdateDataPasienInap
     */
    public UpdateDataPasienInap() {
        initComponents();
    }
    
    public void reset(){
        setTxIdPasien("");
    }

    public Object getBtnCari() {
        return btnCari;
    }

    public Object getBtnKembali() {
        return btnKembali;
    }

    public Object getBtnLogout() {
        return btnLogout;
    }

    public Object getBtnSimpan() {
        return btnSimpan;
    }

    public String getTxDiagnosa() {
        return txDiagnosa.getText();
    }

    public void setTxDiagnosa(String txDiagnosa) {
        this.txDiagnosa.setText(txDiagnosa);
    }

    public String getTxDokter() {
        return txDokter.getText();
    }

    public void setTxDokter(String txDokter) {
        this.txDokter.setText(txDokter);
    }

    public String getTxIdPasien() {
        return txIdPasien.getText();
    }

    public void setTxIdPasien(String txIdPasien) {
        this.txIdPasien.setText(txIdPasien);
    }

    public String getTxNama() {
        return txNama.getText();
    }

    public void setTxNama(String txNama) {
        this.txNama.setText(txNama);
    }

    public String getTxPetugas() {
        return txPetugas.getText();
    }

    public void setTxPetugas(String txPetugas) {
        this.txPetugas.setText(txPetugas);
    }

    public String getTxRuangan() {
        return txRuangan.getText();
    }

    public void setTxRuangan(String txRuangan) {
        this.txRuangan.setText(txRuangan);
    }
    
    public void addActionListener(ActionListener e){
        btnLogout.addActionListener(e);
        btnKembali.addActionListener(e);
        btnSimpan.addActionListener(e);
        btnCari.addActionListener(e);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPUpdate = new javax.swing.JPanel();
        JPcariIDpasien = new javax.swing.JPanel();
        JLIdPasien = new javax.swing.JLabel();
        txIdPasien = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        JLnama = new javax.swing.JLabel();
        txNama = new javax.swing.JTextField();
        JLdokter = new javax.swing.JLabel();
        txDokter = new javax.swing.JTextField();
        JLDiagnosa = new javax.swing.JLabel();
        txDiagnosa = new javax.swing.JTextField();
        JLRuangan = new javax.swing.JLabel();
        txRuangan = new javax.swing.JTextField();
        JLPetugas = new javax.swing.JLabel();
        txPetugas = new javax.swing.JTextField();
        JLrs = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JButton();
        btnKembali = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JPUpdate.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Update Data Pasien", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        JPcariIDpasien.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        JLIdPasien.setText("ID Pasien :");

        btnCari.setText("Cari");

        javax.swing.GroupLayout JPcariIDpasienLayout = new javax.swing.GroupLayout(JPcariIDpasien);
        JPcariIDpasien.setLayout(JPcariIDpasienLayout);
        JPcariIDpasienLayout.setHorizontalGroup(
            JPcariIDpasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPcariIDpasienLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPcariIDpasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCari)
                    .addGroup(JPcariIDpasienLayout.createSequentialGroup()
                        .addComponent(JLIdPasien)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txIdPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPcariIDpasienLayout.setVerticalGroup(
            JPcariIDpasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPcariIDpasienLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPcariIDpasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLIdPasien)
                    .addComponent(txIdPasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCari)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        JLnama.setText("Nama      :");

        txNama.setEditable(false);

        JLdokter.setText("Dokter    :");

        txDokter.setEditable(false);

        JLDiagnosa.setText("Diagnosa :");

        JLRuangan.setText("Ruangan :");

        txRuangan.setEditable(false);

        JLPetugas.setText("Petugas  :");

        txPetugas.setEditable(false);

        javax.swing.GroupLayout JPUpdateLayout = new javax.swing.GroupLayout(JPUpdate);
        JPUpdate.setLayout(JPUpdateLayout);
        JPUpdateLayout.setHorizontalGroup(
            JPUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPUpdateLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(JPUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JPcariIDpasien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPUpdateLayout.createSequentialGroup()
                        .addGroup(JPUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JLdokter)
                            .addComponent(JLnama)
                            .addComponent(JLDiagnosa))
                        .addGap(18, 18, 18)
                        .addGroup(JPUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txNama, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txDiagnosa, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPUpdateLayout.createSequentialGroup()
                        .addGroup(JPUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JLPetugas)
                            .addComponent(JLRuangan))
                        .addGap(18, 18, 18)
                        .addGroup(JPUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txRuangan, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        JPUpdateLayout.setVerticalGroup(
            JPUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPUpdateLayout.createSequentialGroup()
                .addComponent(JPcariIDpasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLnama))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLdokter)
                    .addComponent(txDokter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLDiagnosa)
                    .addComponent(txDiagnosa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txRuangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLRuangan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLPetugas)
                    .addComponent(txPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JLrs.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JLrs.setText("Rumah Sakit Kurniawan");

        btnSimpan.setText("Simpan");

        btnKembali.setText("Kembali");

        btnLogout.setText("Logout");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnKembali)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSimpan)
                                .addGap(20, 20, 20))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(JLrs)
                                .addGap(33, 33, 33))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnLogout)
                            .addComponent(JPUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(18, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLrs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JPUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKembali)
                    .addComponent(btnSimpan))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(UpdateDataPasienInap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateDataPasienInap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateDataPasienInap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateDataPasienInap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateDataPasienInap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLDiagnosa;
    private javax.swing.JLabel JLIdPasien;
    private javax.swing.JLabel JLPetugas;
    private javax.swing.JLabel JLRuangan;
    private javax.swing.JLabel JLdokter;
    private javax.swing.JLabel JLnama;
    private javax.swing.JLabel JLrs;
    private javax.swing.JPanel JPUpdate;
    private javax.swing.JPanel JPcariIDpasien;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JTextField txDiagnosa;
    private javax.swing.JTextField txDokter;
    private javax.swing.JTextField txIdPasien;
    private javax.swing.JTextField txNama;
    private javax.swing.JTextField txPetugas;
    private javax.swing.JTextField txRuangan;
    // End of variables declaration//GEN-END:variables
}