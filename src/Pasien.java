/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nopita Pratiwi P
 */
public class Pasien extends Orang {
    private String IdPasien;
    private String Keluhan;
    private String GolDar;
    private boolean status;
    private String hasilTesLab;
    
    
    public Pasien(String nama, String TTL, String alamat, char jenisKelamin, String noTelp, String NIK) {
        super(nama, TTL, alamat, jenisKelamin, noTelp, NIK);
    }

    public Pasien(String IdPasien, String Keluhan, String GolDar, String hasilTesLab, String nama, String TTL, String alamat, char jenisKelamin, String noTelp, String NIK) {
        super(nama, TTL, alamat, jenisKelamin, noTelp, NIK);
        this.IdPasien = IdPasien;
        this.Keluhan = Keluhan;
        this.GolDar = GolDar;
        this.status = false;
        this.hasilTesLab = hasilTesLab;
    }

    public String getGolDar() {
        return GolDar;
    }

    public void setGolDar(String GolDar) {
        this.GolDar = GolDar;
    }
    
    public boolean isInap(){
        return status;
    } 

    @Override
    public void setNama(String nama) {
        super.setNama(nama); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNama() {
        return super.getNama(); //To change body of generated methods, choose Tools | Templates.
    }

    public void setIdPasien(String IdPasien) {
        this.IdPasien = IdPasien;
    }

    public String getIdPasien() {
        return IdPasien;
    }

    public String getKeluhan() {
        return Keluhan;
    }

    public void setKeluhan(String Keluhan) {
        this.Keluhan = Keluhan;
    }

    public String getHasilTesLab() {
        return hasilTesLab;
    }

    public void setHasilTesLab(String hasilTesLab) {
        this.hasilTesLab = hasilTesLab;
    }
    
}
