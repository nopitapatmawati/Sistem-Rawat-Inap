/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Model.Aplikasi;
import Model.Dokter;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class Ubah_Data_Dokter_Controller implements ActionListener {

    private Aplikasi app;
    View.Ubah_Data_Dokter ubahDataDokter;
    private Dokter p;

    public void Ubah_Data_Dokter_Controller() {
        app = new Aplikasi();
        ubahDataDokter = new View.Ubah_Data_Dokter();
        ubahDataDokter.setVisible(true);
        ubahDataDokter.addActionListener(this);
    }

    public void toLogout() {
        View.LogIn p = new View.LogIn();
        p.setVisible(true);
    }

    public void toBack() {
        View.Ubah_Data_Dokter p = new View.Ubah_Data_Dokter();
        p.setVisible(true);
    }

    public void toCari() {

    }

    public void toSave() {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(ubahDataDokter.getBtnLogout())) {
            ubahDataDokter.dispose();
            new LogInController();
        } else if (source.equals(ubahDataDokter.getBtnKembali())) {
            ubahDataDokter.dispose();
            new Kelola_Data_Dokter_Controller();
        } else if (source.equals(ubahDataDokter.getBtnCari())) {
            Model.Dokter r = app.getDokter(ubahDataDokter.getIdDokter());
            if (r != null) {
                ubahDataDokter.setTxAlamat(r.getAlamat());
                ubahDataDokter.setTxSpesialis(r.getSpesialis());
                ubahDataDokter.setTg(r.gettglLahir());
                ubahDataDokter.setNIP(r.getNIP());
                ubahDataDokter.setJk(r.getJenisKelamin());
                p = r;
            } else {
                JOptionPane.showMessageDialog(null, "nothing");
            }
        } else if (source.equals(ubahDataDokter.getBtnSimpan())) {
            Model.Dokter r = app.getDokter(ubahDataDokter.getIdDokter());
            if (r != null) {
                app.updateDokter(ubahDataDokter.getNIP(), ubahDataDokter.getIdDokter(), ubahDataDokter.getTxSpesialis(), ubahDataDokter.getNama(), ubahDataDokter.getTxAlamat(), ubahDataDokter.getCbJK(), p.getNoTelp(), p.getNIK(), ubahDataDokter.getTxTGL());
                new Kelola_Data_Dokter_Controller();
            } else {
                JOptionPane.showMessageDialog(null, "nothing");
            }

        }
    }
}
