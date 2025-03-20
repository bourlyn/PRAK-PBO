public class Pelanggan 
{
    String nama;
    String noKTP;
    String noTelp;

    Pelanggan() 
    {
        this.nama = "ZRO";
        this.noKTP = "123456789";
        this.noTelp = "987654321";
    }

    Pelanggan(String nama, String noKTP, String noTelp) 
    {
        this.nama = nama;
        this.noKTP = noKTP;
        this.noTelp = noTelp;
    }

    String getNama() 
    {
        return nama;
    }

    String getNoKTP() 
    {
        return noKTP;
    }

    String getNoTelp() 
    {
        return noTelp;
    }

    void infoPelanggan() 
    {
        System.out.println("Nama    : " + nama);
        System.out.println("No KTP  : " + noKTP);
        System.out.println("No Telp : " + noTelp);
    }
}