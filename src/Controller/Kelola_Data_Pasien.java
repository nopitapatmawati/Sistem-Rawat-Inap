/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author ASUS
 */
public class Kelola_Data_Pasien implements ActionListener {

    private Aplikasi app;
    private View.Kelola_Data_Pasien kelolaDataPasien;

    public Kelola_Data_Pasien() {
        app = new Aplikasi();
        kelolaDataPasien = new View.Kelola_Data_Pasien();
        kelolaDataPasien.setVisible(true);
        kelolaDataPasien.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(kelolaDataPasien.getBtnLogout())) {
            kelolaDataPasien.dispose();
            new LogInController();
        } else if (source.equals(kelolaDataPasien.getRegis())) {
            kelolaDataPasien.dispose();
            new Regis_Pasien();
        } else if (source.equals(kelolaDataPasien.getUbah())) {
            kelolaDataPasien.dispose();
            new Update_Pasien();
        } else if (source.equals(kelolaDataPasien.getBtnHapus())) {
            kelolaDataPasien.dispose();
            new Hapus_Pasien();
        } else if (source.equals(kelolaDataPasien.getLihat())) {
            kelolaDataPasien.dispose();
            new View_Pasien();
        } else if (source.equals(kelolaDataPasien.getKembali())) {
            kelolaDataPasien.dispose();
            new MenuUtama_Controller();
        }
    }
}
