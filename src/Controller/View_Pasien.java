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
public class View_Pasien implements ActionListener{
    private Aplikasi app;
    private View.View_Pasien viewPasien;
    
    public View_Pasien(){
        app = new Aplikasi();
        viewPasien = new View.View_Pasien();
        viewPasien.setVisible(true);
        viewPasien.addActionListener(this);
    }
    
    public void toLogIn(){
        View.LogIn p = new View.LogIn();
        p.setVisible(true);
    }
    public void toCari(){
        
    }
    public void toBack(){
        View.Kelola_Data_Pasien p = new View.Kelola_Data_Pasien();
        p.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        Object source = e.getSource();
        if (source.equals(viewPasien.getBtnCari())){
            
        } else if (source.equals(viewPasien.getBtnLogout())){
            viewPasien.dispose();
            new LogInController();
        } else if (source.equals(viewPasien.getBtnKembali())){
            viewPasien.dispose();
            new Kelola_Data_Pasien();
        }
    }
}
