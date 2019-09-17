/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nopita Pratiwi P
 */
public class Ruangan {
    private String kelas;
    private String IdRuangan;
    private int jumPasien;
    private int harga;

    public Ruangan(String kelas, String IdRuangan, int jumPasien, int harga) {
        this.kelas = kelas;
        this.IdRuangan = IdRuangan;
        this.jumPasien = jumPasien;
        this.harga = harga;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getKelas() {
        return kelas;
    }

    public void setIdRuangan(String IdRuangan) {
        this.IdRuangan = IdRuangan;
    }

    public String getIdRuangan() {
        return IdRuangan;
    }

    public void setJumPasien(int jumPasien) {
        this.jumPasien = jumPasien;
    }

    public int getJumPasien() {
        return jumPasien;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getHarga() {
        return harga;
    }
    
}
