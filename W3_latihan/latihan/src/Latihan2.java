import java.util.Scanner;

public class Latihan2 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Teks: ");
        String teks = input.nextLine();

        int total = 0;
        for (int i = 0; i < teks.length(); i++) 
        {
            char c = teks.charAt(i);
            if (c == 'a' || c == 'i' || c == 'u' || c == 'e' || c == 'o' ||
                c == 'A' || c == 'I' || c == 'U' || c == 'E' || c == 'O') 
                {
                total++;
            }
        }

        switch (total % 2) 
        {
            case 0:
                System.out.println("Jumlah vokal adalah genap");
                break;
            case 1:
                System.out.println("Jumlah vokal adalah ganjil");
                break;
            default:
                System.out.println("INVALID");
                break;
        }

        System.out.print("Reverse teks: ");
        char[] chars = teks.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) 
        {
            System.out.print(chars[i]);
        }

        input.close();
    }
}