package transportasi;

import harga.*;

public class Bus extends Transportasi {
    public Bus(String nama, int jumlahKursi, String tujuan) {
        super(nama, jumlahKursi, tujuan);
    }

    @Override
    public double hitungHargaTiket() {
        return Harga.hargaBus * 1.0;
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
