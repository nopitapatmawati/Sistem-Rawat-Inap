/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import View.LogIn;
import View.RegistrasiPasienInap;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author ASUS
 */
public class ControllLihatPasInap implements ActionListener {
    private View.LihatPasienInap liat;
    private Model.Aplikasi app;
    private Model.PasienInap pasIn;

    public ControllLihatPasInap() {
        this.app =new Aplikasi();
        liat = new View.LihatPasienInap();
        liat.setVisible(true);
        liat.addActionListener(this);
        
    }
    
    public void goToLogin(){
        View.LogIn lo= new LogIn();
        lo.setVisible(true);
        lo.addActionListener(this);
    }
    
    public void goToKelolaPasienInap(){
        View.Kelola_Pasien_Inap kepasienInap= new View.Kelola_Pasien_Inap();
        kepasienInap.setVisible(true);
        kepasienInap.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if(source.equals(liat.getBtnKembali())){
            liat.dispose();
            Kelola_Pasien_Inap k = new Kelola_Pasien_Inap();
        }else if(source.equals(liat.getBtnLogout())){
            liat.dispose();
            LogInController lk =new LogInController();
        }
    }
    
}
