/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import Model.Ruangan;
import View.KelolaRuangan;
import View.LogIn;
import View.UpdateRuangan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class ControllUpdateRuangan implements ActionListener{
    private Model.Aplikasi app;
    private Model.Ruangan ruang;
    private View.UpdateRuangan up;

    public ControllUpdateRuangan() {
        this.app = new Aplikasi();
        up = new View.UpdateRuangan();
        up.setVisible(true);
        up.addActionListener(this);
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
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if(source.equals(up.getBtnCari())){
            Model.Ruangan r = app.getRuangan(up.getTxIdRuangan());
            if(r!=null){
                up.reset();
                //up.setCbKelas();
                up.setTxJumlah(r.getJumPasien());
                up.setTxHarga(r.getHarga());
            }else{
                JOptionPane.showMessageDialog(null, "Nothing");
            }
        }else if(source.equals(up.getBtnKembali())){
            up.dispose();
            KelolaRuangan p = new KelolaRuangan();
        }else if(source.equals(up.getBtnLogout())){
            up.dispose();
            LogInController l = new LogInController();
        }else if(source.equals(up.getBtnSimpan())){
            ruang= app.getRuangan(up.getTxIdRuangan());
            if (ruang!=null) {
                
            app.updateRuangan(up.getTxIdRuangan(), up.getTxKl(), up.getTxJumlah(), up.getTxHarga());
            KelolaRuangan p = new KelolaRuangan();
            }else{
                JOptionPane.showMessageDialog(null, "Nothing");
            }
        }
    }
    
}
