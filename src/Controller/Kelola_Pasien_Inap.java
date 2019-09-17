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
public class Kelola_Pasien_Inap implements ActionListener{
    private Aplikasi app;
    private View.Kelola_Pasien_Inap kelolaPasienInap;
    
    public Kelola_Pasien_Inap(){
        app = new Aplikasi();
        kelolaPasienInap = new View.Kelola_Pasien_Inap();
        kelolaPasienInap.setVisible(true);
        kelolaPasienInap.addActionListener(this);
    }
   
    
    @Override
    public void actionPerformed(ActionEvent e){
        Object source = e.getSource();
        if (source.equals(kelolaPasienInap.getBtnLogout())){
            kelolaPasienInap.dispose();
           new LogInController();
        } else if (source.equals(kelolaPasienInap.getRegis())){
            kelolaPasienInap.dispose();
            new ControllRegistrasiPasienInap();
        } else if (source.equals(kelolaPasienInap.getBtnUbah())){
            kelolaPasienInap.dispose();
            new ControlUpdatePasienInap();
        } else if (source.equals(kelolaPasienInap.getBtnCheck())){
            kelolaPasienInap.dispose();
            new ControllCheckout();
        } else if (source.equals(kelolaPasienInap.getBtnLihat())){
            kelolaPasienInap.dispose();
            new ControllLihatPasInap();
        } else if (source.equals(kelolaPasienInap.getBtnKembali())){
            kelolaPasienInap.dispose();
            new MenuUtama_Controller();
        }    
               
    }
}
