import kendaraan.MobilPribadi;
import kendaraan.Bus;
import kendaraan.Truk;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== SISTEM SEWA KENDARAAN =====");
        
        MobilPribadi mobil = new MobilPribadi("B 999 ME", "Honda", 1999);
        Bus bus = new Bus("M 1 RT", "Hino", 2019, 30);
        Truk truk = new Truk("B 9999 SM", "Mitsubishi", 2004, 5000);

        // Mobil Pribadi
        mobil.tampilkanInfo();
        System.out.println("Total sewa 3 hari: Rp. " + mobil.hitungBiayaSewa(3));
        System.out.println("Perlu supir? " + (mobil.perluSupir() ? "Ya" : "Tidak"));

        // Bus
        bus.tampilkanInfo();
        System.out.println("Total sewa 2 hari: Rp. " + bus.hitungBiayaSewa(2));
        System.out.println("Perlu supir? " + (bus.perluSupir() ? "Ya" : "Tidak"));

        // Truk
        truk.tampilkanInfo();
        System.out.println("Total sewa 5 hari: Rp. " + truk.hitungBiayaSewa(5));
        System.out.println("Perlu supir? " + (truk.perluSupir() ? "Ya" : "Tidak"));
        System.out.println("Kapasitas muatan: " + truk.getKapasitasMuatan() + " kg");
        
        System.out.println("\n===== TERIMA KASIH =====");
    }
}