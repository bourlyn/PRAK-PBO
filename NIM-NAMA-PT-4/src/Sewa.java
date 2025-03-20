public class Sewa 
{
    Pelanggan pelanggan;
    Mobil mobil;
    int lamaSewa;

    Sewa(Pelanggan pelanggan, Mobil mobil, int lamaSewa) 
    {
        this.pelanggan = pelanggan;
        this.mobil = mobil;
        this.lamaSewa = lamaSewa;
    }

    void prosesSewa() 
    {
        if (mobil.getStatus()) 
        {
            mobil.setStatus(false); 
            double totalBiaya = lamaSewa * mobil.getHargaSewa();
            totalBiaya = Utility.hitungDiskon(totalBiaya, lamaSewa);
            cetakStruk(totalBiaya); 
        } else 
        {
            System.out.println("Maaf, mobil tidak tersedia.");
        }
    }

    void cetakStruk(double totalBiaya) 
    {
        System.out.println("\n<=== Struk Penyewaan ===>");
        pelanggan.infoPelanggan();
        mobil.infoMobil();
        System.out.println("Lama Sewa   : " + lamaSewa + " hari");
        System.out.println("Total Biaya : " + Utility.konversi(totalBiaya));
        System.out.println("Status    : Berhasil");
    }
}