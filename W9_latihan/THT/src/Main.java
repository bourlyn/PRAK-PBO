import transportasi.*;

public class Main {
    public static void main(String[] args) {
        Transportasi[] transports = {
            new Bus("Bus Rembulan", 50, "Jakarta-Lampung"),
            new Kereta("Kereta Argo", 300, "Jakarta-Jawa"),
            new Pesawat("Garuda Indonesia", 150, "Jakarta-Madinah")
        };

        for (Transportasi t : transports) {
            System.out.println("\n Informasi Transportasi ");
            System.out.println("------------------------");
            t.displayInfo();

            System.out.println("Harga Tiket Default: Rp " + t.hitungHargaTiket());

            if (t instanceof Bus) {
                Bus bus = (Bus) t;
                System.out.println("Harga Tiket Ekonomi: Rp " + bus.hitungHargaTiket("ekonomi"));
                System.out.println("Harga Tiket Bisnis: Rp " + bus.hitungHargaTiket("bisnis"));
                System.out.println("Harga Tiket VIP: Rp " + bus.hitungHargaTiket("vip"));
            } else if (t instanceof Kereta) {
                Kereta kereta = (Kereta) t;
                System.out.println("Harga Tiket Ekonomi: Rp " + kereta.hitungHargaTiket("ekonomi"));
                System.out.println("Harga Tiket Bisnis: Rp " + kereta.hitungHargaTiket("bisnis"));
                System.out.println("Harga Tiket VIP: Rp " + kereta.hitungHargaTiket("vip"));
            } else if (t instanceof Pesawat) {
                Pesawat pesawat = (Pesawat) t;
                System.out.println("Harga Tiket Ekonomi: Rp " + pesawat.hitungHargaTiket("ekonomi"));
                System.out.println("Harga Tiket Bisnis: Rp " + pesawat.hitungHargaTiket("bisnis"));
                System.out.println("Harga Tiket VIP: Rp " + pesawat.hitungHargaTiket("vip"));
            }
        }
    }
}