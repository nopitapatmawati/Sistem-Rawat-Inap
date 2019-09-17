/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Database;
import Model.Dokter;
import Model.PasienInap;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class DataPasienInap extends javax.swing.JFrame {

    /**
     * Creates new form LihatPasienInap
     */
    
    public DataPasienInap() {
        initComponents();
    }

    public void setTbDataPasienInap() {
        DefaultTableModel tabel = new DefaultTableModel();
        tabel.addColumn("IdPasienInap");
        tabel.addColumn("Diagnosa");
        tabel.addColumn("TglMasuk");
        tabel.addColumn("TglKeluar");
        tabel.addColumn("TotalHarga");
        
        try {
            Database db = new Database();
            
            String s = "select * from PasienInap ";
            ResultSet res = db.getData(s);
            while (res.next()) {
                Model.PasienInap pi= new PasienInap();
                pi.getPasien().setIdPasien(res.getString(1));
                pi.addDiagnosa(res.getString(2));
                pi.setTglMasuk(res.getString(3));
                pi.setTglKeluar(res.getString(4));
                pi.setTotalHarga(Integer.parseInt(res.getString(5)));
                tabel.addRow(new Object[]{res.getString(1), res.getString(2), res.getString(3),res.getString(4),
                    res.getInt(5)});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal Tampil Data");
        }
        tbDataPasienInap.setModel(tabel);
    }
    
    public void reset(){
        setTxIdPasien("");
    }
    
    public void setTbDataPasienInapId(String id) {
        DefaultTableModel tabel = new DefaultTableModel();
        tabel.addColumn("IdPasienInap");
        tabel.addColumn("Diagnosa");
        tabel.addColumn("TglMasuk");
        tabel.addColumn("TglKeluar");
        tabel.addColumn("TotalHarga");
        
        try {
            Database db = new Database();
            
            String s = "select * from PasienInap where IdPasienInap='" + id + "'";
            ResultSet res = db.getData(s);
            while (res.next()) {
                Model.PasienInap pi= new PasienInap();
                pi.getPasien().setIdPasien(res.getString(1));
                pi.addDiagnosa(res.getString(2));
                pi.setTglMasuk(res.getString(3));
                pi.setTglKeluar(res.getString(4));
                pi.setTotalHarga(Integer.parseInt(res.getString(5)));
                
                tabel.addRow(new Object[]{res.getString(1), res.getString(2), res.getString(3),res.getString(4),
                    res.getInt(5)});

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal Tampil Data");
        }
        tbDataPasienInap.setModel(tabel);
    }
    
    public Object getBtnCari() {
        return btnCari;
    }

    public Object getBtnLihat() {
        return btnLihat;
    }

    public Object getBtnLogOut() {
        return btnLogOut;
    }

    public String getTxIdPasien() {
        return txIdPasien.getText();
    }

    public void setTxIdPasien(String txIdPasien) {
        this.txIdPasien.setText(txIdPasien);
    }

    public Object getBtnKembali() {
        return btnKembali;
    }

    public void addActionListener(ActionListener e){
        btnCari.addActionListener(e);
        btnLihat.addActionListener(e);
        btnKembali.addActionListener(e);
        btnLogOut.addActionListener(e);
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
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        JLIdPasien = new javax.swing.JLabel();
        txIdPasien = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDataPasienInap = new javax.swing.JTable();
        btnLihat = new javax.swing.JButton();
        btnKembali = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JLjudul.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JLjudul.setText("Rumah Sakit Kurniawan");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Lihat Data Pasien Inap"));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        JLIdPasien.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JLIdPasien.setText("ID Pasien :");

        btnCari.setText("Cari");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(JLIdPasien)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txIdPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCari)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLIdPasien)
                    .addComponent(txIdPasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCari)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbDataPasienInap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nama", "ID Pasien", "ID Ruangan"
            }
        ));
        tbDataPasienInap.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(tbDataPasienInap);
        tbDataPasienInap.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        btnLihat.setText("Lihat");

        btnKembali.setText("Kembali");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnKembali)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLihat)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLihat)
                    .addComponent(btnKembali))
                .addGap(7, 7, 7))
        );

        btnLogOut.setText("LogOut");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnLogOut)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JLjudul)
                .addGap(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLjudul)
                .addGap(18, 18, 18)
                .addComponent(btnLogOut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLIdPasien;
    private javax.swing.JLabel JLjudul;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnLihat;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbDataPasienInap;
    private javax.swing.JTextField txIdPasien;
    // End of variables declaration//GEN-END:variables
}
