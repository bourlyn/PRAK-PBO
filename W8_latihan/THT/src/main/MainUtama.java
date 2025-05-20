package main;
import java.util.Scanner;
import model.Pemain;
import model.DuniaGame;
import util.PenyimpananData;

public class MainUtama {
    private static Scanner input = new Scanner(System.in);
    private static DuniaGame duniaGame = new DuniaGame();
    private static Pemain pemainSaatIni = null;

    public static void main(String[] args) {
        System.out.println("Selamat datang di Dunia Petualangan!\n");

        while (true) {
            if (pemainSaatIni == null) {
                tampilkanMenuLogin();
            } else {
                tampilkanMenuGame();
            }
        }
    }

    private static void tampilkanMenuLogin() {
        System.out.println("1. Login");
        System.out.println("2. Daftar");
        System.out.println("3. Keluar");
        System.out.print("Pilihan: ");

        int pilihan = input.nextInt();
        input.nextLine(); 

        switch (pilihan) {
            case 1:
                prosesLogin();
                break;
            case 2:
                prosesDaftar();
                break;
            case 3:
                System.out.println("Terima kasih telah bermain!");
                System.exit(0);
            default:
                System.out.println("Pilihan tidak valid!");
        }
    }

    private static void prosesLogin() {
        System.out.print("\nUsername: ");
        String username = input.nextLine();
        System.out.print("Password: ");
        String password = input.nextLine();

        Pemain pemain = PenyimpananData.cariPemain(username);
        if (pemain != null && pemain.getPassword().equals(password)) {
            pemainSaatIni = pemain;
            System.out.println("\nLogin berhasil! Selamat datang, " + username + "!");
            System.out.println("Level Anda: " + pemain.getLevel());
        } else {
            System.out.println("\nUsername atau password salah!");
        }
    }

    private static void prosesDaftar() {
        System.out.print("\nBuat username: ");
        String username = input.nextLine();

        if (PenyimpananData.cekUsername(username)) {
            System.out.println("Username sudah digunakan!");
            return;
        }

        System.out.print("Buat password: ");
        String password = input.nextLine();

        Pemain pemainBaru = new Pemain(username, password);
        PenyimpananData.tambahPemain(pemainBaru);
        System.out.println("\nPendaftaran berhasil! Silakan login.");
    }

    private static void tampilkanMenuGame() {
        System.out.println("\n=== MENU UTAMA ===");
        System.out.println("1. Jelajahi dunia");
        System.out.println("2. Lihat inventori");
        System.out.println("3. Lihat posisi");
        System.out.println("4. Lihat level & XP");
        System.out.println("5. Logout");
        System.out.print("Pilihan: ");

        int pilihan = input.nextInt();
        input.nextLine();

        switch (pilihan) {
            case 1:
                jelajahiDunia();
                break;
            case 2:
                pemainSaatIni.tampilkanInventori();
                break;
            case 3:
                System.out.println("Posisi Anda: " + pemainSaatIni.getPosisi());
                break;
            case 4:
                tampilkanLevelDanXP();
                break;
            case 5:
                pemainSaatIni = null;
                System.out.println("Anda telah logout.");
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }
    }

    private static void tampilkanLevelDanXP() {
        System.out.println("\n=== STATUS PEMAIN ===");
        System.out.println("Level: " + pemainSaatIni.getLevel());
        System.out.println("XP: " + pemainSaatIni.getExp() + "/" + pemainSaatIni.getMaxExp());
        System.out.println("Posisi: " + pemainSaatIni.getPosisi());
    }

    private static void jelajahiDunia() {
        int gerakan = duniaGame.gerakanAcak();
        int posisiBaru = pemainSaatIni.getPosisi() + gerakan;
        pemainSaatIni.setPosisi(posisiBaru);
        
        String arah = "lurus";
        if (gerakan == -1) {
            arah = "kiri";
        } else if (gerakan == 1) {
            arah = "kanan";
        }

        System.out.println("\nAnda bergerak ke posisi: " + arah);
        System.out.println("Posisi sekarang: " + posisiBaru);
        
        String[] hasil = duniaGame.kejadianRandom();
        System.out.println(hasil[0]);

        if (hasil[1] != null) {
            pemainSaatIni.tambahItem(hasil[1]);
            int xp = new java.util.Random().nextInt(21) + 10; // XP acak antara 10–30
            pemainSaatIni.tambahExp(xp);
        } 
        else if (hasil[0].equals("Diserang Goblin")) {
            pemainSaatIni.kurangiLevel();
        }
    }
}