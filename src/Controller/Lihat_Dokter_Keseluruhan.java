/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Lihat_Dokter_Keseluruhan implements ActionListener {

    private Aplikasi app;
    private View.Lihat_Dokter_Keseluruhan lihatDokterKeseluruhan;

    public Lihat_Dokter_Keseluruhan() {
        app = new Aplikasi();
        lihatDokterKeseluruhan = new View.Lihat_Dokter_Keseluruhan();
        lihatDokterKeseluruhan.setVisible(true);
        lihatDokterKeseluruhan.addActionListener(this);
        lihatDokterKeseluruhan.setTbDataDokter();
    }

    public void toLogIn() {
        View.LogIn p = new View.LogIn();
        p.setVisible(true);
        p.addActionListener(this);
    }

    public void toBack() {
        View.Kelola_Data_Dokter p = new View.Kelola_Data_Dokter();
        p.setVisible(true);
        p.addActionListener(this);
    }

    public void toCari() {
        //belum paham cara nyari
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(lihatDokterKeseluruhan.getBtnCari())) {
            try {
                Model.Dokter dok = app.getDokter(lihatDokterKeseluruhan.getTxIdDokter());
                if (dok!=null) {
                    lihatDokterKeseluruhan.reset();
                    lihatDokterKeseluruhan.setTbDataDokterId(dok.getIdDokter());
                }
            } catch (Exception aae) {
                JOptionPane.showMessageDialog(null, aae.getMessage());
            }
            
        } else if (source.equals(lihatDokterKeseluruhan.getKembali())) {
            lihatDokterKeseluruhan.dispose();
            toBack();
        } else if (source.equals(lihatDokterKeseluruhan.getBtnLogout())) {
            lihatDokterKeseluruhan.dispose();
            JOptionPane.showMessageDialog(null, "huuuu");
            toLogIn();
        } else if (source.equals(lihatDokterKeseluruhan.getBtnLihat())) {
            lihatDokterKeseluruhan.dispose();
            Model.Dokter doc = lihatDokterKeseluruhan.getDokter();
            if (doc != null) {
                View.Data_Per_Dokter d = new View.Data_Per_Dokter();
                
                d.setTxIdDokter(doc.getIdDokter());
                d.setTxNamaDokter(doc.getNama());
                d.setTxNIP(doc.getNIP());
                String tg=doc.gettglLahir();
                DateFormat format = new SimpleDateFormat("dd - MM - yyyy");
                Date date=null;
                try {
                    date = format.parse(tg);
                } catch (ParseException ex) {
                    Logger.getLogger(Lihat_Dokter_Keseluruhan.class.getName()).log(Level.SEVERE, null, ex);
                }
                d.setTxTGL((java.sql.Date) date);
                d.setTxSpesialis(doc.getSpesialis());
                d.setTxaPasien(doc.getPasien().toString());
                d.setTxJumPasien(doc.getNumOfPasien());
                d.setTxJK(doc.getJenisKelamin());
                d.setTxAlamat(doc.getAlamat());
                d.setVisible(true);
                d.addActionListener(this);
            }

        }
    }
}
