package kursusonline.model;

public class Materi 
{
    private String judul;
    private String deskripsi;
    private String durasi;
    
    public Materi(String judul, String deskripsi, String durasi) 
    {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.durasi = durasi;
    }

    public String getJudul() 
    {
        return judul;
    }

    public String getDeskripsi() 
    {
        return deskripsi;
    }

    public String getDurasi() 
    {
        return durasi;
    }
}
