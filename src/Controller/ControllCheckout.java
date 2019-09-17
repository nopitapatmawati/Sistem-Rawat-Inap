/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import Model.PasienInap;
import View.Checkout;
import View.LogIn;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author ASUS
 */
public class ControllCheckout implements ActionListener{
    private View.Checkout check;
    private Model.Aplikasi app;
    private Model.PasienInap pasIn;

    public ControllCheckout() {
        this.app = new Aplikasi();
        check=new View.Checkout();
        check.setVisible(true);
        check.addActionListener(this);
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
        if(source.equals(check.getBtnCheckOut())){
            //pengennya sih kalo mencet tombol ini berarti udh selesai proses bayar membayar
            //trus pasien inapnya dikurangi
            check.dispose();
            goToKelolaPasienInap();
        }else if(source.equals(check.getBtnKembali())){
            check.dispose();
            Kelola_Pasien_Inap p = new Kelola_Pasien_Inap();
        }else if(source.equals(check.getBtnLogOut())){
            check.dispose();
            LogInController p = new LogInController();
        }
    }
    
}
