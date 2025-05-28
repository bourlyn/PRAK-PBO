package transportasi;

import harga.*;

public class Kereta extends Transportasi {
    public Kereta(String nama, int jumlahKursi, String tujuan) {
        super(nama, jumlahKursi, tujuan);
    }

    @Override
    public double hitungHargaTiket() {
        return Harga.hargaKereta * 1.2;
    }

    public double hitungHargaTiket(String kelasLayanan) {
        double harga = hitungHargaTiket();
        switch (kelasLayanan.toLowerCase()) {
            case "bisnis": return harga * 1.25;
            case "vip": return harga * 1.50;
            default: return harga;
        }
    }
}
