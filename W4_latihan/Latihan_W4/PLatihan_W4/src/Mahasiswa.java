public class Mahasiswa 
{
    String nama;
    String nim;
    String jurusan;
    double ipk;

    // NO 1
    Mahasiswa(String nama, String nim, String jurusan, double ipk) 
    {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }

    // NO 2
    void tampilkanInfo() 
    {
        System.out.println("=====================================");
        System.out.println("      INFORMASI MAHASISWA");
        System.out.println("=====================================");
        System.out.println("Nama    : " + nama);
        System.out.println("NIM     : " + nim);
        System.out.println("Jurusan : " + jurusan);
        System.out.println("IPK     : " + ipk);
        System.out.println("Status  : " + (cekLulus() ? "Lulus" : "Tidak Lulus"));
        System.out.println("=====================================\n");
    }

    // NO 3
    boolean cekLulus() 
    {
        return ipk >= 3.0;
    }
}