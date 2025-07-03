package model;
import java.util.Scanner;
import kelola.*;

public class Main {
    public static void main(String[] args) {
        KelolaPengguna kelolaPengguna = new KelolaPengguna();
        KelolaBarang kelolaBarang = new KelolaBarang();
        KelolaPeminjaman kelolaPeminjaman = new KelolaPeminjaman(kelolaPengguna, kelolaBarang);
        KelolaLaporan kelolaLaporan = new KelolaLaporan(kelolaBarang);
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== LOGIN ===");
        System.out.print("ID Admin: ");
        String id = scanner.nextLine();
        System.out.print("Nama Admin: ");
        String nama = scanner.nextLine();
        
        if (!kelolaPengguna.loginAdmin(id, nama)) {
            System.out.println("Login gagal!");
            scanner.close();
            return ;
        }

        while (true) {
            System.out.println("\n=== MENU UTAMA ===");
            System.out.println("1. Kelola Pengguna");
            System.out.println("2. Kelola Barang");
            System.out.println("3. Kelola Peminjaman");
            System.out.println("4. Kelola Laporan");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
                
            String pilihan = scanner.nextLine();
                
            switch (pilihan) {
                case "1":
                    kelolaPengguna.menu();
                    break;
                case "2":
                    kelolaBarang.menu();
                    break;
                case "3":
                    kelolaPeminjaman.menuPeminjaman();
                    break;
                case "4":
                    kelolaLaporan.menu();
                    break;
                case "0":
                    System.out.println("Program Selesai");
                    scanner.close();
                    return;
                default:
                    System.out.println("Harap masukkan 0-4!");
                    
                }
            }
        }
    }
