package inventory;

public class PermintaanPeminjaman {
    public String nimPeminjam;
    public int idBarang;
    public boolean disetujui;
    public int tanggalPinjam;

    public PermintaanPeminjaman(String nimPeminjam, int idBarang, int tanggalPinjam) {
        this.nimPeminjam = nimPeminjam;
        this.idBarang = idBarang;
        this.tanggalPinjam = tanggalPinjam;
        this.disetujui = false;
    }
}