/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Praktikum
 */
public class Aplikasi {

    private ArrayList<Ruangan> daftarRuangan;
    private Database db = new Database();
    private ArrayList<Pasien> daftarPasien;
    private ArrayList<Petugas> daftarPetugas;
    private ArrayList<Dokter> daftarDokter;
    private ArrayList<PasienInap> daftarPasienInap;

    static Petugas p;

    public static Petugas getP() {
        return p;
    }

    public static void setP(Petugas p) {
        Aplikasi.p = p;
    }
    
    
    public Aplikasi() {
       
    }

    public boolean login(String u, String p) {
        return db.login(u, p);
    }

    public ArrayList<Pasien> loadPasien() {
        ArrayList<Pasien> pasien = new ArrayList<>();
        ResultSet rs;
        try {
            String s = "select * from Pasien ";
            rs = db.getData(s);
            while (rs.next()) {
                //sesuain ama database (String IdPasien, String Keluhan, String GolDar, String hasilTesLab, String nama, String TTL, String alamat, String jenisKelamin, String noTelp, String NIK)
                Pasien pas = new Pasien(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11));
                pas.setInap(rs.getBoolean(4));
                pasien.add(pas);

            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return pasien;
    }

    public Pasien getPasien(String id) {
        Pasien pasien = null;
        ResultSet rs;
        try {
            String s = "select idPasien, Keluhan, GolDar, Status, HasilTesLab, Nama, TglLahir, Alamat, JenisKelamin, NoTelp, NIK "
                    + "from Pasien where idPasien='" + id + "' ";
            rs = db.getData(s);
            if (rs.next()) {
                pasien =new Pasien(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11));
              

            } else {
                pasien = null;
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return pasien;
    }

    public void savePasien(Pasien pasien) {
        //ini sesuaiin ama database kalian
        //     String s = "insert into ruangan values('" + r.getId + "','" + r.getNama() + "','" + r.get + "','" + r.get + "','" + r.get + "')";
        //   db.query(s);
        try {
               String s = "insert into pasien values ('" + pasien.getIdPasien() + "','" + pasien.getKeluhan() + "','" + pasien.getGolDar() + "','" + pasien.getHasilTesLab() + "','" + pasien.getNama()+ "','" + pasien.gettglLahir() + "','" + pasien.getAlamat() + "','" + pasien.getJenisKelamin() + "','" + pasien.getNoTelp() + "','" + pasien.getNIK() +"')";
            
            String query = "insert into pasien values("
                    + "'" + pasien.getIdPasien() + "'"
                    + "'" + pasien.getKeluhan() + "'"
                    + "'" + pasien.getGolDar() + "'"
                    + "'" + pasien.isInap() + "'"
                    + "'" + pasien.getHasilTesLab() + "'"
                    + "'" + pasien.getNama() + "'"
                    + "'" + pasien.gettglLahir() + "'"
                    + "'" + pasien.getAlamat() + "'"
                    + "'" + pasien.getJenisKelamin() + "'"
                    + "'" + pasien.getNoTelp() + "'"
                    + "'" + pasien.getNIK() + "')";
            db.query(s);
            JOptionPane.showMessageDialog(null, "Selamat, Pasien berhasil terdaftar");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Maaf, Pasien telah terdaftar sebelumnya");
            System.out.println("Semua data harus terisi");
        }
    }

    public void updatePasien(String id, String Keluhan, String GolDar, boolean Status, String HasilTesLab, String nama, String TglLahir, String Alamat, String JenisKelamin, String NoTelp, String NIK) {
        //sesuaiin ama database
        String s = "update Pasien set Keluhan='" + Keluhan
                + "',GolDar='" + GolDar
                + "',Status='" + Status
                + "',HasilTesLab='" + HasilTesLab
                + "',Nama='" + nama
                + "',TglLahir='" + TglLahir
                + "',Alamat='" + Alamat
                + "',JenisKelamin='" + JenisKelamin
                + "',NoTelp='" + NoTelp
                + "', NIK='" + NIK
                + "'where idPasien='" + id + "' ";
        db.query(s);
        JOptionPane.showMessageDialog(null, "Selamat, Pasien berhasil di update");
    }

    public void deletePasien(String id) {
        //sesuaiin ama database
        String s = "delete * from Pasien where idPasien='" + id + "'";
        db.query(s);
    }

    public ArrayList<Petugas> loadPetugas() {
        ArrayList<Petugas> petugas = new ArrayList<>();
        ResultSet rs;
        try {
            String s = "select * from Petugas ";
            rs = db.getData(s);
            while (rs.next()) {
                //sesuain ama database 
                Petugas pt = new Petugas(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9));
                petugas.add(pt);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return petugas;
    }

    public Petugas getPetugasUser(String user) throws SQLException {
        Petugas pt = null;
        ResultSet rs;
        try {
            // String s = "select IdPetugas, username, password, Nama, TglLahir, Alamat, JenisKelamin, NoTelp,NIK"
            //         + "from petugas where username =' " + user+ "'" ;
            String s = "select *from petugas where username ='" + user + "'";
            rs = db.getData(s);
            if (rs.next()) {
                pt = new Petugas(rs.getString(1), rs.getString(2), rs.getNString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9));

            } else {
                pt = null;
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return pt;
    }

    public Petugas getPetugas(String id) throws SQLException {
        Petugas pt = null;
        ResultSet rs;
        try {
           // String s = "select IdPetugas, username, password, Nama, TglLahir, Alamat, JenisKelamin, NoTelp,NIK"
             //       + "from Petugas where idPetugas =' " + id + "'";
            String s = "select *from petugas where idPetugas ='" + id + "'";
            
            rs = db.getData(s);
            if (rs.next()) {
                pt = new Petugas(rs.getString(1), rs.getString(2), rs.getNString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9));

            } else {
                pt = null;
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return pt;
    }

    public void savePetugas(Petugas pt) {
        //ini sesuaiin ama database kalian
        //   db.query(s);
        try {
                 String s = "insert into petugas values('" + pt.getIdPetugas() + "','" + pt.getUsername() + "','" + pt.getPassword() + "','" + pt.getNama() + "','" + pt.gettglLahir()+ "','"   + pt.getAlamat() + "','" + pt.getJenisKelamin() + "','" + pt.getNoTelp()+"','" + pt.getNIK()+ "')";
        
            String query = "insert into petugas values("
                    + "'" + pt.getIdPetugas() + "'"
                    + "'" + pt.getUsername() + "'"
                    + "'" + pt.getPassword() + "'"
                    + "'" + pt.getNama() + "'"
                    + "'" + pt.gettglLahir() + "')"
                    + "'" + pt.getAlamat() + "')"
                    + "'" + pt.getJenisKelamin() + "')"
                    + "'" + pt.getNoTelp() + "')"
                    + "'" + pt.getNIK() + "')";
            db.query(s);
            JOptionPane.showMessageDialog(null, "Selamat, Petugas berhasil terdaftar");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Maaf, Petugas telah terdaftar sebelumnya");
            System.out.println("Semua data harus terisi");
        }
    }

    public void deletePetugas(String id) {
        //sesuaiin ama database
        String s = "delete * from Petugas where idPetugas='" + id + "'";
        db.query(s);
    }

    public void updatePetugas(String IdPetugas, String Username, String Password, String Nama, String TglLahir, String Alamat, String JenisKelamin, String NoTelp, String NIK) {
        //sesuaiin ama database
        String s = "update Petugas set Username='" + Username
                + "',Password='" + Password
                + "', Nama='" + Nama
                + "', TglLahir='" + TglLahir
                + "', Alamat='" + Alamat
                + "', JenisKelamin='" + JenisKelamin
                + "', NoTelp='" + NoTelp
                + "', NIK='" + NIK
                + "'where IdPetugas='" + IdPetugas + "' ";
        db.query(s);
        JOptionPane.showMessageDialog(null, "Selamat, Petugas berhasil di update");
    }

    public ArrayList<Dokter> loadDokter() {
        ArrayList<Dokter> dok = new ArrayList<>();
        ResultSet rs;
        try {
            String s = "select * from Petugas ";
            rs = db.getData(s);
            while (rs.next()) {
                //sesuain ama database 
                //Dokter dokter = new Dokter(rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9));
                //dok.add(dokter);                
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return dok;
    }

    public Dokter getDokter(String id) {
        Dokter dok = null;
        ResultSet rs;
        try {
            String s = "select *from Dokter where idDokter =' " + id + "'";
            rs = db.getData(s);
            if (rs.next()) {//String NIP, String idDokter, String spesialis,  String nama, String TTL, String alamat, String jenisKelamin, String noTelp, String NIK
                dok = new Dokter(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(9), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8));//ini harus digimanain?

            } else {
                dok = null;
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return dok;
    }

    public void saveDokter(Dokter dok) {
        //ini sesuaiin ama database kalian
        //     String s = "insert into ruangan values('" + r.getId + "','" + r.getNama() + "','" + r.get + "','" + r.get + "','" + r.get + "')";
        //   db.query(s);
        try {
                String s = "insert into dokter values ('" + dok.getNIP() + "','" + dok.getIdDokter() + "','" + dok.getSpesialis() + "','" + dok.getNama() + "','" + dok.getAlamat() + "','" + dok.getJenisKelamin() + "','" + dok.getNoTelp() + "','" + dok.getNIK() + "','" + dok.gettglLahir() + "')";
            
            String query = "insert into dokter values("
                    + "'" + dok.getNIP() + "'"
                    + "'" + dok.getIdDokter() + "'"
                    + "'" + dok.getSpesialis() + "'"
                    + "'" + dok.getNama() + "'"
                    + "'" + dok.getAlamat() + "')"
                    + "'" + dok.getJenisKelamin() + "')"
                    + "'" + dok.getNoTelp() + "')"
                    + "'" + dok.gettglLahir() + "')";
            db.query(query);
            JOptionPane.showMessageDialog(null, "Selamat, Dokter berhasil terdaftar");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Maaf, Dokter telah terdaftar sebelumnya");
            System.out.println("Semua data harus terisi");
        }
    }

    public void deleteDokter(String id) {
        //sesuaiin ama database
        String s = "delete * from dokter where idDokter='" + id + "'";
        db.query(s);
    }

    public void updateDokter(String NIP, String IdDokter, String Spesialis, String Nama, String Alamat, String JenisKelamin, String NoTelp, String NIK, String TglLahir) {
        //sesuaiin ama database
        String s = "update Dokter set NIP='" + NIP
                + "',Spesialis='" + Spesialis
                + "', Nama='" + Nama
                + "', Alamat='" + Alamat
                + "', JenisKelamin='" + JenisKelamin
                + "', NoTelp='" + NoTelp
                + "', NIK='" + NIK
                + "', NTglLahir='" + TglLahir
                + "'where IdDokter='" + IdDokter + "' ";
        db.query(s);
        JOptionPane.showMessageDialog(null, "Selamat, Dokter berhasil di update");
    }

    public ArrayList<PasienInap> loadPasienInap() {
        ArrayList<PasienInap> pi = new ArrayList<>();
        ResultSet rs;
        try {
            String s = "select * from Pasien ";
            rs = db.getData(s);
            while (rs.next()) {
                //sesuain ama database Pasien pasien, String idPasienInap, Dokter dokter, String diagnosa, Ruangan ruangan, Petugas petugas, String tglMasuk)
                //   PasienInap pasIn = new PasienInap(rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4),rs.getInt(5));
                //   pi.add(pasIn);                
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return pi;
    }

    public PasienInap getPasienInap(String id) {
        PasienInap pi = new PasienInap();
        ResultSet rs;
        try {
            String s = "select *from PasienInap where idPasienInap='" + id + "' ";
            rs = db.getData(s);
            if (rs.next()) {
                //sesuaiin ama database
                Pasien pas = getPasien(rs.getString(1));
                pi.setPasien(pas);
                pi.addDiagnosa(rs.getString(2));
                pi.setTglMasuk(rs.getString(3));
                pi.setTglKeluar(rs.getString(4));
                pi.setTotalHarga(Integer.parseInt(rs.getString(5)));
            } else {
                pi = null;
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return pi;
    }

    public void savePasienInap(PasienInap pi) {
        //ini sesuaiin ama database kalian
        //     String s = "insert into ruangan values('" + r.getId + "','" + r.getNama() + "','" + r.get + "','" + r.get + "','" + r.get + "')";
        //   db.query(s);
        try {
                String s = "insert into pasienInap values('" + pi.getPasien() + "','" + pi.getDiagnosa() + "','" + pi.getTglMasuk() + "','" + pi.getTglKeluar() + "','" + pi.getTotalHarga() +"','" + pi.getPasien().getIdPasien() + "','" + pi.getRuangan().getIdRuangan() + "','" + pi.getDokter().getIdDokter() +"')";
          
            db.query(s);
            JOptionPane.showMessageDialog(null, "Selamat, PasienInap berhasil terdaftar");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Maaf, PasienInap telah terdaftar sebelumnya");
            System.out.println("Semua data harus terisi");
        }
    }

    public void deletePasienInap(String id) {
        //sesuaiin ama database
        String s = "delete * from ruangan where idRuangan='" + id + "'";
        db.query(s);
    }

    public void updatePasienInap(String id, String Diagnosa, String TglMasuk, String TglKeluar, int TotalHarga) {
        //sesuaiin ama database  UpasIn.reset();
                   // UpasIn.setTxNama(pi.getDiagnosa());
                    //UpasIn.setTxDokter(pi.getDokter().getNama());
                //    UpasIn.setTxDiagnosa(pi.getDiagnosa());
                //    UpasIn.setTxRuangan(pi.getRuangan().getIdRuangan());
                 //   UpasIn.setTxPetugas(pi.getPetugas().getIdPetugas());  
        String s = "update PasienInap set Diagnosa='" + Diagnosa
                + "',TglMasuk='" + TglMasuk
                + "',TglKeluar='" + TglKeluar
                + "', TotalHarga='" + TotalHarga
                + "'where idPasienInap='" + id + "' ";
        db.query(s);
        JOptionPane.showMessageDialog(null, "Selamat, Ruangan berhasil di update");
    }

    public void deleteRuangan(String id) {
        //sesuaiin ama database
        String s = "delete *from ruangan where idRuangan='" + id + "'";
        db.query(s);
    }

    public void saveRuangan(Ruangan r) {
        //ini sesuaiin ama database kalian
        //     String s = "insert into ruangan values('" + r.getId + "','" + r.getNama() + "','" + r.get + "','" + r.get + "','" + r.get + "')";
        //   db.query(s);
        try {
                String s =  "insert into ruangan values('" + r.getIdRuangan() + "','" + r.getKelas() + "','" + r.getJumPasien() + "','" + r.getHarga() + "')";
            
            String query = "insert into ruangan values("
                    + "'" + r.getIdRuangan() + "'"
                    + "'" + r.getKelas() + "'"
                    + "'" + r.getJumPasien() + "'"
                    + "'" + r.getHarga() + "')";
            db.query(s);
            JOptionPane.showMessageDialog(null, "Selamat, Ruangan berhasil terdaftar");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Maaf, Ruangan telah terdaftar sebelumnya");
            System.out.println("Semua data harus terisi");
        }
    }

    //parameter sesuaiin ama database
    public void updateRuangan(String id, String kelas, int jum, int harga) {
        //sesuaiin ama database
        String s = "update ruangan set kelas='" + kelas + "' ,jumPasien='" + jum + "',harga='" + harga + "' where idRuangan='" + id + "' ";
        db.query(s);
        JOptionPane.showMessageDialog(null, "Selamat, Ruangan berhasil di update");
    }

    public Ruangan getRuangan(String id) {
        Ruangan r = new Ruangan();
        ResultSet rs;
        try {
            String s = "select idRuangan, kelas, jumPasien, harga from ruangan where idRuangan='" + id + "' ";
            rs = db.getData(s);
            if (rs.next()) {
                //sesuaiin ama database
                r.setIdRuangan(rs.getString(1));
                r.setKelas(rs.getString(2));
                r.setJumPasien(rs.getInt(3));
                r.setHarga(rs.getInt(4));
            } else {
                r = null;
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return r;
    }

    public ArrayList<Ruangan> loadRuangan() {
        ArrayList<Ruangan> r = new ArrayList<>();
        ResultSet rs;
        try {
            String s = "select * from ruangan ";
            rs = db.getData(s);
            while (rs.next()) {
                //sesuain ama database String IdRuangan,String kelas, int jumPasien, int harga
                Ruangan rl = new Ruangan(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getInt(4));
                r.add(rl);

            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return r;
    }

}
