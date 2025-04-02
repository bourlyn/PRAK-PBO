package librarysystem;

public class Buku 
{
    // Atribut private
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private boolean statusDipinjam;
    private static int jumlahBukuTersedia = 0; 
    
    // konstraktor
    public Buku(String judul, String penulis, int tahunTerbit) 
    {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.statusDipinjam = false;
        jumlahBukuTersedia++; 
    }
    
    // Getter + setter
    public String getJudul() 
    {
        return judul;
    }
    
    public String getPenulis() 
    {
        return penulis;
    }
    
    public int getTahunTerbit() 
    {
        return tahunTerbit;
    }
    
    public boolean isStatusDipinjam() 
    {
        return statusDipinjam;
    }
    
    public static int getJumlahBukuTersedia() 
    {
        return jumlahBukuTersedia;
    }
    
    // void meminjam buku
    public void pinjamBuku() 
    {
        if (!statusDipinjam) 
        {
            statusDipinjam = true;
            jumlahBukuTersedia--;
            System.out.println("Buku " + judul + " berhasil dipinjam");
        } else 
        {
            System.out.println("Buku " + judul + " sedang dipinjam");
        }
    }
    
    // void mengembalikan buku
    public void kembalikanBuku() 
    {
        if (statusDipinjam) 
        {
            statusDipinjam = false;
            jumlahBukuTersedia++;
            System.out.println("Buku " + judul + " berhasil dikembalikan");
        } else 
        {
            System.out.println("Buku " + judul + " tidak sedang dipinjam");
        }
    }
    
    // void menampilkan info buku
    public void infoBuku() 
    {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Tahun: " + tahunTerbit);
        System.out.println("Status: " + (statusDipinjam ? "Dipinjam" : "Tersedia"));
        System.out.println("---------------------");
    }
}