class Kendaraan {
    public void nyalakanMesin() {
        System.out.println("Mesin Nyala");
    }
}

class Mobil extends Kendaraan {
    public void nyalakanMesin() {
        System.out.println("Mesin Mobil Nyala");
    }
}

class Motor extends Kendaraan {
    public void nyalakanMesin() {
        System.out.println("Mesin Motor Nyala");
    }
}

class SuratIzin {
    private String noSurat;
    private String masaBerlaku;
    
    public SuratIzin(String noSurat) {
        this.noSurat = noSurat;
        this.masaBerlaku = "5 tahun dari sekarang";
    }
    
    public String getInfoSurat() {
        return "Nomor: " + noSurat + ", Berlaku hingga: " + masaBerlaku;
    }
}

class Pengemudi {
    private String nama;
    private Kendaraan kendaraan;
    private SuratIzin suratIzin;
    
    public Pengemudi(String nama, Kendaraan kendaraan, String noSurat) {
        this.nama = nama;
        this.kendaraan = kendaraan;
        this.suratIzin = new SuratIzin(noSurat);
    }
    
    public void infoPengemudi() {
        System.out.println("\n=== Info Pengemudi ===");
        System.out.println("Nama: " + nama);
        
        if (kendaraan instanceof Mobil) {
            System.out.println("Jenis Kendaraan: Mobil");
        } else if (kendaraan instanceof Motor) {
            System.out.println("Jenis Kendaraan: Motor");
        }
        
        System.out.print("Status Mesin: ");
        kendaraan.nyalakanMesin();
        System.out.println(suratIzin.getInfoSurat());
    }
}

public class Main {
    public static void main(String[] args) {
        Pengemudi rembulan = new Pengemudi("Rembulan", new Mobil(), "SIM01");
        Pengemudi bulan = new Pengemudi("Bulan", new Motor(), "SIM02");
        
        rembulan.infoPengemudi();
        bulan.infoPengemudi();
    }
}