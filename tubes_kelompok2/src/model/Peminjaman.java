package model;

public class Peminjaman {
    private Pengguna peminjam;
    private Barang barang;
    private int tglKembali;
    private boolean disetujui;
    private boolean dikembalikan;
    private int denda;

    public Peminjaman(Pengguna peminjam, Barang barang, int tglPinjam) {
        this.peminjam = peminjam;
        this.barang = barang;
        this.tglKembali = (tglPinjam + 3) % 30;
        if (this.tglKembali == 0) this.tglKembali = 30;
        this.disetujui = false;
        this.dikembalikan = false;
        this.denda = 0;
    }

    public void hitungDenda(int tglKembaliInput) {
        if (tglKembaliInput > tglKembali) {
            int hariTelat = tglKembaliInput - tglKembali;
            this.denda = hariTelat * 5000;
        }
    }

    public Pengguna getPeminjam() { return peminjam; }
    public Barang getBarang() { return barang; }
    public int getTglKembali() { return tglKembali; }
    public boolean isDisetujui() { return disetujui; }
    public boolean isDikembalikan() { return dikembalikan; }
    public int getDenda() { return denda; }
    
    public void setDisetujui(boolean disetujui) { 
        this.disetujui = disetujui;
        if (disetujui) {
            barang.setTersedia(false);
        }
    }
    public void setDikembalikan(boolean dikembalikan) { 
        this.dikembalikan = dikembalikan;
        if (dikembalikan) {
            barang.setTersedia(true);
        }
    }
}