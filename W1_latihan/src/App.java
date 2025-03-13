import java.util.Scanner;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        // no12
        Scanner input = new Scanner(System.in);
        System.err.print("Masukkan Teks: ");
        String teks = input.nextLine();

        int Total = 0;
        for (int i =0; i < teks.length(); i++)
        {
            char c = teks.charAt(i);
            if (c == 'a' || c == 'i' || c == 'u' || c == 'e' || c == 'o')
            {
                Total++;
            }
        }
        System.out.println("total vokal: " + Total);

        // no11
        String teks2 = "jawa";
        String hasil = "";
        for (int i= teks2.length() -1; i >=0; i--)
        {
            hasil = hasil + teks2.charAt(i);
        }
        System.out.println(hasil);

        // no10
        String teks1 = "Hello, World!";
        System.out.println(teks1.length());
        System.out.println(teks1.toUpperCase());
        System.out.println(teks1.substring(7));

        // no7
        int[] data = {4, 8, 12, 16, 20};
        int total = 0;
        for (int nilai : data)
        {
            total = total + nilai;    
        }
        System.out.println("total: " + total +"\n");

        // no6
        int[] angka = {5,10,15,20,25};
        for (int i=0; i<angka.length; i++)
        {
            System.out.println(angka[i]);
        }

        // no4
        String mahasiswa[] = {"umran","zuhdy","ch","bourlyn"};
        for (String nama : mahasiswa)
        {
            System.out.println(nama);
        }
        
        // default
        System.out.println("\nHello, World!");

        // no2
        int nilai = 80;
        switch (nilai) 
        {
            case 80:
                System.out.println("Grade A");
                break;
            case 70:
                System.out.println("Grade B");
                break;
            case 60:
                System.out.println("Grade C");
                break;
            default:
                break;
        }        
    }
}
