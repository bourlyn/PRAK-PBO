package kursusonline.model;

public class Peserta 
{
    private String id;
    private String nama;
    private String email;
    private String noHP;
    private Sertifikat sertifikat;
    
    public Peserta(String id, String nama, String email, String noHP, Sertifikat sertifikat)
    {
        this.id = id;
        this.nama = nama;
        this.email = email;
        this.noHP = noHP;
    }

    public String getId() 
    {
        return id;
    }

    public String getNama() 
    {
        return nama;
    }    

    public String getEmail() 
    {
        return email;
    }

    public String getNoHP() 
    {
        return noHP;
    }

    public Sertifikat getSertifikat() 
    {
        return sertifikat;
    }
    
    public void setSertifikat(Sertifikat sertifikat) 
    {
        this.sertifikat = sertifikat;
    }

    public boolean isEmail() 
    {
        return email.endsWith("@gmail.com");
    }
}
