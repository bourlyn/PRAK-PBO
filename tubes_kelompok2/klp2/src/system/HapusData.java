package system;
import inventory.Barang;
import inventory.Pengguna;
import java.util.ArrayList;

public class HapusData {
    public static boolean hapusPengguna(ArrayList<Pengguna> daftar, String nim) {
        for (int i = 0; i < daftar.size(); i++) {
            Pengguna p = daftar.get(i);
            if (p != null && Validasi.isValid(p.nim, nim)) {
                daftar.set(i, null);
                return true;
            }
        }
        return false;
    }

    public static boolean hapusBarang(ArrayList<Barang> daftar, int id) {
        for (int i = 0; i < daftar.size(); i++) {
            Barang b = daftar.get(i);
            if (b != null && b.id == id) {
                daftar.set(i, null);
                return true;
            }
        }
        return false;
    }
}