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
public class Data_Per_Dokter implements ActionListener {

    private Aplikasi app;
    private View.Data_Per_Dokter dataPerDokter;

    public Data_Per_Dokter() {
        app = new Aplikasi();
        dataPerDokter = new View.Data_Per_Dokter();
        dataPerDokter.setVisible(true);
        dataPerDokter.addActionListener(this);
    }
    
    public void toBack(){
        View.Lihat_Dokter_Keseluruhan p = new View.Lihat_Dokter_Keseluruhan();
        p.setVisible(true);
        p.addActionListener(this);
    }
    public void toLogin(){
        View.LogIn p = new View.LogIn();
        p.setVisible(true);
        p.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(dataPerDokter.getBtnKembali())) {
            dataPerDokter.dispose();
            Kelola_Data_Dokter_Controller p = new Kelola_Data_Dokter_Controller();
        }else if (source.equals(dataPerDokter.getBtnLogOut())) {
            dataPerDokter.dispose();
            LogInController p = new LogInController();
        }
    }
}
