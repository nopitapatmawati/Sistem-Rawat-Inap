/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import Model.PasienInap;
import View.DataPasienInap;
import View.LogIn;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class ControllDataPasienInap extends MouseAdapter implements ActionListener{
    private Model.Aplikasi app;
    private View.DataPasienInap dapasIn;
    private Model.PasienInap pasIn;

    public ControllDataPasienInap() {
        this.app = new Aplikasi();
        dapasIn= new View.DataPasienInap();
        dapasIn.setVisible(true);
        dapasIn.addActionListener(this);
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
        Object source= ae.getSource();
        if (source.equals(dapasIn.getBtnLogOut())) {
            dapasIn.dispose();
            JOptionPane.showMessageDialog(null, "Kamsahamnida");
            LogInController l = new LogInController();
        }else if (source.equals(dapasIn.getBtnKembali())) {
            dapasIn.dispose();
            JOptionPane.showMessageDialog(null, "Balik yeee");
            Kelola_Pasien_Inap k = new Kelola_Pasien_Inap();
        }else if (source.equals(dapasIn.getBtnCari())) {
            try {
                Model.PasienInap pi = app.getPasienInap(dapasIn.getTxIdPasien());
                if (pi!=null) {
                    dapasIn.reset();
                    dapasIn.setTbDataPasienInapId(pi.getPasien().getIdPasien());
                }
            } catch (Exception aae) {
                JOptionPane.showMessageDialog(null, aae.getMessage());
            }
        }else if (source.equals(dapasIn.getBtnLihat())) {
            dapasIn.dispose();
            Model.PasienInap pi = new PasienInap();
            if (pi != null) {
                View.LihatPasienInap dpi = new View.LihatPasienInap();
                
                dpi.setTxIdpasien(pi.getPasien().getIdPasien());
                dpi.setTxNama(pi.getPasien().getNama());
                dpi.setTxDokter(pi.getDokter().getNama());
                dpi.setTxDiagnosa(pi.getDiagnosa());
                dpi.setTxRuangan(pi.getRuangan().getIdRuangan());
                dpi.setTxIdpetugas(pi.getPetugas().getIdPetugas());
                dpi.setVisible(true);
                dpi.addActionListener(this);
            }
        }
    }
//    public ControllerLihatPelamar(Aplikasi model, Perusahaan p,int idLowongan) {
//        this.model = model;
//        this.p=p;
//        this.idLowongan=idLowongan;
//        view = new lihatPelamar();
//        view.setVisible(true);
//        view.addListener(this);
//        view.addAdapter(this);
//        if(model.getBerkas(idLowongan)!=null){
//            view.viewAll(model.getBerkas(idLowongan));
//            p.getLowongan(idLowongan).setBerkasMasuk(model.getBerkas(idLowongan));
//        }
//        else{
//            List <BerkasLamaran> berkas2=new ArrayList<>();
//            view.viewAll(berkas2);
//        }
////        lowongan=p.getLowongan(idLowongan);
////        lowongan.setBerkasMasuk(model.getBerkas(idLowongan));
//    }
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        Object source = e.getSource();
//        if(source.equals(view.getBtnTerima())){
//                if(model.getBerkas(idLowongan)!=null){
//                    model.pindahBerkas(p.getLowongan(idLowongan).getBerkas(idPelamar).getIdBerkas(), idLowongan);
//                    p.getLowongan(idLowongan).pindahBerkas(p.getLowongan(idLowongan).getBerkas(idPelamar).getIdBerkas());
//                    JOptionPane.showMessageDialog(null, "Data telah diApprove!");
//                    if(model.getBerkas(idLowongan)!=null){
//                        view.viewAll(model.getBerkas(idLowongan));
//                        p.getLowongan(idLowongan).setBerkasMasuk(model.getBerkas(idLowongan));
//                    }else{
//                        List <BerkasLamaran> berkas2=new ArrayList<>();
//                        view.viewAll(berkas2);
//                    }
//                }else{
//                JOptionPane.showMessageDialog(null, "Data Tidak Ada");
//                }
//            } else if(source.equals(view.getBtnKembali())){
//                new ControllerMenuLowongan(model,p);
//                view.dispose();
//            } else if(source.equals((view.getBtnLogOut()))){
//                new ControllerLogin(model);
//            }
//        }
//    public void MouseClicked(MouseEvent e){
//        if(e.getSource().equals(view.getTblBerkas())){
//            idPelamar=view.getSelected();
//        }
//    } 
    
}
