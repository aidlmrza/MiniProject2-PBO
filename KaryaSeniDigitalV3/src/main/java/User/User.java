/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

import java.util.Scanner;
import KaryaSeni.CRUDKaryaSeni;
import java.util.ArrayList;
import KaryaSeni.KaryaSeni;
import KaryaSeni.KaryaSeniGif;
import KaryaSeni.KaryaSeniIlustrasi;


/**
 *
 * @author maidi
 */


final public class User implements CRUDKaryaSeni{
    private String nama;
    private String email;
    final private String userID;
    private String userPW;
    public static ArrayList<KaryaSeni> koleksi = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);
    
    
    public User(String nama, String email, String userID, String userPW) {
        this.nama = nama;
        this.email = email;
        this.userID = userID;
        this.userPW = userPW;
    }
    

    
    
    @Override
    public void createKaryaSeni() {
        int pilihan;
        System.out.println("=====================================");
        System.out.println("      Tambah Koleksi Karya Seni");
        System.out.println("=====================================");
        System.out.print(" Masukkan judul karya seni: ");
        String judul = scanner.nextLine();
        System.out.print(" Masukkan nama artis: ");
        String artis = scanner.nextLine();
        System.out.print(" Masukkan tahun: ");
        String tahun  = scanner.nextLine();
        System.out.println("-------------------");
        System.out.println(" 1. Ilustrasi");
        System.out.println(" 2. GIF");
        System.out.println("-------------------");
        System.out.print(" Pilih jenis karya: ");
        pilihan = scanner.nextInt();
        scanner.nextLine();
        if (pilihan == 1) {
            System.out.print(" Teknik ilustrasi: ");
            String teknik = scanner.nextLine();
            KaryaSeni karyaBaru = new KaryaSeniIlustrasi(judul, artis, tahun, teknik);
            koleksi.add(karyaBaru);
        } else if (pilihan == 2) {
            System.out.print(" Durasi GIF: ");
            String durasi = scanner.nextLine();
            KaryaSeni karyaBaru = new KaryaSeniGif(judul, artis, tahun, durasi);
            koleksi.add(karyaBaru);
        } else {
            System.out.println("=====================");
            System.out.println("  Pilihan tidak ada");
            System.out.println("=====================");
        }   
    }

    @Override
    public void readKaryaSeni() {
        if (koleksi.isEmpty()) {
            System.out.println("======================================");
            System.out.println("  Tidak ada karya seni dalam koleksi");
            System.out.println("======================================");
        } else {
            for (KaryaSeni karya : koleksi) {
                System.out.println("===========================================");
                System.out.println("Judul: " + karya.getJudul());
                System.out.println("Artis: " + karya.getArtis());
                System.out.println("Tahun: " + karya.getTahun());
                karya.tampilkanDetail();
            }
        }
    }

    
    @Override
    public void updateKaryaSeni() {
        System.out.println("=====================================");
        System.out.println("       Edit Koleksi Karya Seni");
        System.out.println("=====================================");
        System.out.print(" Masukkan judul karya seni yang ingin diedit: ");
        String judul = scanner.nextLine();
        boolean ditemukan = false;
        
        for (KaryaSeni karya : koleksi) {
            if (karya.getJudul().equalsIgnoreCase(judul)) {
                System.out.print(" Masukkan Judul baru: ");
                String judulBaru = scanner.nextLine();
                System.out.print(" Masukkan nama Artis baru: ");
                String artisBaru = scanner.nextLine();
                System.out.print(" Masukkan Tahun baru: ");
                String tahunBaru = scanner.nextLine();
                if (karya instanceof KaryaSeniIlustrasi){
                    System.out.print(" Teknik Ilustrasi baru: ");
                    String teknikBaru = scanner.nextLine();
                    karya.setJudul(judulBaru);
                    karya.setArtis(artisBaru);
                    karya.setTahun(tahunBaru);
                    ((KaryaSeniIlustrasi) karya).setTeknik(teknikBaru);
                    System.out.println("=============================================");
                    System.out.println("          Data berhasil diperbarui");
                    System.out.println("=============================================");
                    ditemukan = true;
                    break;
                } else if (karya instanceof KaryaSeniGif) {
                    System.out.print(" Durasi GIF baru: ");
                    String durasiBaru = scanner.nextLine();
                    karya.setJudul(judulBaru);
                    karya.setArtis(artisBaru);
                    karya.setTahun(tahunBaru);
                    ((KaryaSeniGif) karya).setDurasi(durasiBaru);
                    System.out.println("=============================================");
                    System.out.println("          Data berhasil diperbarui");
                    System.out.println("=============================================");
                    ditemukan = true;
                    break;
                }
                karya.editKaryaSeni(judulBaru, artisBaru, tahunBaru);

            }
        }
        if (!ditemukan) {
            System.out.println("================================");
            System.out.println("   Karya seni tidak ditemukan.");
            System.out.println("================================");
        }
        
    }

    @Override
    public void deleteKaryaSeni() {
        System.out.println("========================================");
        System.out.println("     Hapus Karya Seni dari koleksi");
        System.out.println("========================================");
        System.out.print(" Masukkan judul karya yang ingin dihapus: ");
        String judul = scanner.nextLine();
        boolean ditemukan = false;
        for (KaryaSeni karya : koleksi) {
            if (karya.getJudul().equalsIgnoreCase(judul)){
                koleksi.remove(karya);
                System.out.println("===================================");
                System.out.println("    Karya Seni berhasil dihapus.");
                System.out.println("===================================");
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("====================================");
            System.out.println("     Karya seni tidak ditemukan.");
            System.out.println("====================================");
        }
    }

    
    
    public String getNama() {
        return nama;
    }

    public String getEmail() {
        return email;
    }

    public String getUserID() {
        return userID;
    }

    public String getUserPW() {
        return userPW;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUserPW(String userPW) {
        this.userPW = userPW;
    }
    
    
}
