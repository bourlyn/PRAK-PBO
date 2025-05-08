// Latihan NO1
class Hewan { // parent
    String suara = "Suara hewan";
}

class Kucing extends Hewan { // child
    String suara = "Meong";
    
    void dispalySuara() {
        System.out.println("suara milik kelas Kucing: " + suara);
        System.out.println("suara milik kelas Hewan: " + super.suara);
    }
}

// Latihan NO2
class Kendaraan {// parent
    Kendaraan() {
        System.out.println("Konstruktor Kendaraan dipanggil");
    }
}

class Mobil extends Kendaraan {
    Mobil() { // child
        super(); 
        System.out.println("Konstruktor Mobil dipanggil");
    }
}

public class Main {
    public static void main(String[] args) {
        // NO1
        Kucing kucing = new Kucing();
        kucing.dispalySuara();
        // NO2
        Mobil mobil = new Mobil();
    }
}

