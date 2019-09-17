package View;

import java.awt.event.ActionListener;
import javax.swing.JButton;
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
public class RegistrasiPasienInap extends javax.swing.JFrame {

    /**
     * Creates new form RegistrasiPasienInap
     */
    
    public void setTxNama(String txNama) {
        this.txNama.setText(txNama);
    }

    public String getTxNama() {
        return txNama.getText();
    }
    
    public RegistrasiPasienInap() {
        initComponents();
    }

    public Object getBtnKembali() {
        return btnKembali;
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
        return txIDPasien.getText();
    }

    public void setTxIdPasien(String txIdPasien) {
        this.txIDPasien.setText(txIdPasien);
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

    public Object getBtnLogout() {
        return btnLogout;
    }
    
    public void addActionListener(ActionListener e){
        btnKembali.addActionListener(e);
        btnSimpan.addActionListener(e);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLNamaRS = new javax.swing.JLabel();
        JPRegisPasien = new javax.swing.JPanel();
        JLRPINama = new javax.swing.JLabel();
        JLRPIIdPasien = new javax.swing.JLabel();
        JLRPIDokter = new javax.swing.JLabel();
        JLRPIDiagnosa = new javax.swing.JLabel();
        txNama = new javax.swing.JTextField();
        txIDPasien = new javax.swing.JTextField();
        txDokter = new javax.swing.JTextField();
        txDiagnosa = new javax.swing.JTextField();
        JLRPIPetugas = new javax.swing.JLabel();
        JLRPIRuangan = new javax.swing.JLabel();
        txRuangan = new javax.swing.JTextField();
        txPetugas = new javax.swing.JTextField();
        btnKembali = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JLNamaRS.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JLNamaRS.setText("Rumah Sakit Kurniawan");

        JPRegisPasien.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Registrasi Pasien Inap"));

        JLRPINama.setText("Nama         :");

        JLRPIIdPasien.setText("ID Pasien   :");

        JLRPIDokter.setText("Dokter       :");

        JLRPIDiagnosa.setText("Diagnosa   :");

        JLRPIPetugas.setText("Petugas    :");

        JLRPIRuangan.setText("Ruangan   :");

        txPetugas.setEditable(false);

        javax.swing.GroupLayout JPRegisPasienLayout = new javax.swing.GroupLayout(JPRegisPasien);
        JPRegisPasien.setLayout(JPRegisPasienLayout);
        JPRegisPasienLayout.setHorizontalGroup(
            JPRegisPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPRegisPasienLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(JPRegisPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPRegisPasienLayout.createSequentialGroup()
                        .addGroup(JPRegisPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JLRPIIdPasien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JLRPINama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(JPRegisPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txNama, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txIDPasien)))
                    .addGroup(JPRegisPasienLayout.createSequentialGroup()
                        .addGroup(JPRegisPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPRegisPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(JLRPIDokter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JLRPIDiagnosa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(JLRPIRuangan)
                            .addComponent(JLRPIPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JPRegisPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txRuangan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txDiagnosa, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txDokter)
                            .addComponent(txPetugas))))
                .addGap(20, 20, 20))
        );
        JPRegisPasienLayout.setVerticalGroup(
            JPRegisPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPRegisPasienLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPRegisPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLRPINama)
                    .addComponent(txNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPRegisPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLRPIIdPasien)
                    .addComponent(txIDPasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPRegisPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLRPIDokter)
                    .addComponent(txDokter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPRegisPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txDiagnosa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLRPIDiagnosa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPRegisPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLRPIRuangan)
                    .addComponent(txRuangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPRegisPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLRPIPetugas)
                    .addComponent(txPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnKembali.setText("Kembali");

        btnSimpan.setText("Simpan");

        btnLogout.setText("Logout");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnKembali)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSimpan)
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnLogout)
                            .addComponent(JPRegisPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(JLNamaRS)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(JLNamaRS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JPRegisPasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan)
                    .addComponent(btnKembali))
                .addContainerGap(17, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(RegistrasiPasienInap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrasiPasienInap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrasiPasienInap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrasiPasienInap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrasiPasienInap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLNamaRS;
    private javax.swing.JLabel JLRPIDiagnosa;
    private javax.swing.JLabel JLRPIDokter;
    private javax.swing.JLabel JLRPIIdPasien;
    private javax.swing.JLabel JLRPINama;
    private javax.swing.JLabel JLRPIPetugas;
    private javax.swing.JLabel JLRPIRuangan;
    private javax.swing.JPanel JPRegisPasien;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JTextField txDiagnosa;
    private javax.swing.JTextField txDokter;
    private javax.swing.JTextField txIDPasien;
    private javax.swing.JTextField txNama;
    private javax.swing.JTextField txPetugas;
    private javax.swing.JTextField txRuangan;
    // End of variables declaration//GEN-END:variables

    public void refresh(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void exit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}