public class Main 
{
    public static void main(String[] args)
    {
        Mahasiswa mhs1 = new Mahasiswa("budi", "123", "IT", 3.5);
        Mahasiswa mhs2 = new Mahasiswa("joko", "456", "IT", 3.0);
        
        mhs1.tampilkanInfo();
        mhs2.tampilkanInfo();
    }
}