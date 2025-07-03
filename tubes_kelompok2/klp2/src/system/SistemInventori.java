package system;
import calendar.*;
import inventory.*;
import java.util.ArrayList;
import java.util.Scanner;

public class SistemInventori {
    private ArrayList<Pengguna> daftarAdmin = new ArrayList<Pengguna>();
    private ArrayList<Pengguna> daftarPengguna = new ArrayList<Pengguna>();
    private ArrayList<Barang> daftarBarang = new ArrayList<Barang>();
    private ArrayList<PermintaanPeminjaman> daftarPermintaan = new ArrayList<PermintaanPeminjaman>();
    private Scanner input = new Scanner(System.in);

    public SistemInventori() {
        Pengguna admin1 = new Pengguna("001", "Admin Utama");
        daftarAdmin.add(admin1);
        Pengguna admin2 = new Pengguna("002", "Admin Kedua");
        daftarAdmin.add(admin2);
    }

    public boolean loginAdmin(String nim, String nama) {
        for (Pengguna admin : daftarAdmin) {
            if (admin != null && Validasi.isValid(admin.nim, nim) && 
                Validasi.isValid(admin.nama, nama)) {
                return true;
            }
        }
        return false;
    }

    public void kelolaPengguna() {
        System.out.println("\n=== KELOLA PENGGUNA ===");
        System.out.println("1. Tambah Pengguna");
        System.out.println("2. Lihat Pengguna");
        System.out.println("3. Update Pengguna");
        System.out.println("4. Hapus Pengguna");
        System.out.print("Pilih menu: ");
        
        int pilihan = input.nextInt();
        input.nextLine();
        
        switch (pilihan) {
            case 1: tambahPengguna(); 
                break;
            case 2: lihatPengguna(); 
                break;
            case 3: updatePengguna(); 
                break;
            case 4: hapusPengguna(); 
                break;
            default: System.out.println("Pilihan tidak valid!");
        }
    }

    private void tambahPengguna() {
        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();
        Pengguna penggunaBaru = new Pengguna(nim, nama);
        daftarPengguna.add(penggunaBaru);
        System.out.println("Pengguna berhasil ditambahkan!");
    }

    private void lihatPengguna() {
        System.out.println("\nDaftar Pengguna:");
        for (Pengguna p : daftarPengguna) {
            if (p != null) {
                System.out.println(p.nim + " - " + p.nama);
            }
        }
    }

    private void updatePengguna() {
        System.out.print("Masukkan NIM yang akan diupdate: ");
        String nim = input.nextLine();
        
        Pengguna p = cariPengguna(nim);
        if (p == null) {
            System.out.println("Pengguna tidak ditemukan!");
            return;
        }
        
        System.out.print("Masukkan Nama baru: ");
        p.nama = input.nextLine();
        System.out.println("Data pengguna berhasil diupdate!");
    }

    private void hapusPengguna() {
        System.out.print("Masukkan NIM yang akan dihapus: ");
        String nim = input.nextLine();
        
        if (HapusData.hapusPengguna(daftarPengguna, nim)) {
            System.out.println("Pengguna berhasil dihapus!");
        } else {
            System.out.println("Pengguna tidak ditemukan!");
        }
    }

    public void kelolaBarang() {
        System.out.println("\n=== KELOLA BARANG ===");
        System.out.println("1. Tambah Barang");
        System.out.println("2. Lihat Barang");
        System.out.println("3. Update Barang");
        System.out.println("4. Hapus Barang");
        System.out.print("Pilih menu: ");
        
        int pilihan = input.nextInt();
        input.nextLine();
        
        switch (pilihan) {
            case 1: tambahBarang(); 
                break;
            case 2: lihatBarang(); 
                break;
            case 3: updateBarang(); 
                break;
            case 4: hapusBarang(); 
                break;
            default: System.out.println("Pilihan tidak valid!");
        }
    }

    private void tambahBarang() {
        System.out.print("Masukkan ID Barang: ");
        int id = input.nextInt();
        input.nextLine();
        System.out.print("Masukkan Nama Barang: ");
        String nama = input.nextLine();
        
        Barang barangBaru = new Barang(id, nama);
        daftarBarang.add(barangBaru);
        System.out.println("Barang berhasil ditambahkan!");
    }

    private void lihatBarang() {
        System.out.println("\nDaftar Barang:");
        for (Barang b : daftarBarang) {
            if (b != null) {
                String status = b.tersedia ? "Tersedia" : "Dipinjam oleh " + b.peminjam;
                System.out.println(b.id + " - " + b.nama + " [" + status + ", Kondisi: " + b.kondisi + "]");
            }
        }
    }

    private void updateBarang() {
        System.out.print("Masukkan ID Barang yang akan diupdate: ");
        int id = input.nextInt();
        input.nextLine();
        
        Barang b = cariBarang(id);
        if (b == null) {
            System.out.println("Barang tidak ditemukan!");
            return;
        }
        
        System.out.print("Masukkan Nama baru: ");
        b.nama = input.nextLine();
        System.out.println("Data barang berhasil diupdate!");
    }

    private void hapusBarang() {
        System.out.print("Masukkan ID Barang yang akan dihapus: ");
        int id = input.nextInt();
        input.nextLine();
        
        if (HapusData.hapusBarang(daftarBarang, id)) {
            System.out.println("Barang berhasil dihapus!");
        } else {
            System.out.println("Barang tidak ditemukan!");
        }
    }

    public void menuPeminjaman() {
        System.out.println("\n=== MENU PEMINJAMAN ===");
        System.out.println("1. Ajukan Peminjaman");
        System.out.println("2. Setujui Peminjaman");
        System.out.print("Pilih menu: ");
        
        int pilihan = input.nextInt();
        input.nextLine();
        
        switch (pilihan) {
            case 1: ajukanPeminjaman(); 
                break;
            case 2: setujuiPeminjaman(); 
                break;
            default: System.out.println("Menu tidak valid!");
        }
    }

    private void ajukanPeminjaman() {
        System.out.print("Masukkan NIM Peminjam: ");
        String nim = input.nextLine();
        
        if (cariPengguna(nim) == null) {
            System.out.println("NIM tidak terdaftar! Silakan daftarkan pengguna terlebih dahulu.");
            return;
        }
        
        lihatBarangTersedia();
        System.out.print("Masukkan ID Barang yang ingin dipinjam: ");
        int idBarang = input.nextInt();
        System.out.print("Masukkan Tanggal Pinjam (1-30): ");
        int tanggal = input.nextInt();
        input.nextLine();
        
        if (!Kalender.isValidTanggal(tanggal)) {
            System.out.println("Tanggal tidak valid!");
            return;
        }
        
        Barang barang = cariBarang(idBarang);
        if (barang == null) {
            System.out.println("Barang tidak ditemukan!");
            return;
        }
        
        if (!barang.tersedia) {
            System.out.println("Barang sedang dipinjam!");
            return;
        }
        
        PermintaanPeminjaman baru = new PermintaanPeminjaman(nim, idBarang, tanggal);
        daftarPermintaan.add(baru);
        System.out.println("Permintaan peminjaman berhasil diajukan!");
    }

    private void setujuiPeminjaman() {
        if (daftarPermintaan.isEmpty()) {
            System.out.println("Tidak ada permintaan peminjaman!");
            return;
        }
        
        System.out.println("\nDaftar Permintaan Peminjaman:");
        for (PermintaanPeminjaman p : daftarPermintaan) {
            if (!p.disetujui) {
                System.out.println("NIM: " + p.nimPeminjam + ", Barang ID: " + p.idBarang + ", Tanggal: " + p.tanggalPinjam);
            }
        }

        System.out.print("Masukkan NIM Peminjam: ");
        String nim = input.nextLine();
        System.out.print("Masukkan ID Barang: ");
        int idBarang = input.nextInt();
        input.nextLine();

        for (PermintaanPeminjaman p : daftarPermintaan) {
            if (p.nimPeminjam.equals(nim) && p.idBarang == idBarang && !p.disetujui) {
                p.disetujui = true;
                Barang b = cariBarang(p.idBarang);
                if (b != null) {
                    b.tersedia = false;
                    b.peminjam = p.nimPeminjam;
                    b.tanggalPinjam = p.tanggalPinjam;
                }
                System.out.println("Permintaan peminjaman disetujui!");
                return;
            }
        }
        System.out.println("Permintaan peminjaman tidak ditemukan!");
    }

    public void menuPengembalian() {
        System.out.println("\n=== PENGEMBALIAN BARANG ===");
        System.out.print("Masukkan NIM Peminjam: ");
        String nim = input.nextLine();
        System.out.print("Masukkan ID Barang: ");
        int id = input.nextInt();
        System.out.print("Masukkan Tanggal Kembali (1-30): ");
        int tglKembali = input.nextInt();
        input.nextLine();
        
        if (!Kalender.isValidTanggal(tglKembali)) {
            System.out.println("Tanggal tidak valid!");
            return;
        }

        Barang b = cariBarang(id);
        if (b == null || !b.peminjam.equals(nim)) {
            System.out.println("Data tidak valid!");
            return;
        }

        b.tersedia = true;
        b.peminjam = "";
        
        int selisih = Kalender.getSelisihHari(b.tanggalPinjam, tglKembali);
        if (selisih > 7) {
            System.out.println("Keterlambatan: " + (selisih-7) + " hari");
        } else {
            System.out.println("Barang berhasil dikembalikan tepat waktu!");
        }
    }

    public void menuLaporan() {
        System.out.println("\n=== MENU LAPORAN ===");
        System.out.println("1. Lihat Barang Tersedia");
        System.out.println("2. Lihat Barang Dipinjam");
        System.out.println("3. Laporkan Kondisi Barang");
        System.out.print("Pilih menu: ");
        
        int pilihan = input.nextInt();
        input.nextLine();
        
        switch (pilihan) {
            case 1: lihatBarangTersedia(); 
                break;
            case 2: lihatBarangDipinjam(); 
                break;
            case 3: laporkanKondisiBarang(); 
                break;
            default: System.out.println("Menu tidak valid!");
        }
    }

    private void lihatBarangTersedia() {
        System.out.println("\nDaftar Barang Tersedia:");
        for (Barang b : daftarBarang) {
            if (b != null && b.tersedia) {
                System.out.println("ID: " + b.id + " - " + b.nama + " (Kondisi: " + b.kondisi + ")");
            }
        }
    }

    private void lihatBarangDipinjam() {
        System.out.println("\nDaftar Barang Dipinjam:");
        for (Barang b : daftarBarang) {
            if (b != null && !b.tersedia) {
                System.out.println("ID: " + b.id + " - " + b.nama + " (Dipinjam oleh: " + b.peminjam + ")");
            }
        }
    }

    private void laporkanKondisiBarang() {
        System.out.println("\n=== LAPORKAN KONDISI BARANG ===");
        lihatBarang();
        System.out.print("Masukkan ID Barang: ");
        int id = input.nextInt();
        input.nextLine();
        
        Barang b = cariBarang(id);
        if (b == null) {
            System.out.println("Barang tidak ditemukan!");
            return;
        }
        
        System.out.println("\nPilih kondisi barang:");
        System.out.println("1. Baik");
        System.out.println("2. Rusak Ringan");
        System.out.println("3. Rusak Berat");
        System.out.print("Pilih kondisi (1-3): ");
        
        int kondisi = input.nextInt();
        input.nextLine();
        
        switch (kondisi) {
            case 1: 
                b.kondisi = "baik";
                break;
            case 2: 
                b.kondisi = "rusak ringan";
                break;
            case 3: 
                b.kondisi = "rusak berat";
                break;
            default: 
                System.out.println("Pilihan tidak valid!");
                return;
        }
        
        System.out.println("Kondisi barang " + b.nama + " berhasil diperbarui!");
        System.out.println("Kondisi terbaru: " + b.kondisi);
    }

    private Pengguna cariPengguna(String nim) {
        for (Pengguna p : daftarPengguna) {
            if (p != null && p.nim.equals(nim)) {
                return p;
            }
        }
        return null;
    }

    private Barang cariBarang(int id) {
        for (Barang b : daftarBarang) {
            if (b != null && b.id == id) {
                return b;
            }
        }
        return null;
    }
}