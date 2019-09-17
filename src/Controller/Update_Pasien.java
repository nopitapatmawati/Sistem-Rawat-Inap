/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import Model.Pasien;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Update_Pasien implements ActionListener {

    private Aplikasi app;
    private View.Update_Pasien updatePasien;

    public Update_Pasien() {
        app = new Aplikasi();
        updatePasien = new View.Update_Pasien();
        updatePasien.setVisible(true);
        updatePasien.addActionListener(this);
    }

    public void toLogIn() {
        View.LogIn p = new View.LogIn();
        p.setVisible(true);
    }

    public void toBack() {
        View.Kelola_Data_Pasien p = new View.Kelola_Data_Pasien();
        p.setVisible(true);
    }

    public void toCari() {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(updatePasien.getBtnCari())) {
            try {
                Pasien p = app.getPasien(updatePasien.getID());
                if (p!=null) {
                    updatePasien.setTxID(p.getIdPasien());
                    updatePasien.setTxNama(p.getNama());
                    updatePasien.setTxAlamat(p.getAlamat());
                    updatePasien.setTxNIK(p.getNIK());
                    updatePasien.setTg(p.gettglLahir());
                    updatePasien.setTxJK(p.getJenisKelamin());
                    updatePasien.setKeluhan(p.getKeluhan());
                    updatePasien.setGolDar(p.getGolDar());
                    updatePasien.setHasil(p.getHasilTesLab());
                }else{
                     JOptionPane.showMessageDialog(null, "Data tidak ada");
                }
            } catch (Exception ae) {
                JOptionPane.showMessageDialog(null, ae.getMessage());
            }
        } else if (source.equals(updatePasien.getBtnLogout())) {
            updatePasien.dispose();
            LogInController l = new LogInController();
        } else if (source.equals(updatePasien.getSimpan())) {
            app.updatePasien(updatePasien.getID(), updatePasien.getKeluhan(), updatePasien.getGolDar(), app.getPasien(updatePasien.getID()).isInap(), updatePasien.getTxHasil(), updatePasien.getNama(), updatePasien.getTxTGL(), updatePasien.getAlamat(), updatePasien.getJk(), app.getPasien(updatePasien.getID()).getNoTelp(), updatePasien.getNIK());
            
            updatePasien.dispose();
            Kelola_Data_Pasien p = new Kelola_Data_Pasien();
        } else if (source.equals(updatePasien.getKembali())) {
            updatePasien.dispose();
            Kelola_Data_Pasien p = new Kelola_Data_Pasien();
        }
    }
}
