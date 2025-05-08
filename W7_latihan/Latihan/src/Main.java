// parent class (superclass)
class Kendaraan {
    String Merek = "Toyota";

    Kendaraan() {
        System.out.println("ini konstruktor Parent");
    }

    void jalan() {
        System.out.println("kendaraan sedang berjalan");
    }
 
}

// child class (subclass)
class Mobil extends Kendaraan {
    String Merek = "BMW";

    public Mobil() {
        super();
        System.out.println("ini konstruktor Child");
    }

    void printInfo(){
        System.out.println("Merek mobil child " + Merek);
        System.out.println("Merek mobil parent " + super.Merek);
        jalan();
    }
    
    void klakson(String Merek) {
        System.out.println("Mobil " + super.Merek + " sedang klakson ");
    }
}

public class Main {
    public static void main(String[] args) {
        Mobil jazz = new Mobil();
        // jazz.jalan();
        jazz.printInfo();
        jazz.klakson(" BMW ");
        System.out.println(jazz.Merek);
    }
}

