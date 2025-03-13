public class classUtama 
{
    public static void main(String[] args) 
    {        
        classLainnya hitung = new classLainnya();

        System.out.println("PERHITUNGAN SEDERHANA");
        System.out.println("=====================");
        hitung.tambah(10, 5);
        hitung.kurang(10, 5);
        hitung.bagi(10, 5);
        hitung.kali(10, 5);
    }
}