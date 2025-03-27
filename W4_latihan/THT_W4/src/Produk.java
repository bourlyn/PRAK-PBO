public class Produk 
{
    // Atribut
    String kodeProduk;
    String namaProduk;
    double harga;
    int stok;

    // Konstruktor
    Produk(String kode, String nama, double hrg, int stk) 
    {
        kodeProduk = kode;
        namaProduk = nama;
        harga = hrg;
        stok = stk;
    }

    // Menampilkan informasi produk
    void tampilkanInfoProduk() 
    {
        System.out.println("[" + kodeProduk + "] " + namaProduk);
        System.out.println("Harga: Rp. " + harga);
        System.out.println("Stok: " + stok);
    }

    // Mengurangi stok produk
    boolean kurangiStok(int jumlah) 
    {
        if (jumlah <= stok) 
        {
            stok -= jumlah;
            return true;
        }
        System.out.println("Stok tidak cukup!");
        return false;
    }
}