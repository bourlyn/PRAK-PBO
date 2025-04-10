package matakuliah;

import dosen.Dosen;
import mahasiswa.Mahasiswa;
import java.util.ArrayList;

public class MataKuliah 
{
    private String nama;
    private String KodeMK;
    private ArrayList<Dosen>pengampu;
    private ArrayList<Mahasiswa>daftarMahasiswa;

    public MataKuliah(String nama, String KodeMK)
    {
        this.nama=nama;
        this.KodeMK=KodeMK;
    }

    public void setDaftarMahasiswa(ArrayList<Mahasiswa> daftarMahasiswa) 
    {
        this.daftarMahasiswa = daftarMahasiswa;
    }

    public void setpengampu(ArrayList<Dosen> pengampu)
    {
        this.pengampu = pengampu;
    }
    
    public String getnama()
    {
        return nama;
    }

    public String getKodeMK()
    {
        return KodeMK;
    }

    public ArrayList<Dosen> getpengampu()
    {
        return pengampu;
    }

    public ArrayList<Mahasiswa> getdaftarMahasiswa()
    {
        return daftarMahasiswa;
    }

}