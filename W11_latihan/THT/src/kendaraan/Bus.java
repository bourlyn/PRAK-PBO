package kendaraan;

import interfaces.DapatDisewa;

public class Bus extends Kendaraan implements DapatDisewa {
    private static final int hargaSewa = 800; 
    private int kapasitasPenumpang;

    public Bus(String plat, String merk, int tahun, int kapasitasPenumpang) {
        super(plat, merk, tahun);
        this.kapasitasPenumpang = kapasitasPenumpang;
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
    public void tampilkanInfo() {
        System.out.println("\n=== BUS ===");
        super.tampilkanInfo();
        System.out.println("Kapasitas: " + kapasitasPenumpang + " penumpang");
        System.out.println("Biaya sewa: Rp" + hargaSewa + " ribu/hari");
    }
}