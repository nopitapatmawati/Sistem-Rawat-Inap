/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import Model.Pasien;
import View.LogIn;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class ControlUpdatePasienInap implements ActionListener {

    private Model.Aplikasi app;
    private Model.PasienInap pasIn;
    private View.UpdateDataPasienInap UpasIn;
    private Pasien pasien;

    public ControlUpdatePasienInap() {
        this.app = new Aplikasi();
        UpasIn = new View.UpdateDataPasienInap();
        UpasIn.addActionListener(this);
        UpasIn.setVisible(true);
    }

    public void goToLogin() {
        View.LogIn lo = new LogIn();
        lo.setVisible(true);
        lo.addActionListener(this);
    }

    public void goToKelolaPasienInap() {
        View.Kelola_Pasien_Inap kepasienInap = new View.Kelola_Pasien_Inap();
        kepasienInap.setVisible(true);
        kepasienInap.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if (source.equals(UpasIn.getBtnCari())) {
            try {
                Model.PasienInap pi = app.getPasienInap(UpasIn.getTxIdPasien());
                if (pi != null) {
                    UpasIn.reset();
                    UpasIn.setTxNama(pi.getDiagnosa());
                    UpasIn.setTxDokter(pi.getDokter().getNama());
                    UpasIn.setTxDiagnosa(pi.getDiagnosa());
                    UpasIn.setTxRuangan(pi.getRuangan().getIdRuangan());
                    UpasIn.setTxPetugas(pi.getPetugas().getIdPetugas());
                    pasien = app.getPasien(pi.getDokter().getIdDokter());
                    pasIn = pi;
                }
            } catch (Exception aae) {
                JOptionPane.showMessageDialog(null, aae.getMessage());
            }
        } else if (source.equals(UpasIn.getBtnSimpan())) {
            app.updatePasienInap(UpasIn.getTxIdPasien(), UpasIn.getTxDiagnosa(), pasIn.getTglMasuk(), pasIn.getTglKeluar(), pasIn.getTotalHarga());
            Kelola_Pasien_Inap p = new Kelola_Pasien_Inap();
        } else if (source.equals(UpasIn.getBtnKembali())) {
            UpasIn.dispose();
            Kelola_Pasien_Inap p = new Kelola_Pasien_Inap();
        } else if (source.equals(UpasIn.getBtnLogout())) {
            UpasIn.dispose();
            LogInController l = new LogInController();
        }
    }
}
