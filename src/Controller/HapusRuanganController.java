/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import View.HapusRuangan;
import View.KelolaRuangan;
import View.LogIn;
import javax.swing.JOptionPane;

/**
 *
 * @author Praktikum
 */
public class HapusRuanganController implements ActionListener {
    
    private Aplikasi app;
    private HapusRuangan hapusRuangan;

    public HapusRuanganController() {
        app=new Aplikasi();
        hapusRuangan = new HapusRuangan();
        hapusRuangan.setVisible(true);
        hapusRuangan.addActionListener(this);
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
        if (source.equals(hapusRuangan.getBtnCari())) {
            try {
                Model.Ruangan r = app.getRuangan(hapusRuangan.getTxtIDruangan());
                if (r!=null) {
                    hapusRuangan.reset();
                    hapusRuangan.setTxKelas(r.getKelas());
                    hapusRuangan.setTxJumlah(r.getJumPasien());
                    hapusRuangan.setTxHarga(r.getHarga());
                }else {
                    JOptionPane.showMessageDialog(null, "Nothing");
                }
            } catch (Exception aae) {
                JOptionPane.showMessageDialog(null, aae.getMessage());
            }
        }else if (source.equals(hapusRuangan.getBtnHapus())) {
             Model.Ruangan r = app.getRuangan(hapusRuangan.getTxtIDruangan());
                if (r!=null) {
                   app.deleteRuangan(r.getIdRuangan());
                 new KelolaRuangan();
                }else {
                    JOptionPane.showMessageDialog(null, "Nothing");
                }
        }else if (source.equals(hapusRuangan.getBtnKembali())) {
            hapusRuangan.dispose();
          new KelolaRuangan();
        }else if(source.equals(hapusRuangan.getBtnLogOut())){
            hapusRuangan.dispose();
            new LogInController();
        }
    }

}
