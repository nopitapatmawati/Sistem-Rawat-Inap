/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import View.LogIn;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import Model.Aplikasi;
import Model.Petugas;



/**
 *
 * @author ACER
 */
public class LogInController implements ActionListener {
    private Aplikasi app;
    private View.LogIn logIn;
    Petugas plog;
    public LogInController() {
        app = new Aplikasi();
        logIn = new View.LogIn();
        logIn.setVisible(true);
        logIn.addActionListener(this);
    }
  

    public Petugas getPlog() {
        return plog;
    }

    public void setPlog(Petugas plog) {
        this.plog = plog;
    }
   
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        try{
            if(source.equals(logIn.getBtnLogin())) {
                String username=logIn.getUsername();
                String password=logIn.getPassword();
                if(app.login(username, password)==true){
                    Petugas p= app.getPetugasUser(username);
                    Aplikasi.setP(p);
                    JOptionPane.showMessageDialog(null,"Selamat Datang "+logIn.getUsername());
                    logIn.dispose();
                    new MenuUtama_Controller();
                }else{
                    JOptionPane.showMessageDialog(null,"Username Atau Password Salah");
                }
            }else if(source.equals(logIn.getBtnSignUp())) {
                logIn.dispose();  
                Regis_PetugasController re=new Regis_PetugasController();
            }
        
        }catch(Exception x){
            System.out.println(x);
        }
    }
}
