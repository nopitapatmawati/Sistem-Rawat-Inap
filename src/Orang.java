
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nopita Pratiwi P
 */
public abstract class Orang {

    private String nama;
    private String tglLahir;
    private String alamat;
    private char jenisKelamin;
    private String noTelp;
    private String NIK;

    public Orang(String nama, String TTL, String alamat, char jenisKelamin, String noTelp, String NIK) {
        this.nama = nama;
        this.tglLahir = tglLahir;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;
        this.noTelp = noTelp;
        this.NIK = NIK;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String gettglLahir() {
        return tglLahir;
    }

    public void settglLahir(String tglLahir) {
        this.tglLahir = tglLahir;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public char getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(char jenisKelamin) {
        if ((jenisKelamin == 'L') || (jenisKelamin == 'P')) {
            this.jenisKelamin = jenisKelamin;
        }
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public String getNoTelp() {
        return noTelp;
    }

}
