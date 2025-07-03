package app;
import system.SistemInventori;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SistemInventori sistem = new SistemInventori();
        Scanner input = new Scanner(System.in);

        System.out.println("=== LOGIN ADMIN ===");
        System.out.print("Masukkan NIM Admin: ");
        String nimAdmin = input.nextLine();
        System.out.print("Masukkan Nama Admin: ");
        String namaAdmin = input.nextLine();

        if (!sistem.loginAdmin(nimAdmin, namaAdmin)) {
            System.out.println("Akses ditolak!");
            return;
        }

        while (true) {
            System.out.println("\n=== MENU UTAMA ===");
            System.out.println("1. Kelola Pengguna");
            System.out.println("2. Kelola Barang");
            System.out.println("3. Peminjaman");
            System.out.println("4. Pengembalian");
            System.out.println("5. Laporan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");

            int menu = input.nextInt();
            input.nextLine();

            switch (menu) {
                case 1: sistem.kelolaPengguna(); 
                    break;
                case 2: sistem.kelolaBarang(); 
                    break;
                case 3: sistem.menuPeminjaman(); 
                    break;
                case 4: sistem.menuPengembalian(); 
                    break;
                case 5: sistem.menuLaporan(); 
                    break;
                case 0: 
                    System.out.println("Selesai Cihuyy!");
                    return;
                default: System.out.println("Menu tidak valid!");
                    
                input.close();
            }
        }
    }
}