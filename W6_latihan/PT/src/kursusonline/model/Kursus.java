package kursusonline.model;

import java.util.ArrayList;

public class Kursus 
{
    private String kode;
    private String nama;
    private String instruktur;
    private ArrayList<Peserta> daftarPeserta;
    private ArrayList<Materi> daftarMateri;
    
    public Kursus(String kode, String nama, String instruktur) 
    {
        this.kode = kode;
        this.nama = nama;
        this.instruktur = instruktur;
        this.daftarPeserta = new ArrayList<Peserta>();
        this.daftarMateri = new ArrayList<Materi>();
    }

    public String getKode() 
    {
        return kode;
    }

    public boolean tambahPeserta(Peserta p) 
    {
        if (!p.getEmail().endsWith("@gmail.com")) 
        {
            return false;
        }
        
        for (Peserta peserta : daftarPeserta) 
        {
            if (peserta.getId().equals(p.getId())) 
            {
                return false;
            }
        }
        
        daftarPeserta.add(p);
        return true;
    }

    public void tambahMateri(Materi m) 
    {
        daftarMateri.add(m);
    }

    public void tampilkanDetailKursus() 
    {
        System.out.println("Kode Kursus: " + kode);
        System.out.println("Nama Kursus: " + nama);
        System.out.println("Instruktur: " + instruktur);
        
        System.out.println("\nDaftar Peserta:");
        System.out.println("-----------------");
        if (daftarPeserta.isEmpty()) 
        {
            System.out.println("Belum ada peserta");
        } 
        else 
        {
            for (Peserta p : daftarPeserta) 
            {
                System.out.println("-  " + p.getNama() + " (" + p.getEmail() + ")");
            }
        }
        
        System.out.println("\nDaftar Materi:");
        System.out.println("-----------------");
        if (daftarMateri.isEmpty()) 
        {
            System.out.println("Belum ada materi");
        } 
        else 
        {
            for (Materi m : daftarMateri) 
            {
                System.out.println("-  " + m.getJudul() + " (" + m.getDurasi() + " menit)");
            }
        }
    }
}