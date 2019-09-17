/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import Model.Ruangan;
import View.CreateRuangan;
import View.KelolaRuangan;
import View.LogIn;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class ControllCreateRuangan implements ActionListener {

    private Model.Aplikasi app;
    private View.CreateRuangan create;
    private Model.Ruangan ruang;

    public ControllCreateRuangan() {
        this.app = new Aplikasi();
        create = new CreateRuangan();
        create.setVisible(true);
        create.addActionListener(this);
    }

    public void goToLogin() {
        LogIn lo = new LogIn();
        lo.setVisible(true);
        lo.addActionListener(this);
    }

    public void goToKelolaRuangan() {
        KelolaRuangan kelruang = new KelolaRuangan();
        kelruang.setVisible(true);
        kelruang.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if (source.equals(create.getBtnKembali())) {
            create.dispose();
           KelolaRuangan l =  new KelolaRuangan();
        } else if (source.equals(create.getBtnLogout())) {
            create.dispose();
            LogInController k= new LogInController();
        } else if (source.equals(create.getBtnSimpan())) {
            if (app.getRuangan(create.getJTIdruangan()) == null) {
                Ruangan p = new Ruangan(create.getJTIdruangan(), create.getCMBKelas(), create.getJTjumlah(), create.getJTHarga());
                app.saveRuangan(p);
               KelolaRuangan k = new KelolaRuangan();
            } else {
                JOptionPane.showMessageDialog(null, "Data sudah ada");
            }
        }
    }

}
