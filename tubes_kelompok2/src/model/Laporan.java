package model;

public class Laporan {
    private Barang barang;
    private String keterangan;
    private String pelapor;

    public Laporan(Barang barang, String keterangan, String pelapor) {
        this.barang = barang;
        this.keterangan = keterangan;
        this.pelapor = pelapor;
    }

    public Barang getBarang() { return barang; }
    public String getKeterangan() { return keterangan; }
    public String getPelapor() { return pelapor; }
}