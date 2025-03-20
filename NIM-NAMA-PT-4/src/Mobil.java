public class Mobil 
{
    String nomorPlat;
    String merk;
    int hargaSewa;
    boolean Status;

    Mobil() 
    {
        this.nomorPlat = "G 0 KU";
        this.merk = "Mazda";
        this.hargaSewa = 150000;
        this.Status = true;
    }

    Mobil(String nomorPlat, String merk, int hargaSewa) 
    {
        this.nomorPlat = nomorPlat;
        this.merk = merk;
        this.hargaSewa = hargaSewa;
        this.Status = true;
    }

    String getNomorPlat() 
    {
        return nomorPlat;
    }

    String getMerk() 
    {
        return merk;
    }

    int getHargaSewa() 
    {
        return hargaSewa;
    }

    boolean getStatus() 
    {
        return Status;
    }

    void setStatus(boolean Status) 
    {
        this.Status = Status;
    }

    void infoMobil() 
    {
        System.out.println("Nomor Plat Mobil: " + nomorPlat);
        System.out.println("Merk Mobil      : " + merk);
        System.out.println("Harga Sewa Mobil: " + Utility.konversi(hargaSewa));
        System.out.println("Status Mobil    : " + (Status ? "Status" : "Tidak Status"));
    }
}