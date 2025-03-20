public class Main 
{
    static void main(String[] args) 
    {
        Mobil mobil1 = new Mobil("G 0 KU", "Mazda", 200000);
        Mobil mobil2 = new Mobil("M 4 OU", "Volkswagen", 150000);

        Pelanggan pelanggan1 = new Pelanggan("ZRO", "123456789", "987654321");
        Pelanggan pelanggan2 = new Pelanggan("ROO", "54321654", "5678901234");

        System.out.println("Informasi Mobil 1");
        System.out.println("-----------------");
        mobil1.infoMobil();
        System.out.println("\nInformasi Mobil 2:");
        System.out.println("--------------------");
        mobil2.infoMobil();

        Sewa sewa1 = new Sewa(pelanggan1, mobil1, 7); 
        sewa1.prosesSewa();
        Sewa sewa2 = new Sewa(pelanggan2, mobil2, 3); 
        sewa2.prosesSewa();

        System.out.println("\n Setelah Sewa:");
        System.out.println("----------------------------------");
        mobil1.infoMobil();
        mobil2.infoMobil();
    }
}