public class Main {
    public static void main(String[] args) {
        // membaut objek dari mahasiswa
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nama = "budi"; 
        mhs1.nim = "123";
        mhs1.Jurusan = "IT";

        // Mencetak nama dari objek
        System.out.println(mhs1.nama);
        System.out.println(mhs1.nim);
        System.out.println(mhs1.Jurusan);
        mhs1.belajar();
        System.out.println(mhs1.getNama());
        Mahasiswa.kuliah();
        System.out.println(Mahasiswa.angkatan);

        mhs1.nama = "joko";
        System.out.println("Nama baru : " + mhs1.getNama());

        Mahasiswa mhs2 = new Mahasiswa();
        mhs1.nama = "S";
        mhs1.nim = "999";
        mhs1.Jurusan = "IT";

        // Mencetak nama dari objek 2
        System.out.println(mhs2.nama);
        System.out.println(mhs2.nim);
        System.out.println(mhs2.Jurusan);
        mhs1.belajar();
 
    }
}