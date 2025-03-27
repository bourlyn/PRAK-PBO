public class Main 
{
    public static void main(String[] args) 
    {
        Produk laptop = new Produk("0001", "Laptop Gaming", 1200000, 5);
        Produk smartphone = new Produk("0002", "Smartphone", 500000, 10);
        Pelanggan pelanggan1 = new Pelanggan("C001", "Budi Santoso", "budi@email.com", 9000000);
        Pelanggan pelanggan2 = new Pelanggan("C002", "Ani Wijaya", "ani@email.com", 5000000);
        
        System.out.println("\n<=== DAFTAR PRODUK ===>");
        laptop.tampilkanInfoProduk();
        smartphone.tampilkanInfoProduk();
        System.out.println("\n<=== DAFTAR PELANGGAN ===>");
        pelanggan1.tampilkanInfoPelanggan();
        pelanggan2.tampilkanInfoPelanggan();
        
        // Pelanggan melakukan top up
        System.out.println("\nTOP UP SALDO");
        System.out.println("--------------");
        pelanggan2.topUpSaldo(2000000);
        pelanggan2.tampilkanInfoPelanggan();
        
        // Melakukan transaksi 1 + 2
        System.out.println("\nTRANSAKSI 1");
        System.out.println("-------------");
        Transaksi Transaksi1 = new Transaksi("T001", pelanggan1, laptop, 1);
        if (Transaksi1.prosesTransaksi()) 
        {
            Transaksi1.detailTransaksi();
        }
        System.out.println("\nTRANSAKSI 2");
        System.out.println("-------------");
        Transaksi Transaksi2 = new Transaksi("T002", pelanggan2, smartphone, 3);
        if (Transaksi2.prosesTransaksi()) 
        {
            Transaksi2.detailTransaksi();
        }
        
        // Menampilkan info terbaru
        System.out.println("\n<=== INFO TERKINI ===>");
        laptop.tampilkanInfoProduk();
        smartphone.tampilkanInfoProduk();
        pelanggan1.tampilkanInfoPelanggan();
        pelanggan2.tampilkanInfoPelanggan();
    }
}