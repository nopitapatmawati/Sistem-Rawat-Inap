/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import Model.Pasien;
import Model.Petugas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Regis_Pasien implements ActionListener {

    private Aplikasi app;
    private View.Regis_Pasien regisPasien;

    public Regis_Pasien() {
        app = new Aplikasi();
        regisPasien = new View.Regis_Pasien();
        regisPasien.setVisible(true);
        regisPasien.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(regisPasien.getBtnLogout())) {
            regisPasien.dispose();
           new LogInController();
        } else if (source.equals(regisPasien.getBtnSimpan())) {
            try {
                if (app.getPasien(regisPasien.getTxID()) == null) {

                    Pasien p = new Pasien(regisPasien.getTxID(), regisPasien.getTxKeluhan(), regisPasien.getTxGoldar(), regisPasien.getTxaHasilLab(), regisPasien.getTxNama(), regisPasien.getTxTGL(), regisPasien.getTxAlamat(), regisPasien.getComJK(), regisPasien.getTxNotelp(), regisPasien.getTxNIK());
                    app.savePasien(p);
                    regisPasien.dispose();
                    new Kelola_Data_Pasien();
                } else {
                    JOptionPane.showMessageDialog(null, "Data sudah ada");
                }
            } catch (Exception ae) {
                JOptionPane.showMessageDialog(null, ae.getMessage());
            }

        } else if (source.equals(regisPasien.getBtnKembali())) {
            regisPasien.dispose();
            Kelola_Data_Pasien p = new Kelola_Data_Pasien();
        }
    }
}
