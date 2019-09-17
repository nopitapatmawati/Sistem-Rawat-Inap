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
public class Ubah_Profil_Petugas_Controller implements ActionListener {

    private Aplikasi app;
    private View.Ubah_Profil_Petugas ubahProfilPetugas;

    public Ubah_Profil_Petugas_Controller(Petugas p) {
        app = new Aplikasi();
        
        ubahProfilPetugas = new View.Ubah_Profil_Petugas();
        ubahProfilPetugas.setVisible(true);
        ubahProfilPetugas.addActionListener(this);
        ubahProfilPetugas.setTxId(p.getIdPetugas());
        ubahProfilPetugas.setTxNama(p.getNama());
        ubahProfilPetugas.setTxUsername(p.getUsername());
        ubahProfilPetugas.setTxPassword(p.getPassword());
        ubahProfilPetugas.setTg(p.gettglLahir());
        ubahProfilPetugas.setTxAlamat(p.getAlamat());
        ubahProfilPetugas.setJk(p.getJenisKelamin());

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(ubahProfilPetugas.getBtnLogout())) {
            ubahProfilPetugas.dispose();
            new LogInController();
        } else if (source.equals(ubahProfilPetugas.getBrnKembali())) {
            ubahProfilPetugas.dispose();
            new MenuUtama_Controller();
        } else if (source.equals(ubahProfilPetugas.getBtnSimpan())) {

            app.updatePetugas(Aplikasi.getP().getIdPetugas(), ubahProfilPetugas.getTxUsername(), ubahProfilPetugas.getTxPassword(), ubahProfilPetugas.getTxNama(), ubahProfilPetugas.getTxTGL(), ubahProfilPetugas.getTxAlamat(), ubahProfilPetugas.getCbJK(), app.getP().getNoTelp(), app.getP().getNIK());
            new MenuUtama_Controller();
        }
    }
}
