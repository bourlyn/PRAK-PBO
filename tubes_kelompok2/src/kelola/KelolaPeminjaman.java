package kelola;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.*;

public class KelolaPeminjaman {
    private List<Peminjaman> peminjamanList;
    private KelolaPengguna kelolaPengguna;
    private KelolaBarang kelolaBarang;
    private Scanner scanner;

    public KelolaPeminjaman(KelolaPengguna kelolaPengguna, KelolaBarang kelolaBarang) {
        this.peminjamanList = new ArrayList<>();
        this.kelolaPengguna = kelolaPengguna;
        this.kelolaBarang = kelolaBarang;
        this.scanner = new Scanner(System.in);
    }

    public void menuPeminjaman() {
        while (true) {
            System.out.println("\n=== KELOLA PEMINJAMAN ===");
            System.out.println("1. Request Peminjaman");
            System.out.println("2. Approve Peminjaman");
            System.out.println("3. Pengembalian Barang");
            System.out.println("0. Kembali");
            System.out.print("Pilih: ");

            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    requestPeminjaman();
                    break;
                case 2:
                    approvePeminjaman();
                    break;
                case 3:
                    menuPengembalian();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        }
    }

    private void requestPeminjaman() {
        System.out.println("\n=== REQUEST PEMINJAMAN ===");
        
        // Tampilkan dan pilih mahasiswa
        kelolaPengguna.lihat();
        System.out.print("ID Mahasiswa: ");
        Pengguna peminjam = kelolaPengguna.cariPengguna(scanner.nextLine());
        if (peminjam == null) {
            System.out.println("Mahasiswa tidak ditemukan!");
            return;
        }

        // Tampilkan dan pilih barang
        kelolaBarang.lihat();
        System.out.print("ID Barang: ");
        Barang barang = kelolaBarang.cariBarang(scanner.nextInt());
        scanner.nextLine();
        if (barang == null || !barang.isTersedia()) {
            System.out.println("Barang tidak tersedia!");
            return;
        }

        // Input tanggal
        System.out.print("Tanggal Pinjam (1-30): ");
        int tglPinjam = scanner.nextInt();
        scanner.nextLine();
        if (tglPinjam < 1 || tglPinjam > 30) {
            System.out.println("Tanggal Pinjam INVALID!");
            return;
        }

        // Buat peminjaman
        peminjamanList.add(new Peminjaman(peminjam, barang, tglPinjam));
        System.out.println("Peminjaman berhasil diajukan!");
    }

    private void approvePeminjaman() {
        System.out.println("\n=== APPROVE PEMINJAMAN ===");
        
        // Cari peminjaman yang belum disetujui
        boolean adaRequest = false;
        for (Peminjaman p : peminjamanList) {
            if (!p.isDisetujui()) {
                System.out.println("ID Barang: " + p.getBarang().getId() + 
                                 " | Barang: " + p.getBarang().getNama() + 
                                 " | Peminjam: " + p.getPeminjam().getNama());
                adaRequest = true;
            }
        }

        if (!adaRequest) {
            System.out.println("Tidak ada request peminjaman!");
            return;
        }

        // Proses approval
        System.out.print("ID Barang yang disetujui: ");
        int idBarang = scanner.nextInt();
        scanner.nextLine();

        for (Peminjaman p : peminjamanList) {
            if (p.getBarang().getId() == idBarang && !p.isDisetujui()) {
                p.setDisetujui(true);
                System.out.println("Peminjaman disetujui!");
                return;
            }
        }
        System.out.println("Request tidak ditemukan!");
    }

    private void menuPengembalian() {
        System.out.println("\n=== PENGEMBALIAN BARANG ===");
        System.out.print("ID Barang: ");
        int idBarang = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Tanggal Kembali (1-30): ");
        int tglKembali = scanner.nextInt();
        scanner.nextLine();
        if (tglKembali < 1 || tglKembali > 30) {
            System.out.println("Tanggal Kembali INVALID!");
            return;
        }

        // Proses pengembalian
        for (Peminjaman p : peminjamanList) {
            if (p.getBarang().getId() == idBarang && p.isDisetujui() && !p.isDikembalikan()) {
                p.hitungDenda(tglKembali);
                p.setDikembalikan(true);
                System.out.println(p.getDenda() > 0 ? 
                    "Terlambat! Denda: Rp" + p.getDenda() : 
                    "Tepat waktu");
                return;
            }
        }
        System.out.println("Data peminjaman tidak ditemukan!");
    }
}