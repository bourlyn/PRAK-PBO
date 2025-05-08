// No 1 
class Bangunan {
    String nama = "Bangunan Umum";
}

class GedungSekolah extends Bangunan {
    String nama = "Gedung Sekolah ABC";
    
    void displayInfo() {
        System.out.println("Nama di subclass: " + nama);
        System.out.println("Nama di superclass: " + super.nama);
    }
}

// No 2
class Orang {
    Orang() {
        System.out.println("Orang dibuat!");
    }
}

class Dosen extends Orang {
    Dosen() {
        super();
        System.out.println("Dosen dibuat!");
    }
}

// No 3
class Produk {
    int harga = 10000;
}

class Buku extends Produk {
    int harga = 25000;
    
    void bandingkanHarga() {
        System.out.println("Harga di subclass: " + harga);
        System.out.println("Harga di superclass: " + super.harga);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Posttest No 1");
        GedungSekolah abc = new GedungSekolah();
        abc.displayInfo();
        
        System.out.println("\n Posttest No 2");
        Dosen dosen = new Dosen();
        
        System.out.println("\n Posttest No 3");
        Buku buku = new Buku();
        buku.bandingkanHarga();
    }
}