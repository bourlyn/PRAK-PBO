package kelola;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.*;

public class KelolaPengguna implements Kelola {  
    private List<Pengguna> penggunaList;
    private Scanner scanner;

    public KelolaPengguna() {
        this.scanner = new Scanner(System.in);
        this.penggunaList = new ArrayList<>();
        penggunaList.add(new Admin("020", "ruben"));
        penggunaList.add(new Admin("022", "calvin"));
        penggunaList.add(new Admin("026", "firsta"));
        penggunaList.add(new Admin("048", "umran"));
        penggunaList.add(new Admin("050", "naupal"));
        penggunaList.add(new Admin("038", "natha"));
    }

    @Override
    public void tambah() {
        System.out.println("\n=== TAMBAH PENGGUNA ===");
        System.out.print("Masukkan ID: ");
        String id = scanner.nextLine();
        if (cariPengguna(id) != null) {
            System.out.println("ID Pengguna sudah ada. Harap masukkan ID yang berbeda.");
            return;
        }

        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        
        penggunaList.add(new Mahasiswa(id, nama));
        System.out.println("Pengguna berhasil ditambahkan!");
    }

    @Override
    public void lihat() {
        System.out.println("\n=== DAFTAR MAHASISWA ===");
        if (penggunaList.isEmpty()) {
            System.out.println("Tidak ada mahasiswa terdaftar.");
            return;
        }
        for (Pengguna pengguna : penggunaList) {
            if (pengguna instanceof Mahasiswa m) {
                System.out.println(m.getId() + " - " + m.getNama() + " - " + m.getRole());
            }
        }
    }

    @Override
    public void edit() {
        System.out.println("\n=== EDIT PENGGUNA ===");
        lihat();
        System.out.print("Masukkan ID Pengguna yang akan diedit: ");
        String id = scanner.nextLine();
        
        Pengguna pengguna = cariPengguna(id);
        if (pengguna == null) {
            System.out.println("Pengguna tidak ditemukan!");
            return;
        }

        System.out.print("Masukkan Nama Baru: ");
        String namaBaru = scanner.nextLine();
        pengguna.setNama(namaBaru);
        
        System.out.println("Pengguna berhasil diupdate!");
    }

    @Override
    public void hapus() {
        System.out.println("\n=== HAPUS PENGGUNA ===");
        lihat();
        System.out.print("Masukkan ID Pengguna yang akan dihapus: ");
        String id = scanner.nextLine();
        
        Pengguna pengguna = cariPengguna(id);
        if (pengguna == null) {
            System.out.println("ID Pengguna tidak ditemukan!");
            return;
        }

        penggunaList.remove(pengguna);
        System.out.println("Pengguna berhasil dihapus!");
    }

    public boolean loginAdmin(String id, String nama) {
        for (Pengguna p : penggunaList) {
            if (p instanceof Admin && 
                p.getId().equals(id) && 
                p.getNama().equals(nama)) {
                return true;
            }
        }
        return false;
    }

    public Pengguna cariPengguna(String id) {
        for (Pengguna p : penggunaList) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    public void menu() {
        while (true) {
            System.out.println("\n=== KELOLA PENGGUNA ===");
            System.out.println("1. Tambah Pengguna");
            System.out.println("2. Lihat Pengguna");
            System.out.println("3. Edit Pengguna");
            System.out.println("4. Hapus Pengguna");
            System.out.println("0. Kembali");
            System.out.print("Pilih: ");

            String pilihan = scanner.nextLine();
            
            switch (pilihan) {
                case "1":
                    tambah();
                    break;
                case "2":
                    lihat();
                    break;
                case "3":
                    edit();
                    break;
                case "4":
                    hapus();
                    break;
                case "0":
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        }
    }
}