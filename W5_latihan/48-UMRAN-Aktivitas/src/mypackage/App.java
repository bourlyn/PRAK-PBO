package mypackage;
public class App {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("deez");
        // System.out.println(mhs.nama); //error
        mhs.tampilkanInfo();
        System.out.println(mhs.nama);
        System.out.println(mhs.umur);

        Mahasiswa mhs2 = new Mahasiswa("rembulan");
        System.out.println(mhs2.nama);
        System.out.println(Mahasiswa.universitas);

        mhs2.sayHello("rembulan");

        String sayHello2 = mhs2.sayHello2("John", 31, true);
        System.out.println(sayHello2);
    
        mypackage.Package1.sayHello();
    }
}
