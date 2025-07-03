package inventory;

public class Barang {
    public int id;
    public String nama;
    public boolean tersedia;
    public String peminjam;
    public int tanggalPinjam;
    public String kondisi; // "baik", "rusak ringan", "rusak berat"

    public Barang(int id, String nama) {
        this.id = id;
        this.nama = nama;
        this.tersedia = true;
        this.peminjam = "";
        this.tanggalPinjam = 0;
        this.kondisi = "baik";
    }
}