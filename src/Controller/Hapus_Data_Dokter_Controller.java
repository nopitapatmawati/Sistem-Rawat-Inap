/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Model.Aplikasi;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class Hapus_Data_Dokter_Controller implements ActionListener {
    private Aplikasi app;
    View.Hapus_Data_Dokter hapusDataDokter;

    public void Hapus_Data_Dokter_Controller() {
        app = new Aplikasi();
        View.Hapus_Data_Dokter p = new View.Hapus_Data_Dokter();
        p.setVisible(true);
        p.addActionListener(this);
    }
    
    public void toLogIn() {
        View.LogIn p = new View.LogIn();
        p.setVisible(true);
        p.addActionListener(this);
    }
    
    public void toBack() {
        View.Hapus_Data_Dokter p = new View.Hapus_Data_Dokter();
        p.setVisible(true);
        p.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       Object source = e.getSource();
    if(source.equals(hapusDataDokter.getBtnLogOut())) {
        hapusDataDokter.dispose();
       LogInController l = new LogInController();
    }else if(source.equals(hapusDataDokter.getBtnCari())) {
        try {
                Model.Dokter d = app.getDokter(hapusDataDokter.getTxIdDokter());
                if (d!=null) {
                    hapusDataDokter.reset();
                    hapusDataDokter.setTxNama(d.getNama());
                    hapusDataDokter.setTxNIP(d.getNIP());
                    //hapusDataDokter.setTxTGL(d.gettglLahir());
                    hapusDataDokter.setCbJK(d.getJenisKelamin());
                    hapusDataDokter.setTxSpesialis(d.getSpesialis());
                    int i=0;
                    if(d!=null){
                        hapusDataDokter.setTxPasien(d.getPasien(i).getNama());
                        i++;
                    }
                    hapusDataDokter.setTxjumPasien(d.getNumOfPasien());
                }   else {
                    JOptionPane.showMessageDialog(null, "Nothing");
                }
            } catch (Exception aae) {
                JOptionPane.showMessageDialog(null, aae.getMessage());
            }
    } else if(source.equals(hapusDataDokter.getBtnKembali())) {
        hapusDataDokter.dispose();
        Kelola_Data_Dokter_Controller p = new Kelola_Data_Dokter_Controller();
    } else if (source.equals(hapusDataDokter.getBtnHapus())) {
         Model.Dokter d = app.getDokter(hapusDataDokter.getTxIdDokter());
                if (d!=null) {
                   app.deleteDokter(d.getIdDokter());
                   Kelola_Data_Dokter_Controller l = new Kelola_Data_Dokter_Controller();
                }   else {
                    JOptionPane.showMessageDialog(null, "Nothing");
                }
    }
    }
}
