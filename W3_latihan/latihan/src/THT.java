import java.util.Scanner;

public class THT 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan ID Karyawan: ");
        String id = input.nextLine();
        System.out.print("Masukkan Nama Karyawan: ");
        String nama = input.nextLine();
        System.out.println("Pilih Shift Kerja:");
        System.out.println("1. Pagi");
        System.out.println("2. Siang");
        System.out.println("3. Malam");
        System.out.print("Shift: ");
        int shift = input.nextInt();
        System.out.print("Masukkan Total Jam Kerja/minggu: ");
        int totalJamKerja = input.nextInt();
        System.out.print("Masukkan Total Bolos: ");
        int totalAbsen = input.nextInt();

        double gajiPerJam = 0;
        switch (shift) 
        {
            case 1: 
                gajiPerJam = 50000;
                break;
            case 2: 
                gajiPerJam = 60000;
                break;
            case 3: 
                gajiPerJam = 70000;
                break;
            default:
        }
        
        double gajiAwal = totalJamKerja * gajiPerJam;
        if (totalJamKerja < 30) 
        {
            gajiAwal *= 0.1;
        }
        double lembur = 0;
        if (totalJamKerja > 40) 
        {
            lembur = (totalJamKerja - 40) * gajiPerJam * 1.5;
        }
        double potonganAbsen = totalAbsen * 100000;
        double gajiTotal = gajiAwal + lembur - potonganAbsen;
        

        System.out.println("\n<=== Data Gaji Karyawan ===>");
        System.out.println("ID Karyawan: " + id);
        System.out.println("Nama Karyawan: " + nama);
        System.out.println("Shift Kerja: " + shift);
        System.out.println("Total Jam Kerja: " + totalJamKerja + " jam");
        System.out.println("Total Absen [Bolos]: " + totalAbsen + " hari");
        System.out.println("Gaji Awal: Rp. " + gajiAwal);
        System.out.println("Uang Lembur: Rp. " + lembur);
        System.out.println("Potongan Absen: Rp. " + potonganAbsen);
        System.out.println("Gaji Total: Rp. " + gajiTotal);

        input.close();
    }
}