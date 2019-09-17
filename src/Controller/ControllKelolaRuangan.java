/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import Model.Ruangan;
import View.CreateRuangan;
import View.HapusRuangan;
import View.KelolaRuangan;
import View.LogIn;
import View.Menu_Utama;
import View.UpdateRuangan;
import View.ViewRuangan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author ASUS
 */
public class ControllKelolaRuangan implements ActionListener {
    private Model.Aplikasi app;
    private Model.Ruangan ruang;
    private View.KelolaRuangan kelruang;

    public ControllKelolaRuangan() {
        this.app = new Aplikasi();
        kelruang =new View.KelolaRuangan();
        kelruang.setVisible(true);
        kelruang.addActionListener(this);
    }
    public void goToLogin(){
        LogIn lo= new LogIn();
        lo.setVisible(true);
        lo.addActionListener(this);
    }
    
    public void goToCreateRuangan(){
        CreateRuangan createruangan= new CreateRuangan();
        createruangan.setVisible(true);
        createruangan.addActionListener(this);
    }
    
    public void goToHapusRuangan(){
        HapusRuangan del = new HapusRuangan();
        del.setVisible(true);
        del.addActionListener(this);
    } 

    public void goToUpdateRuangan(){
        UpdateRuangan update = new UpdateRuangan();
        update.setVisible(true);
        update.addActionListener(this);
    }
    
    public void goToMenuUtama(){
        Menu_Utama menu = new Menu_Utama();
        menu.setVisible(true);
        menu.addActionListener(this);
    }
    
    public void goToLiatRuangan(){
        ViewRuangan liat = new ViewRuangan();
        liat.setVisible(true);
        liat.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if(source.equals(kelruang.getBtnCreateRuangan())){
            kelruang.dispose();
            ControllCreateRuangan p = new ControllCreateRuangan();
        }else if(source.equals(kelruang.getBtnHapusRuangan())){
            kelruang.dispose();
            HapusRuanganController l = new HapusRuanganController();
        }else if(source.equals(kelruang.getBtnUpdateRuangan())){
            kelruang.dispose();
            ControllUpdateRuangan c = new ControllUpdateRuangan();
        }else if(source.equals(kelruang.getBtnKembali())){
            kelruang.dispose();
            MenuUtama_Controller c = new MenuUtama_Controller();
        }else if(source.equals(kelruang.getBtnLogOut())){
            kelruang.dispose();
            LogInController l = new LogInController();
        }else if(source.equals(kelruang.getBtnLihatRuangan())){
            kelruang.dispose();
            ViewRuanganController c = new ViewRuanganController();
        }
    }
    
    
}
