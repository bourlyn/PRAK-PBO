import java.util.Scanner;

public class post 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);  
        System.out.print("Masukkan Total Harga: ");
        double totalHarga = input.nextDouble();

        System.out.print("Masukkan Type Member: ");
        String member = input.next();

        double discon = 0;
        if (totalHarga > 500000) 
        {
            discon = totalHarga * 0.20;    
        } 
        else if (totalHarga >= 250000) 
        {
            discon = totalHarga * 0.10;
        }

        double totalDiscon = totalHarga - discon;
        double disconMember = 0;
        switch (member) 
        {
            case "Platinum":
                disconMember = totalDiscon * 0.05;
                break;
            case "Gold":
                disconMember = totalDiscon * 0.03;
                break;
            case "Silver":
                disconMember = totalDiscon * 0.02;
                break;
            case "Bukan Member":
                disconMember = 0;
            default:
                System.out.println("Invalid Input");
                break;
        }

        double totalFix = totalDiscon - disconMember;
        String status = (discon > 0 || disconMember > 0) ? "anda dapat discon." : "anda tidak dapat discon";
        System.out.println(status);
        System.out.println("Total: " + (int) totalFix);
        input.close();
    }
}
