class Transaksi 
{
    // Atribut
    String idTransaksi;
    Pelanggan pelanggan;
    Produk produk;
    int jumlahBeli;
    double totalHarga;

    // Konstruktor
    Transaksi(String id, Pelanggan plg, Produk prd, int jml) 
    {
        idTransaksi = id;
        pelanggan = plg;
        produk = prd;
        jumlahBeli = jml;
        totalHarga = prd.harga * jml;
    }

    // Memproses transaksi
    boolean prosesTransaksi() 
    {
        // Cek stok produk
        if (!produk.kurangiStok(jumlahBeli)) 
        {
            return false;
        }
        
        // Cek saldo pelanggan
        if (!pelanggan.kurangiSaldo(totalHarga)) 
        {
            produk.stok += jumlahBeli; // Batalkan pengurangan stok
            return false;
        }
        
        System.out.println("Transaksi berhasil!");
        return true;
    }

    // Menampilkan detail transaksi
    void detailTransaksi() 
    {
        System.out.println("\n<=== DETAIL TRANSAKSI ===>");
        System.out.println("ID Transaksi: " + idTransaksi);
        System.out.println("Pelanggan: " + pelanggan.nama);
        System.out.println("Produk: " + produk.namaProduk);
        System.out.println("Jumlah: " + jumlahBeli);
        System.out.println("Total: Rp" + totalHarga);
        System.out.println("=======================");
    }
}