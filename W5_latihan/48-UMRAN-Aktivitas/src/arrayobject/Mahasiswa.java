package arrayobject;

public class Mahasiswa {
    String nama;    //default NULL
    int umur;       //default 0
    boolean isLulus;    //default false 
    public void tampilkanInfo(){
        //variabel lokal
        String nama="Nebula";
        System.out.println("Nama : "+nama);
        System.out.println(Mahasiswa.universitas);
    }

    public Mahasiswa(String nama){
        this.nama=nama;
    }

    public Mahasiswa(){
        this.nama="default";
        this.umur=0;
    }

    static String universitas = "Universitas pertamina";

    public void sayHello(String nama){
        System.out.println("Hello "+nama);
    }
    
    //dalam parameter cuma bisa deklarasi variabel dan tisak bisa menggunakan operator assignment

    public String sayHello2(String nama, int umur, boolean isLulus){
        return "Hello "+nama+" umur "+umur+" lulus "+isLulus;
    }

    // public void sayHello(this.nama){
    //     System.out.println("Hello "+this.nama);
    // }



    public static void main(String[] args){
        Mahasiswa mhs = new Mahasiswa("tes");
        Mahasiswa mhss=new Mahasiswa("Nebula");
        // System.out.println(mhs.nama); //error
        mhs.tampilkanInfo();
        System.out.println(mhs.nama);
        System.out.println(mhs.umur);

        Mahasiswa mhs2 = new Mahasiswa("Nebula");
        System.out.println(mhs2.nama);

        System.out.println(Mahasiswa.universitas);
    }
}
