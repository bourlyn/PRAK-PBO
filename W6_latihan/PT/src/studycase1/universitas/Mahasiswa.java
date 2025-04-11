package studycase1.universitas;

public class Mahasiswa 
{
    private String NIM;
    private String nama;
    private String prodi;
    private double IPK;

    public Mahasiswa(String NIM, String nama, String prodi, double IPK) 
    {
        this.NIM = NIM;
        this.nama = nama;
        this.prodi = prodi;
        this.IPK = IPK;
    }

    public String getNIM() 
    {
        return NIM;
    }

    public String getNama() 
    {
        return nama;
    }

    public String getProdi() 
    {
        return prodi;
    }

    public double getIPK() 
    {
        return IPK;
    }

    public void setNIM(String NIM) 
    {
        this.NIM = NIM;
    }

    public void setNama(String nama) 
    {
        this.nama = nama;
    }

    public void setProdi(String prodi) 
    {
        this.prodi = prodi;
    }

    public void setIPK(double IPK) 
    {
        this.IPK = IPK;
    }

    public void tampilData() 
    {
        System.out.println("--------------------");
        System.out.println("NIM : " + NIM);
        System.out.println("Nama : " + nama);
        System.out.println("Prodi : " + prodi);
        System.out.println("IPK : " + IPK);
        System.out.println("--------------------");
    }
}