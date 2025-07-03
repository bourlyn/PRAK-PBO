package model;

public class Barang {
    private int id;
    private String nama;
    private boolean tersedia;

    public Barang(int id, String nama) {
        this.id = id;
        this.nama = nama;
        this.tersedia = true;
    }

    public int getId() { return id; }
    public String getNama() { return nama; }
    public boolean isTersedia() { return tersedia; }
    public void setNama(String nama) { this.nama = nama; }
    public void setTersedia(boolean tersedia) { this.tersedia = tersedia; }
}