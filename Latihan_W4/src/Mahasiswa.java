public class Mahasiswa {

    // Atribut
   String nama;
   String nim;
   String Jurusan;
   boolean isLulus = false;
   static int angkatan = 2024;

   // konstruktor
   Mahasiswa(String nama, String nim, String Jurusan) {
       this.nama = nama;
       this.nim = nim;
       this.Jurusan = Jurusan;
   }
   

   // konsturktor 2
   Mahasiswa() {
    this(...);   
   }

   Mahasiswa(Mahasiswa m) {
    this.nama = m.nama;
    this.nim = m.nim;
    this.Jurusan = m.Jurusan;
   }
   void belajar() {
       System.out.println(nama + " sedang belajar di jurusan ");
   }
   
   void belajar(String nama) {
       System.out.println(this.nama + " sedang belajar di jurusan ");
   }

   String getNama() {
       return nama;
   }

   class Dalam {
       void lulus() {
           isLulus = true;
       }
   }

   static void kuliah() {
       System.out.println("Mahasiswa sedang kuliah");
    }
}
