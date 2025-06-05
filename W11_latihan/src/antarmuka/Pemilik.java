package antarmuka;

public abstract class Pemilik {
    String nama;

    public Pemilik(String nama) {
        this.nama = nama;
    }
    
    public abstract void pemilikKendaraan(String namaPemilik);
}