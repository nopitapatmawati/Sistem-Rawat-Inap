/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */
public class Petugas extends Orang {
    private String idPetugas;
    private String username;
    private String password;

    public Petugas(String idPetugas, String username, String password, String nama, String TTL, String alamat, char jenisKelamin, String noTelp, String NIK) {
        super(nama, TTL, alamat, jenisKelamin, noTelp, NIK);
        this.idPetugas = idPetugas;
        this.username = username;
        this.password = password;
    }

    public String getIdPetugas() {
        return idPetugas;
    }

    public void setIdPetugas(String idPetugas) {
        this.idPetugas = idPetugas;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
