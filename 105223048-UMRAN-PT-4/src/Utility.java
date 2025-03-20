public class Utility 
{
    static double hitungDiskon(double totalBiaya, int lamaSewa) 
    {
        if (lamaSewa > 5) 
        {
            return totalBiaya * 0.9;
        }
        return totalBiaya;
    }

    static String konversi(double jumlah) 
    {
        String uang = "Rp " + (int) jumlah;
        return uang;
    }
}