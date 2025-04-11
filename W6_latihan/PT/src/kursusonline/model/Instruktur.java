package kursusonline.model;

public class Instruktur 
{
    private String id;
    private String nama;
    private String spesialis;
    
    public Instruktur(String id, String nama, String spesialis) 
    {
        this.id = id;
        this.nama = nama;
        this.spesialis = spesialis;
    }
    
    public String getId() 
    {
        return id;
    }
    
    public String getNama() 
    {
        return nama;
    }
    
    public String getSpesialis() 
    {
        return spesialis;
    }
}
