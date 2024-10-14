/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KaryaSeni;


/**
 *
 * @author maidi
 */
abstract public class KaryaSeni{
    private String judul;
    private String artis;
    private String tahun;
    
    KaryaSeni(String judul, String artis, String tahun) {
        this.judul = judul;
        this.artis = artis;
        this.tahun = tahun;
    }
    
    
    
    abstract public void tampilkanDetail();
    
    public void editKaryaSeni (String judul, String artis, String tahun) {
        this.judul = judul;
        this.artis = artis;
        this.tahun = tahun;
        System.out.println("=============================================");
        System.out.println("          Data berhasil diperbarui");
        System.out.println("=============================================");
    }
    

    public String getJudul() {
        return judul;
    }

    public String getArtis() {
        return artis;
    }

    public String getTahun() {
        return tahun;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setArtis(String artis) {
        this.artis = artis;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }
    
    
    
    
    
}
