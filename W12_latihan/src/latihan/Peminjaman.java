package latihan;
import java.util.Scanner;

public class Peminjaman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        try {
            // Input data
            System.out.println("=== Sistem Peminjaman Buku ===");
            System.out.print("Nama Peminjam: ");
            String nama = input.nextLine();
            
            System.out.print("ID Buku (B001/B002/B003): ");
            String idBuku = input.nextLine();
            
            System.out.print("Lama Pinjam (maks 14 hari): ");
            int lamaPinjam = input.nextInt();
            
            // Validasi input
            if (nama.isEmpty()) {
                System.out.println("Error: Nama tidak boleh kosong");
                return;
            }
            
            if (!idBuku.equals("B001") && !idBuku.equals("B002") && !idBuku.equals("B003")) {
                System.out.println("Error: ID buku tidak valid");
                return;
            }
            
            if (lamaPinjam <= 0 || lamaPinjam > 14) {
                System.out.println("Error: Lama pinjam harus 1-14 hari");
                return;
            }
            
            // Jika semua valid, tampilkan hasil
            System.out.println("\nPeminjaman Berhasil!");
            System.out.println("Nama: " + nama);
            System.out.println("Buku: " + idBuku);
            System.out.println("Durasi: " + lamaPinjam + " hari");
            
        } catch (Exception e) {
            System.out.println("Inputan tidak valid");
        } finally {
            input.close();
            System.out.println("\nCihuyyyy!");
        }
    }
}
