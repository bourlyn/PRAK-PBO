package kelola;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.*;

public class KelolaBarang implements Kelola {  
    private List<Barang> barangList;
    private Scanner scanner;

    public KelolaBarang() {
        this.scanner = new Scanner(System.in);
        this.barangList = new ArrayList<>();
    }

    @Override
    public void tambah() {
        
        System.out.println("\n=== TAMBAH BARANG ===");
        System.out.print("Masukkan ID Barang: ");
        int id = scanner.nextInt();
        if (cariBarang(id) != null) {
            System.out.println("ID Barang sudah ada. Harap masukkan ID yang berbeda.");
            return;
        }

        scanner.nextLine();
        System.out.print("Masukkan Nama Barang: ");
        String nama = scanner.nextLine();
        
        barangList.add(new Barang(id, nama));
        System.out.println("Barang berhasil ditambahkan!");
    }

    @Override
    public void lihat() {
        System.out.println("\n=== DAFTAR BARANG ===");
        if (barangList.isEmpty()) {
            System.out.println("Tidak ada barang tersedia.");
            return;
        }
        
        for (Barang barang : barangList) {
            System.out.println("ID: " + barang.getId() + ", Nama: " + barang.getNama() + " --- " + (barang.isTersedia() ? "Tersedia" : "Dipinjam"));
        }
    }

    @Override
    public void edit() {
        System.out.println("\n=== EDIT BARANG ===");
        lihat();
        System.out.print("Masukkan ID Barang yang akan diedit: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        
        Barang barang = cariBarang(id);
        if (barang == null) {
            System.out.println("Barang tidak ditemukan!");
            return;
        }

        System.out.print("Masukkan Nama Baru: ");
        String namaBaru = scanner.nextLine();
        barang.setNama(namaBaru);
        
        System.out.println("Barang berhasil diupdate!");
    }

    @Override
    public void hapus() {
        System.out.println("\n=== HAPUS BARANG ===");
        lihat();
        System.out.print("Masukkan ID Barang yang akan dihapus: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        
        Barang barang = cariBarang(id);
        if (barang == null) {
            System.out.println("ID Barang tidak ditemukan!");
            return;
        }

        if (!barang.isTersedia()) {
            System.out.println("Barang sedang dipinjam, tidak bisa dihapus!");
            return;
        }

        barangList.remove(barang);
        System.out.println("Barang berhasil dihapus!");
    }

    public Barang cariBarang(int id) {
        for (Barang b : barangList) {
            if (b.getId() == id) {
                return b;
            }
        }
        return null;
    }

    public void menu() {
        while (true) {
            System.out.println("\n=== KELOLA BARANG ===");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Lihat Barang");
            System.out.println("3. Edit Barang");
            System.out.println("4. Hapus Barang");
            System.out.println("0. Kembali");
            System.out.print("Pilih: ");

            int pilihan = scanner.nextInt();
            scanner.nextLine();
            
            switch (pilihan) {
                case 1:
                    tambah();
                    break;
                case 2:
                    lihat();
                    break;
                case 3:
                    edit();
                    break;
                case 4:
                    hapus();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        }
    }
}