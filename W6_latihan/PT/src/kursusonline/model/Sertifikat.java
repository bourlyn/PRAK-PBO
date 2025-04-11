package kursusonline.model;

public class Sertifikat 
{
    private String idSertifikat;
    private String namaKursus;
    private String tanggalTerbit;
    
    public Sertifikat(String idSertifikat, String namaKursus, String tanggalTerbit) 
    {
        this.idSertifikat = idSertifikat;
        this.namaKursus = namaKursus;
        this.tanggalTerbit = tanggalTerbit;
    }

    public String getIdSertifikat() 
    {
        return idSertifikat;
    }

    public String getNamaKursus() 
    {
        return namaKursus;
    }

    public String getTanggalTerbit() 
    {
        return tanggalTerbit;
    }
}
