/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Model.Aplikasi;

/**
 *
 * @author ACER
 */
public class Kelola_Data_Dokter_Controller implements ActionListener {

    private Aplikasi app;
    private View.Kelola_Data_Dokter kelolaDataDokter;

    public Kelola_Data_Dokter_Controller() {
        app = new Aplikasi();
        kelolaDataDokter = new View.Kelola_Data_Dokter();
        kelolaDataDokter.setVisible(true);
        kelolaDataDokter.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(kelolaDataDokter.getBtnLogout())) {
            kelolaDataDokter.dispose();
            LogInController l = new LogInController();
        } else if (source.equals(kelolaDataDokter.getBtnKembali())) {
            kelolaDataDokter.dispose();
            MenuUtama_Controller p = new MenuUtama_Controller();
        } else if (source.equals(kelolaDataDokter.getBtnHapusDataDokter())) {
            kelolaDataDokter.dispose();
           Hapus_Data_Dokter_Controller h =  new Hapus_Data_Dokter_Controller();
        } else if (source.equals(kelolaDataDokter.getBtnLihatDataDokter())) {
            kelolaDataDokter.dispose();
            Lihat_Dokter_Keseluruhan l = new Lihat_Dokter_Keseluruhan();
        } else if (source.equals(kelolaDataDokter.getBtnRegisDokter())) {
            kelolaDataDokter.dispose();
            Registrasi_Dokter_Controller l  =new Registrasi_Dokter_Controller();
        } else if (source.equals(kelolaDataDokter.getBtnUbahDataDokter())) {
            kelolaDataDokter.dispose();
           Ubah_Data_Dokter_Controller p= new Ubah_Data_Dokter_Controller();
        }
    }

}
