
import java.util.Scanner;

public class latihan1 {
    public static void main(String[] args) {
        // Belajar if-else

        boolean x = false;
        if (x) {

            System.out.println("ini adalah blok if");
        }

        int a = 10;
        if (a > 5) {
            System.out.println("a lebih besar dari 5");
        } else {
            System.out.println("a lebih kecil dari 5");
        }

        
        // Scanner input = new Scanner(System.in);
        /*
        System.out.println("Masukkan Angka: ");
        int nilai = input.nextInt();
        
        if (nilai > 80) {
            System.out.println("Nilai anda A");
        } else if (nilai >= 70) {
            System.out.println("Nilai anda B");
        } else if (nilai >= 60) {
            System.out.println("Nilai anda C");
        } else if (nilai >= 50) {
            System.out.println("Nilai anda D");
        } else  {
            System.out.println("Nilai anda E");
        } 
         
        
        String dayName = "Senin";
        int day = 1;
        switch (day) {
            case 1:
                System.out.println("Senin");
                break;
            case 2:
                System.out.println("Selasa");
                break;
            case 3:
                System.out.println("Rabu");
                break;
            case 4:
                System.out.println("Kamis");
                break;
            case 5:
                System.out.println("Jumat");
                break;
            case 6:
                System.out.println("Sabtu");
                break;
            case 7:
                System.out.println("Ahad");
                break;
            default:
                System.out.println("Hari Akhir");
                break;
        }
        */

        // Belajar ternary operator
        /*
        int angka = 5;
        if ( angka % 2 == 0) {
            System.out.println("Angka genap");
        } else {
            System.out.println("Angka ganjil");
        }

        // ternary operator
        String hasil = (angka % 2 == 0) ? "Angka genap" : "Angka ganjil";
        System.out.println(hasil);
        */
        
        // loop for
        for (int i =0; i < 5; i++) {
            System.out.println("Perulangan ke-" + (i+1));
        }

        // loop while
        int i=0;
        while (i<5) {
            System.out.println("Perulangan ke-" + (i+1));
            i++;
        }

        // loop do-while
        i=0;
        do { 
            System.out.println("Perulangan ke-" + (i+1));
            i++; 
        } while (i<5);

        // loop forEach
        int numbers1[] = {1,2,3,4,5};
        for (int z : numbers1) { 
            System.out.print(i); 
        } 

        // break dan continue
        for (int ii =0; ii<5; ii++) {
            if (i == 3) {
                break;
            }
            System.out.println("Perulangan ke-" +i);
        }

        while (true) {
            System.out.println("Pilih menu:");
            System.out.println("1. Menu 1:");
            System.out.println("2. Menu 2:");
            System.out.println("0. keluar");

            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan pilihan: ");
            int pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("Anda memilih menu 1");
                    break;
                case 2:
                    System.out.println("Anda memilih menu 2");
                    break;
                case 0:
                    System.out.println("Anda keluar dari program");
                    break;
                default:
                    System.out.println("Menu Akhir");
                    break;
            }
            input.close(); 
        
        int[] number = {1,2,3,4,5};
        System.out.println(number[2]);
        number[2] = 10;
        System.out.println(number[2]);
        System.out.println(number.length);
        number = new int[5];
        // number[0] = 10;
        // number[1] = 20;
        // number[2] = 30;
        }     

        
        
       

    }
}
