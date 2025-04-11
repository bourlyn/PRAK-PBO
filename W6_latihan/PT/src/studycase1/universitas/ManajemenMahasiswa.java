package studycase1.universitas;

import java.util.ArrayList;

public class ManajemenMahasiswa 
{
    public ArrayList<Mahasiswa>daftarMahasiswa;
    public ManajemenMahasiswa() 
    {
        daftarMahasiswa = new ArrayList<>();
    }

    public void tambahMahasiswa(Mahasiswa m) 
    {
        daftarMahasiswa.add(m);
    }

    public void tampilSemua() 
    {
        if (daftarMahasiswa.isEmpty()) 
        {
            System.out.println("tidak ada data mahasiswa!");
            return;
        }
        
        System.out.println("DAFTAR SELURUH MAHASISWA:");
        for (Mahasiswa m : daftarMahasiswa) 
        {
            m.tampilData();
        }
    }

    public void ipkTertinggi() 
    {
        if (daftarMahasiswa.isEmpty()) 
        {
            System.out.println("tidak ada data mahasiswa!");
            return;
        }

        Mahasiswa tertinggi = daftarMahasiswa.get(0);
        for (Mahasiswa m : daftarMahasiswa) 
        {
            if (m.getIPK() > tertinggi.getIPK()) 
            {
                tertinggi = m;
            }
        }

        System.out.println("MAHASISWA DENGAN IPK TERTINGGI:");
        tertinggi.tampilData();
    }
}