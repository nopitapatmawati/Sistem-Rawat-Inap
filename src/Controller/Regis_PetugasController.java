/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Regis_Petugas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Model.Aplikasi;
import Model.Petugas;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class Regis_PetugasController implements ActionListener {

    private Aplikasi app;
    private View.Regis_Petugas regisPetugas;

    public Regis_PetugasController() {
        app = new Aplikasi();
        regisPetugas = new View.Regis_Petugas();
        regisPetugas.setVisible(true);
        regisPetugas.addActionListener(this);
    }

    public void toLogin() {
        View.LogIn lo = new View.LogIn();
        lo.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(regisPetugas.getBtnSignUp())) {
            //harus disimpan dlu datanya
            try {
                if ((regisPetugas.getIdPetugas() == null)) {
                     JOptionPane.showMessageDialog(null, "Isi semua");
                } else if ((app.getPetugas(regisPetugas.getIdPetugas()) == null) && (app.getPetugasUser(regisPetugas.getUsername()) == null)) {
                    Petugas p = new Petugas(regisPetugas.getIdPetugas(), regisPetugas.getUsername(), regisPetugas.getPassword(), regisPetugas.getNama(), regisPetugas.getTxTGL(), regisPetugas.getAlamat(), regisPetugas.getJk(), regisPetugas.getTxNoTelp(), regisPetugas.getTxNIK());
                    app.savePetugas(p);
                    regisPetugas.setNullText();
                    regisPetugas.dispose();
                    LogInController l = new LogInController();
                } else {
                    JOptionPane.showMessageDialog(null, "Data sudah ada");
                }
            } catch (Exception ae) {
                JOptionPane.showMessageDialog(null, ae.getMessage());
            }

        }
    }
}
