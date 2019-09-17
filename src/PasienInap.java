/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class PasienInap {
    private Pasien pasien;
    private String idPasienInap;
    private Dokter dokter;
    private String diagnosa;
    private Ruangan ruangan;
    private Petugas petugas;
    private String tglMasuk;
    private String tglKeluar;
    private int totalHarga;

    public PasienInap() {
    }

    public PasienInap(Pasien pasien, String idPasienInap, Dokter dokter, String diagnosa, Ruangan ruangan, Petugas petugas, String tglMasuk) {
        this.pasien = pasien;
        this.idPasienInap = idPasienInap;
        this.dokter = dokter;
        this.diagnosa = diagnosa;
        this.ruangan = ruangan;
        this.petugas = petugas;
        this.tglMasuk = tglMasuk;
        this.tglKeluar = "";
        this.totalHarga = 0;
    }
    
    public void addDiagnosa(String d){
        this.diagnosa=d;
    }

    public String getDiagnosa() {
        return diagnosa;
    }

    public Pasien getPasien() {
        return pasien;
    }

    public void setPasien(Pasien pasien) {
        this.pasien = pasien;
    }

    public Dokter getDokter() {
        return dokter;
    }

    public void setDokter(Dokter dokter) {
        this.dokter = dokter;
    }
    
    public void addRuangan(Ruangan r){
        if(r.getJumPasien()!=0){
            this.ruangan = r;
            r.setJumPasien(r.getJumPasien()-1);
        }
        else{
            System.out.println("Ruangan Penuh");
        }
    }

    public Ruangan getRuangan() {
        return ruangan;
    }
    
    public void addPetugas(Petugas t){
        this.petugas = t;
    }

    public Petugas getPetugas() {
        return petugas;
    }

    public String getTglMasuk() {
        return tglMasuk;
    }

    public void setTglMasuk(String tglMasuk) {
        this.tglMasuk = tglMasuk;
    }

    public String getTglKeluar() {
        return tglKeluar;
    }

    public void setTglKeluar(String tglKeluar) {
        this.tglKeluar = tglKeluar;
    }

    public int getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(int totalHarga) {
        this.totalHarga = totalHarga;
    }
    
}
