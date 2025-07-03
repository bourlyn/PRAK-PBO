package kelola;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.*;

public class KelolaLaporan implements Kelola {
    private List<Laporan> laporanList;
    private KelolaBarang kelolaBarang;
    private Scanner scanner;

    public KelolaLaporan(KelolaBarang kelolaBarang) {
        this.laporanList = new ArrayList<>();
        this.kelolaBarang = kelolaBarang;
        this.scanner = new Scanner(System.in);
    }

       public void menu() {
        while (true) {
            System.out.println("\n=== LAPORAN BARANG ===");
            System.out.println("1. Buat Laporan");
            System.out.println("2. Lihat Laporan");
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
                case "0": 
                    return;
                default: 
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        }
    }

    @Override
    public void tambah() {
        System.out.println("\n=== INPUT LAPORAN BARANG ===");
        kelolaBarang.lihat();
        System.out.print("\nMasukkan ID Barang: ");
        int idBarang = scanner.nextInt();
        scanner.nextLine();

        Barang barang = kelolaBarang.cariBarang(idBarang);
        if (barang == null) {
            System.out.println("Barang tidak ditemukan!");
            return;
        }

        System.out.print("Keterangan Kerusakan: ");
        String keterangan = scanner.nextLine();
        System.out.print("Nama Pelapor: ");
        String pelapor = scanner.nextLine();

        Laporan laporan = new Laporan(barang, keterangan, pelapor);
        laporanList.add(laporan);
        barang.setTersedia(false);
        System.out.println("Laporan berhasil dibuat.\n");
    }

    @Override
    public void lihat() {
        System.out.println("\n=== DAFTAR LAPORAN ===");
        if (laporanList.isEmpty()) {
            System.out.println("Belum ada laporan.");
            return;
        }

        for (Laporan l : laporanList) {
            System.out.println("ID Barang: " + l.getBarang().getId() + 
                            ", Nama Barang: " + l.getBarang().getNama() +
                            ", Keterangan: " + l.getKeterangan() +
                            ", Pelapor: " + l.getPelapor());
        }
    }

    @Override
    public void edit() {
    }
    @Override
    public void hapus() {
    }
}