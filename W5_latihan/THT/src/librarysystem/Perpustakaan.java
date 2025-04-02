package librarysystem;

public class Perpustakaan 
{
    // atribut
    private Buku[] daftarBuku;
    private int jumlahBuku;
    
    // konstruktor
    public Perpustakaan(int kapasitas) 
    {
        daftarBuku = new Buku[kapasitas];
        jumlahBuku = 0;
    }
    
    // void menambah buku
    public void tambahBuku(Buku buku) 
    {
        if (jumlahBuku < daftarBuku.length) 
        {
            daftarBuku[jumlahBuku] = buku;
            jumlahBuku++;
            System.out.println("Buku " + buku.getJudul() + " berhasil ditambahkan");
        } else 
        {
            System.out.println("Perpustakaan penuh!");
        }
    }
    
    // fungsi mencari buku
    protected Buku cariBuku(String judulDicari) 
    {
        for (Buku buku : daftarBuku) 
        {
            if (buku != null) 
            {
                String judulBuku = buku.getJudul();
                if (judulBuku.length() != judulDicari.length()) 
                continue;
                
                boolean cocok = true;
                for (int i = 0; i < judulBuku.length(); i++) 
                {
                    if (judulBuku.charAt(i) != judulDicari.charAt(i)) 
                    {
                        cocok = false;
                        break;
                    }
                }
                
                if (cocok) 
                {
                    return buku;
                }
            }
        }
        return null;
    }
    
    // void menampilkan buku 
    public void tampilkanBuku() 
    {
        System.out.println("\nDaftar Buku:");
        for (int i = 0; i < jumlahBuku; i++) 
        {
            daftarBuku[i].infoBuku();
        }
        System.out.println("Total buku tersedia: " + Buku.getJumlahBukuTersedia());
    }
}
