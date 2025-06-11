package kendaraan;
import interfaces.DapatDisewa;
import interfaces.Muatan;

public class Truk extends Kendaraan implements DapatDisewa, Muatan {
    private static final int hargaSewa = 1200; 
    private int kapasitasMuatan;

    public Truk(String plat, String merk, int tahun, int kapasitasMuatan) {
        super(plat, merk, tahun);
        this.kapasitasMuatan = kapasitasMuatan;
    }

    @Override
    public int hitungBiayaSewa(int hari) {
        return hargaSewa * hari;
    }

    @Override
    public boolean perluSupir() {
        return true;
    }

    @Override
    public int getKapasitasMuatan() {
        return kapasitasMuatan;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("\n=== TRUK ===");
        super.tampilkanInfo();
        System.out.println("Kapasitas muatan: " + kapasitasMuatan + " kg");
        System.out.println("Biaya sewa: Rp" + hargaSewa + " ribu/hari");
    }
}