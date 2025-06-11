package kendaraan;
import interfaces.DapatDisewa;

public class MobilPribadi extends Kendaraan implements DapatDisewa {
    private static final int hargaSewa = 300; 

    public MobilPribadi(String plat, String merk, int tahun) {
        super(plat, merk, tahun);
    }

    @Override
    public int hitungBiayaSewa(int hari) {
        return hargaSewa * hari;
    }

    @Override
    public boolean perluSupir() {
        return false;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("\n=== MOBIL PRIBADI ===");
        super.tampilkanInfo();
        System.out.println("Biaya sewa: Rp" + hargaSewa + " ribu/hari");
    }
}