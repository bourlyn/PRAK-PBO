import librarysystem.Buku;
import librarysystem.Perpustakaan;
import librarysystem.User;

public class Main 
{
    public static void main(String[] args) 
    {
        Perpustakaan perpus = new Perpustakaan(3);
        Buku buku1 = new Buku("Pemrograman Java", "zulfa kurniawan", 2020);
        Buku buku2 = new Buku("Dasar Algoritma", "mery kurniawan", 2019);
        
        perpus.tambahBuku(buku1);
        perpus.tambahBuku(buku2);
        perpus.tampilkanBuku();
        
        User user1 = new User("Andi", "001");
        user1.pinjamBuku(perpus, "Pemrograman Java");
        perpus.tampilkanBuku();
        user1.kembalikanBuku(perpus, "Pemrograman Java");
        perpus.tampilkanBuku();
    }
}