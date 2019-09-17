/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.KelolaRuangan;
import View.LogIn;
import View.ViewRuangan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Model.Aplikasi;
import javax.swing.JOptionPane;

/**
 *
 * @author Praktikum
 */
public class ViewRuanganController implements ActionListener {

    private Aplikasi app;
    private ViewRuangan viewRuangan;

    public ViewRuanganController() {
        app = new Aplikasi();
        viewRuangan = new ViewRuangan();
        viewRuangan.setVisible(true);
        viewRuangan.setTbRuangan();
        viewRuangan.addActionListener(this);
    }
    public void goToLogin(){
        LogIn lo= new LogIn();
        lo.setVisible(true);
        lo.addActionListener(this);
    }
    
    public void goToKelolaRuangan(){
        KelolaRuangan kelruang = new KelolaRuangan();
        kelruang.setVisible(true);
        kelruang.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(viewRuangan.getBtnCari())) {
            try {
                Model.Ruangan r = app.getRuangan(viewRuangan.getTxIdRuangan());
                if (r!=null) {
                    viewRuangan.reset();
                    viewRuangan.setTbDataRuanganId(r.getIdRuangan());
                }
            } catch (Exception aae) {
                JOptionPane.showMessageDialog(null, aae.getMessage());
            }
        } else if (source.equals(viewRuangan.getBtnKembali())) {
            viewRuangan.dispose();
            new KelolaRuangan();
        } else if(source.equals(viewRuangan.getBtnLogout())){
            viewRuangan.dispose();
            new LogInController();
        }
    }

}
