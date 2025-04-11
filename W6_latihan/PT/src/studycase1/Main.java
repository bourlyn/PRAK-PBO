package studycase1;

import studycase1.universitas.Mahasiswa;
import studycase1.universitas.ManajemenMahasiswa;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        ManajemenMahasiswa manajemen = new ManajemenMahasiswa();
        
        int pilihan;
        do 
        {
            System.out.println("\n<=== MENU ===>");
            System.out.println("1. add Mahasiswa");
            System.out.println("2. display data Mahasiswa");
            System.out.println("3. display IPK Tertinggi");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");
            
            pilihan = scanner.nextInt();
            scanner.nextLine();
            
            switch(pilihan) 
            {
                case 1:
                    tambahMahasiswa(scanner, manajemen);
                    break;
                case 2:
                    manajemen.tampilSemua();
                    break;
                case 3:
                    manajemen.ipkTertinggi();
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan salah!");
            }
        } while(pilihan != 4);
        
        scanner.close();
    }
    
    public static void tambahMahasiswa(Scanner scanner, ManajemenMahasiswa manajemen) 
    {
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();
        
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        
        System.out.print("Masukkan Prodi: ");
        String prodi = scanner.nextLine();
        
        System.out.print("Masukkan IPK (contoh: 3,5): ");
        double ipk = scanner.nextDouble();
        
        manajemen.tambahMahasiswa(new Mahasiswa(nim, nama, prodi, ipk));
        System.out.println("Data ditambahkan!");
    }
}