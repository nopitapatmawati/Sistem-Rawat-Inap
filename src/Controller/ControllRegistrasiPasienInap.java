/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import Model.Database;
import View.LogIn;
import View.RegistrasiPasienInap;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;



/**
 *
 * @author ASUS
 */
public class ControllRegistrasiPasienInap implements ActionListener {
    private Model.Aplikasi app;
    private Model.PasienInap pasInap;
    private Model.Pasien pasien;
    private View.RegistrasiPasienInap RegPasienInap;
    private Model.Database db;

    public ControllRegistrasiPasienInap() {
        this.app = new Aplikasi();
        RegPasienInap = new RegistrasiPasienInap();
        RegPasienInap.setVisible(true);
        RegPasienInap.addActionListener(this);
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
        if(source.equals(RegPasienInap.getBtnSimpan())){
            if(RegPasienInap.getTxNama().equals("")||RegPasienInap.getTxIdPasien().equals("")||RegPasienInap.getTxDokter().equals("")||
                    RegPasienInap.getTxDiagnosa().equals("")||RegPasienInap.getTxRuangan().equals("")||RegPasienInap.getTxPetugas().equals("")){
                JOptionPane.showMessageDialog(null, "Semua data harus terisi");
            }else{
                String nama = RegPasienInap.getTxNama();
                String IdPasien = RegPasienInap.getTxIdPasien();
                String dokter = RegPasienInap.getTxDokter();
                String diagnosa = RegPasienInap.getTxDiagnosa();
                String ruangan = RegPasienInap.getTxRuangan();
                String petugas = RegPasienInap.getTxPetugas();
                pasInap = new Model.PasienInap();
                //Bingungnya ini masukin datanya, soalnya ga ada setNama, setNamaDokter, setIdPetugas sm setIdRuangan didalam kelas pasienInap
                pasInap.setPasien(pasInap.getPasien());
                pasInap.setDokter(pasInap.getDokter());
                pasInap.addDiagnosa(diagnosa);
                pasInap.addPetugas(pasInap.getPetugas());
                pasInap.addRuangan(pasInap.getRuangan());
                app.savePasienInap(pasInap);
                //kalo bikinnya gini udh bener belum?
                Kelola_Pasien_Inap p = new Kelola_Pasien_Inap();
            }
        }else if(source.equals(RegPasienInap.getBtnKembali())){
            new ControllRegistrasiPasienInap();
            RegPasienInap.dispose();
            Kelola_Pasien_Inap p = new Kelola_Pasien_Inap();
        }else if(source.equals(RegPasienInap.getBtnLogout())){
            RegPasienInap.dispose();
            LogInController l = new LogInController();
        }
        RegPasienInap.refresh("");
    }
    
}
