package kursusonline.service;

import kursusonline.model.Kursus;
import kursusonline.model.Peserta;
import java.util.ArrayList;

public class KursusService 
{
    private ArrayList<Kursus> daftarKursus;

    public KursusService() 
    {
        this.daftarKursus = new ArrayList<>();
    }

    public void tambahKursus(Kursus k) 
    {
        daftarKursus.add(k);
    }

    public void tampilkanSemuaKursus() 
    {
        System.out.println("\n<=== DAFTAR KURSUS ===>");
        for (Kursus k : daftarKursus) 
        {
            k.tampilkanDetailKursus();
        }
    }

    public Kursus cariKursusCode(String kode) 
    {
        for (Kursus k : daftarKursus) 
        {
            if (k.getKode().equals(kode)) 
            {
                return k;
            }
        }
        return null;
    }

    public boolean tambahPesertaKeKursus(String kodeKursus, Peserta peserta) 
    {
        Kursus kursus = cariKursusCode(kodeKursus);
        if (kursus != null) 
        {
            return kursus.tambahPeserta(peserta);
        }
        System.out.println("Kursus tidak ditemukan: " + kodeKursus);
        return false;
    }
}