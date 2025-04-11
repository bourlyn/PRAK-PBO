package kursusonline;

import kursusonline.model.Kursus;
import kursusonline.model.Peserta;
import kursusonline.model.Materi;
import kursusonline.model.Sertifikat;
import kursusonline.service.KursusService;

public class Main 
{
    public static void main(String[] args) 
    {
        KursusService kursusService = new KursusService();

        String instruktur1 = "Rembulan";
        String instruktur2 = "Senja";

        Kursus kursus1 = new Kursus("K1", "Pemrograman Java Dasar", instruktur1);
        Kursus kursus2 = new Kursus("K2", "Web Development", instruktur2);

        kursusService.tambahKursus(kursus1);
        kursusService.tambahKursus(kursus2);

        Peserta peserta1 = new Peserta("P1", "Goku", "Goku@gmail.com", "0812345", null);
        Peserta peserta2 = new Peserta("P2", "Vegeta", "Vegeta@gmail.com", "544321", null);
        Peserta peserta3 = new Peserta("P3", "Gohan", "Gohan@yahoo.com", "678901", null);

        Sertifikat sertifikat1 = new Sertifikat("S1", "Pemrograman Java Dasar", "02/04/2025");
        Sertifikat sertifikat2 = new Sertifikat("S2", "Web Development", "11/03/2025");

        Materi materi1 = new Materi("Pengenalan Java", "Dasar-dasar pemrograman Java", "120");
        Materi materi2 = new Materi("OOP di Java", "Konsep Object-Oriented Programming", "180");
        Materi materi3 = new Materi("HTML & CSS", "Dasar pembuatan website", "90");

        kursus1.tambahMateri(materi1);
        kursus1.tambahMateri(materi2);
        kursus2.tambahMateri(materi3);

        boolean hasil1 = kursusService.tambahPesertaKeKursus("K1", peserta1);
        boolean hasil2 = kursusService.tambahPesertaKeKursus("K2", peserta2);
        boolean hasil3 = kursusService.tambahPesertaKeKursus("K1", peserta3); 

        if (hasil1) 
        {
            peserta1.setSertifikat(sertifikat1);
        }
        if (hasil2) 
        {
            peserta2.setSertifikat(sertifikat2);
        }

        System.out.println("\nHasil Pendaftaran Peserta:");
        System.out.println("- Peserta 1 (Goku): " + (hasil1 ? "Berhasil" : "Gagal"));
        System.out.println("- Peserta 2 (Vegeta): " + (hasil2 ? "Berhasil" : "Gagal"));
        System.out.println("- Peserta 3 (Gohan): " + (hasil3 ? "Berhasil" : "Gagal"));
        kursusService.tampilkanSemuaKursus();
    }
}