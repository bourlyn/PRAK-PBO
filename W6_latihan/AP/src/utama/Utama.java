package utama;

import dosen.Dosen;
import java.util.ArrayList;
import mahasiswa.Mahasiswa;
import matakuliah.MataKuliah;

public class Utama 
{

    public static void main(String[] args) 
    {
        Dosen dosen1 = new Dosen("Budi", "123456");
        Dosen dosen2 = new Dosen("Cahya", "654321");

        
        Mahasiswa mhs1 = new Mahasiswa("Andi", "202301");
        Mahasiswa mhs2 = new Mahasiswa("Rina", "202302");
        Mahasiswa mhs3 = new Mahasiswa("Budi", "202303");

        
        ArrayList<Dosen> daftarPengampu = new ArrayList<>();
        daftarPengampu.add(dosen1);
        daftarPengampu.add(dosen2);

    
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
        daftarMahasiswa.add(mhs1);
        daftarMahasiswa.add(mhs2);
        daftarMahasiswa.add(mhs3);

        
        MataKuliah mk1 = new MataKuliah("Pemrograman Java", "CS101");
        mk1.setpengampu(daftarPengampu);
        mk1.setDaftarMahasiswa(daftarMahasiswa);

        
        tampilkanData(mk1);
    }

    public static void tampilkanData(MataKuliah matakuliah) 
    {
        System.out.println("Mata Kuliah: " + matakuliah.getnama());
        System.out.println("Kode MK   : " + matakuliah.getKodeMK());

        System.out.println("\nPengampu:");
        for (Dosen d : matakuliah.getpengampu()) 
        {
            System.out.println("- " + d.getNama() + " (NIDN: " + d.getNIDN() + ")");
        }

        System.out.println("\nDaftar Mahasiswa:");
        for (Mahasiswa m : matakuliah.getdaftarMahasiswa()) 
        {
            System.out.println("- " + m.getNama() + " (NIM: " + m.getNIM() + ")");
        }
    }
}