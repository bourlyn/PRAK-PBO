package transportasi;

public class Transportasi {
    private String nama;
    private int jumlahKursi;
    private String tujuan;

    public Transportasi(String nama, int jumlahKursi, String tujuan) {
        this.nama = nama;
        this.jumlahKursi = jumlahKursi;
        this.tujuan = tujuan;
    }

    public String getNama() {
        return nama;
    }

    public int getJumlahKursi() {
        return jumlahKursi;
    }

    public String getTujuan() {
        return tujuan;
    }

    public double hitungHargaTiket() {
        return 100000;
    }

    public void displayInfo() {
        System.out.println("Transportasi: " + nama);
        System.out.println("Jumlah Kursi: " + jumlahKursi);
        System.out.println("Tujuan: " + tujuan);
    }
}
