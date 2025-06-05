package abstrak;

public class Anjing extends Hewan {
    
    Anjing(String nama) {
        super(nama);
    }
    
    @Override
    void bersuara() {
        System.out.println(nama + " Suara Anjing BERI AWO");
    }
}
