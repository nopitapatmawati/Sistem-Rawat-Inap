/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Model.Aplikasi;
import Model.Petugas;

/**
 *
 * @author ACER
 */
public class MenuUtama_Controller implements ActionListener {

    private Aplikasi app;
    private View.Menu_Utama menuUtama;
    static Petugas s = null;

    public MenuUtama_Controller() {
        app = new Aplikasi();
        menuUtama = new View.Menu_Utama();
        menuUtama.setVisible(true);
        menuUtama.addActionListener(this);
        menuUtama.setTxId(Aplikasi.getP().getIdPetugas());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(menuUtama.getBtnKelolaRuangan())) {
            menuUtama.dispose();
            ControllKelolaRuangan c = new ControllKelolaRuangan();
        } else if (source.equals(menuUtama.getBtnLogout())) {
            menuUtama.dispose();
            LogInController lc = new LogInController();
        } else if (source.equals(menuUtama.getBtnUbahProfil())) {
            menuUtama.dispose();
            new Ubah_Profil_Petugas_Controller(Aplikasi.getP());
        } else if (source.equals(menuUtama.getBtnKelolaDataDokter())) {
            menuUtama.dispose();
            Kelola_Data_Dokter_Controller kd = new Kelola_Data_Dokter_Controller();
        } else if (source.equals(menuUtama.getBtnKelolaDataPasien())) {
            menuUtama.dispose();
            Kelola_Data_Pasien kp = new Kelola_Data_Pasien();
        } else if (source.equals(menuUtama.getBtnKelolaDataPasienInap())) {
            menuUtama.dispose();
            Kelola_Pasien_Inap kpi = new Kelola_Pasien_Inap();
        }
    }
}
