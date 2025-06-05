package antarmuka;

public class Mobil extends Pemilik implements Kendaraan, Pabrik {
    Mobil(String nama) {
        super(nama);
    }

    @Override
    public void nyalakanMesin() {
        System.out.println("Mobil nyalakan mesin");
    }    

    @Override
    public void matikanMesin() {
        System.out.println("Mobil matikan mesin");
    }

    @Override
    public void produksiKendaraan() {
        System.out.println("Mobil diproduksi");
    }

    @Override
    public void pemilikKendaraan(String nama) {
        System.out.println(super.nama + " adalah pemilik mobil");
    }
}   


