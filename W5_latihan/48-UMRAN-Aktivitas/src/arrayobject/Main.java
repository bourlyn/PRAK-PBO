package arrayobject;

public class Main {
    public static void main(String[] args) {
        Mahasiswa[] arObj = {
            new Mahasiswa("Nebula"),
            new Mahasiswa("Nebula2")
        };
        for (Mahasiswa obj : arObj){
            System.out.println(obj.nama);
        }

        Mahasiswa[] arObj2 = new Mahasiswa[2];
        arObj2[0] = new Mahasiswa("Nebula3");
        arObj2[1] = new Mahasiswa("Nebula4");
        for (Mahasiswa obj : arObj2){
            System.out.println(obj.nama);
        }
    }
}
