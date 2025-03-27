class Pelanggan 
{
    // Atribut
    String idPelanggan;
    String nama;
    String email;
    double saldo;

    // Konstruktor
    Pelanggan(String id, String nm, String eml, double sld) 
    {
        idPelanggan = id;
        nama = nm;
        email = eml;
        saldo = sld;
    }

    // Menampilkan informasi pelanggan
    void tampilkanInfoPelanggan() 
    {
        System.out.println("ID: " + idPelanggan);
        System.out.println("Nama: " + nama);
        System.out.println("Saldo: Rp. " + saldo);
    }

    // Menambah saldo pelanggan
    void topUpSaldo(double jumlah) 
    {
        saldo += jumlah;
        System.out.println("Top up berhasil! Saldo baru: Rp. " + saldo);
    }

    // Mengurangi saldo pelanggan
    boolean kurangiSaldo(double jumlah) 
    {
        if (saldo >= jumlah) 
        {
            saldo -= jumlah;
            return true;
        }
        System.out.println("Saldo tidak cukup!");
        return false;
    }
}