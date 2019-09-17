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
public class Registrasi_Dokter_Controller implements ActionListener {

    private Aplikasi app;
    View.Registrasi_Data_Dokter regisDataDokter;

    public Registrasi_Dokter_Controller() {
        app = new Aplikasi();
        regisDataDokter = new View.Registrasi_Data_Dokter();
        regisDataDokter.setVisible(true);
        regisDataDokter.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(regisDataDokter.getBtnLogout())) {
            regisDataDokter.dispose();
            new LogInController();
        } else if (source.equals(regisDataDokter.getBtnKembali())) {
            regisDataDokter.dispose();
            new Kelola_Data_Dokter_Controller();
        } else if (source.equals(regisDataDokter.getBtnSimpan())) {
            Dokter p = app.getDokter(regisDataDokter.getIdDokter());
            if (p==null) {
                regisDataDokter.dispose();
                Dokter d= new Dokter(regisDataDokter.getNIP(), regisDataDokter.getIdDokter(), regisDataDokter.getSpesialis(), regisDataDokter.getNama(), regisDataDokter.getTxTGL(), regisDataDokter.getAlamat(), regisDataDokter.getJk(), regisDataDokter.getTxNotlp(), regisDataDokter.getTxNIK());
                app.saveDokter(d);
                new Kelola_Data_Dokter_Controller();
            }else{
                JOptionPane.showMessageDialog(null, "Already Exist");
            }
        }
    }

}
