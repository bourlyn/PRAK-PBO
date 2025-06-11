package kendaraan;

public abstract class Kendaraan {
    private String plat;
    private String merk;
    private int tahun;

    public Kendaraan(String plat, String merk, int tahun) {
        this.plat = plat;
        this.merk = merk;
        this.tahun = tahun;
    }

    public void tampilkanInfo() {
        System.out.println("Plat: " + plat);
        System.out.println("Merk: " + merk);
        System.out.println("Tahun: " + tahun);
    }

    public abstract int hitungBiayaSewa(int hari);
    public abstract boolean perluSupir();

    public String getPlat() {
        return plat;
    }

    public String getMerk() {
        return merk;
    }

    public int getTahun() {
        return tahun;
    }
}