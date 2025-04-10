package dosen;

public class Dosen 
{
    private String nama;
    private String NIDN;

    public Dosen(String nama, String nidn)
    {
        this.nama = nama;
        this.NIDN = nidn;
    }

    public String getNama() {
        return nama;
    }

    public String getNIDN() {
        return NIDN;
    }

    
}
