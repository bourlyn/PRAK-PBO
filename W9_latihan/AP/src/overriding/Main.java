package overriding;
class Animal {
    public void suara() {
        System.out.println("cetak suara");
    }

    public void makan(String lauk) {
        System.out.println("hewan makan" + lauk); // overriding
    }
}

class Dog extends Animal {
    @Override // method yg sama parameter berbeda.
    public void suara() {
        System.out.println("Guk-Guk");
    }

    public void makan(String lauk, String minuman) {
        System.out.println("hewan makan" + lauk + "dan minuman" + minuman); // overloading
    }   
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.suara();

        Animal d = new Dog();
        d.suara();
        d.makan("Ayam Goreng"); // method dari parent
        d.makan(" Anda ");
    
        Dog Anjing = new Dog();
        Anjing.makan(" Tulang ", " air "); // 
    
    }
}
