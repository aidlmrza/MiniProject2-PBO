/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KaryaSeni;

/**
 *
 * @author maidi
 */
public class KaryaSeniGif extends KaryaSeni{
    private String durasi;
    
    
    public KaryaSeniGif(String judul, String artis, String tahun, String durasi) {
        super(judul, artis, tahun);
        this.durasi = durasi;
    }
    
    @Override
    public void tampilkanDetail(){
        System.out.println("Durasi GIF: " + this.getDurasi());
    };
    
    public void editKaryaSeni (String judul, String artis, String tahun, String durasi) {
        this.durasi = durasi;
        System.out.println("=============================================");
        System.out.println("          Data berhasil diperbarui");
        System.out.println("=============================================");
        }

    public String getDurasi() {
        return durasi;
    }

    public void setDurasi(String durasi) {
        this.durasi = durasi;
    }
    
    
}
