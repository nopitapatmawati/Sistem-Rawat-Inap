
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Dokter extends Orang {
    private String NIP;
    private String idDokter;
    private String spesialis;
   // private Pasien[] pasien;
    private int numOfPasien;
    ArrayList <Pasien> pasien=new ArrayList<>();

    public Dokter(String NIP, String idDokter, String spesialis, int numOfPasien, String nama, String TTL, String alamat, char jenisKelamin, String noTelp, String NIK) {
        super(nama, TTL, alamat, jenisKelamin, noTelp, NIK);
        this.NIP = NIP;
        this.idDokter = idDokter;
        this.spesialis = spesialis;
        this.numOfPasien = numOfPasien;
    }
    
    

    @Override
    public String getNama() {
        return super.getNama(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNama(String nama) {
        super.setNama(nama); //To change body of generated methods, choose Tools | Templates.
    }

    public String getIdDokter() {
        return idDokter;
    }

    public void setIdDokter(String idDokter) {
        this.idDokter = idDokter;
    }

    public String getSpesialis() {
        return spesialis;
    }

    public void setSpesialis(String spesialis) {
        this.spesialis = spesialis;
    }
    
    public void addPasien (Pasien p){
        if(pasien.size()< numOfPasien){
            pasien.add(p);
        }
        else{
            System.out.println("Error");
        }
    }

    public Pasien getPasien(int i) {
        return pasien.get(i);
    }

    public int getNumOfPasien() {
        return numOfPasien;
    }
    
}
