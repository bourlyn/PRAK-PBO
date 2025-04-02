package librarysystem;

public class User 
{
    // Atribut private
    private String nama;
    private String id;
    
    // konstruktor
    public User(String nama, String id) 
    {
        this.nama = nama;
        this.id = id;
    }
    
    // Getter
    public String getNama() 
    {
        return nama;
    }
    
    // void meminjam buku
    public void pinjamBuku(Perpustakaan perpus, String judul) 
    {
        Buku buku = perpus.cariBuku(judul);
        if (buku != null) 
        {
            buku.pinjamBuku();
        } else 
        {
            System.out.println("Buku tidak ditemukan");
        }
    }
    
    // void mengembalikan buku
    public void kembalikanBuku(Perpustakaan perpus, String judul) 
    {
        Buku buku = perpus.cariBuku(judul);
        if (buku != null) 
        {
            buku.kembalikanBuku();
        } else 
        {
            System.out.println("Buku tidak ditemukan");
        }
    }
}