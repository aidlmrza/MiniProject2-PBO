/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KaryaSeni;

import User.User;
import java.util.Scanner;


/**
 *
 * @author maidi
 */
public class main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int pilihan;
        String userLogin;
        String userPassword;
        boolean keluarProgram = false;
        
        User user1 = new User("amir", "amir@gmail.com", "aidlmrza", "amiraja");

        
        while (!keluarProgram) {
            System.out.println("==============================================");
            System.out.println("  Selamat datang di menu Login dan Register");
            System.out.println("==============================================");
            System.out.println(" 1. Login");
            System.out.println(" 0. Keluar");
            System.out.println("----------------------------------------------");
            System.out.print(" Silahkan pilih: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();
            
            if (pilihan == 1) {
                System.out.println("==========================");
                System.out.println("      Silahkan Login");
                System.out.println("==========================");
                System.out.print(" Masukkan User ID: ");
                userLogin = scanner.nextLine();
                System.out.print(" Masukkan Password: ");
                userPassword = scanner.nextLine();
                
                if (userLogin.equals(user1.getUserID()) && userPassword.equals(user1.getUserPW())) {
                    boolean keluarMenuUser = false;
                    while (!keluarMenuUser) {
                        System.out.println("================================");
                        System.out.println("    Halo, " + user1.getNama());
                        System.out.println("================================");
                        System.out.println(" 1. Tambah Karya Seni");
                        System.out.println(" 2. Tampilkan Koleksi");
                        System.out.println(" 3. Edit Karya Seni");
                        System.out.println(" 4. Hapus Karya Seni");
                        System.out.println(" 0. Keluar");
                        System.out.println("--------------------------------");
                        System.out.print(" Pilih opsi: ");
                        pilihan = scanner.nextInt();
                        scanner.nextLine();

                        if (pilihan == 1) {
                            user1.createKaryaSeni();
                        } else if (pilihan == 2) {
                            user1.readKaryaSeni();
                        } else if (pilihan == 3) {
                            user1.updateKaryaSeni();
                        } else if (pilihan == 4) {
                            user1.deleteKaryaSeni();
                        } else if (pilihan == 0) {
                            System.out.println("-----------------------");
                            System.out.println(" Kembali ke menu Login.");
                            System.out.println("-----------------------");
                            keluarMenuUser = true;
                        } else {
                            System.out.println("=======================");
                            System.out.println("   Pilhan tidak ada.");
                            System.out.println("=======================");
                        }

                    }
                }
            } else if (pilihan == 0) {
                System.out.println("==========================");
                System.out.println("     Berhasil Keluar");
                System.out.println("==========================");
                keluarProgram = true;
            } else {
                System.out.println("=======================");
                System.out.println("   Pilhan tidak ada.");
                System.out.println("=======================");
                
            }
        } 
    }
}
