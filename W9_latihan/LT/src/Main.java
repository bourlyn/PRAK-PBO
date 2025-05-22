class MetodeBayar {
    void bayar(double jumlah) {
        System.out.println("Pembayaran: " + jumlah);
    }
    
    // Metode dengan mata uang (overloading)
    void bayar(double jumlah, String mataUang) {
        System.out.println("Pembayaran: " + jumlah + " " + mataUang);
    }
}

class KartuKredit extends MetodeBayar {
    @Override
    void bayar(double jumlah) {
        System.out.println("[Kartu Kredit] Total: " + jumlah);
        System.out.println("Biaya admin: " + (jumlah * 0.02));
    }
    
    @Override
    void bayar(double jumlah, String mataUang) {
        System.out.println("[Kartu Kredit] Total: " + jumlah + " " + mataUang);
        System.out.println("Biaya admin: " + (jumlah * 0.02) + " " + mataUang);
    }
}

class DompetDigital extends MetodeBayar {
    @Override
    void bayar(double jumlah) {
        System.out.println("[Dompet Digital] Total: " + jumlah);
        System.out.println("Biaya admin: " + (jumlah * 0.01));
    }
    
    @Override
    void bayar(double jumlah, String mataUang) {
        System.out.println("[Dompet Digital] Total: " + jumlah + " " + mataUang);
        System.out.println("Biaya admin: " + (jumlah * 0.01) + " " + mataUang);
    }
}

class TransferBank extends MetodeBayar {
    @Override
    void bayar(double jumlah) {
        System.out.println("[Transfer Bank] Total: " + jumlah);
        System.out.println("Biaya admin: 5000");
    }
    
    @Override
    void bayar(double jumlah, String mataUang) {
        System.out.println("[Transfer Bank] Total: " + jumlah + " " + mataUang);
        if (mataUang.equals("IDR")) {
            System.out.println("Biaya admin: 5000 IDR");
        } else {
            System.out.println("Biaya admin: 1 " + mataUang);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MetodeBayar[] semuaMetode = {
            new KartuKredit(),
            new DompetDigital(),
            new TransferBank()
        };
        
        System.out.println("\nPEMBAYARAN BIASA");
        System.out.println("-----------------");
        for (MetodeBayar metode : semuaMetode) {
            metode.bayar(999000); 
        }
        
        System.out.println("\nPEMBAYARAN DENGAN MATA UANG");
        System.out.println("-----------------------------");
        for (MetodeBayar metode : semuaMetode) {
            metode.bayar(100999, "IDR"); 
        }
        
        System.out.println("\nPEMBAYARAN DALAM USD");
        System.out.println("---------------------");
        for (MetodeBayar metode : semuaMetode) {
            metode.bayar(50, "USD");
        }
    }
}