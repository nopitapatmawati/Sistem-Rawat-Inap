/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Hapus_Pasien implements ActionListener {

    private Aplikasi app;
    private View.Hapus_Pasien hapusPasien;

    public Hapus_Pasien() {
        app = new Aplikasi();
        hapusPasien = new View.Hapus_Pasien();
        hapusPasien.setVisible(true);
        hapusPasien.addActionListener(this);

    }

    public void toLogIn() {
        View.Kelola_Data_Pasien p = new View.Kelola_Data_Pasien();
        p.setVisible(true);
        p.addActionListener(this);
    }

    public void toCari() {

    }

    public void toBack() {
        View.Kelola_Data_Pasien p = new View.Kelola_Data_Pasien();
        p.setVisible(true);
        p.addActionListener(this);
    }

    public void toHapus() {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(hapusPasien.getBtnLogout())) {
            hapusPasien.dispose();
            LogInController l = new LogInController();
        } else if (source.equals(hapusPasien.getBtnCari())) {
            try {
                Model.Pasien p = app.getPasien(hapusPasien.getID());
                if (p != null) {
                    hapusPasien.setTxTGL(p.gettglLahir());
                    hapusPasien.setTxAlamat(p.getAlamat());
                    hapusPasien.setTxGolDar(p.getGolDar());
                    hapusPasien.setTxJk(p.getJenisKelamin());
                    hapusPasien.setTxKeluhan(p.getKeluhan());
                    hapusPasien.setTxNama(p.getNama());
                    hapusPasien.setTxaHasilLab(p.getHasilTesLab());
                } else {
                    JOptionPane.showMessageDialog(null, "Nothing");
                }
            } catch (Exception aae) {
                JOptionPane.showMessageDialog(null, aae.getMessage());
            }
        } else if (source.equals(hapusPasien.getKembali())) {
            hapusPasien.dispose();
            Kelola_Data_Pasien p = new Kelola_Data_Pasien();
        } else if (source.equals(hapusPasien.getHapus())) {
            Model.Pasien p = app.getPasien(hapusPasien.getID());
            if (p != null) {
                app.deletePasien(p.getIdPasien());
                new Kelola_Data_Pasien();
            } else {
                JOptionPane.showMessageDialog(null, "Nothing");
            }
        }
    }
}
