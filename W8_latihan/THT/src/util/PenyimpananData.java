package util;
import java.util.ArrayList;
import model.Pemain;

public class PenyimpananData {
    private static ArrayList<Pemain> daftarPemain = new ArrayList<>();

    public static void tambahPemain(Pemain pemain) {
        daftarPemain.add(pemain);
    }

    public static Pemain cariPemain(String username) {
        for (Pemain pemain : daftarPemain) {
            if (pemain.getUsername().equals(username)) {
                return pemain;
            }
        }
        return null;
    }

    public static boolean cekUsername(String username) {
        for (Pemain pemain : daftarPemain) {
            if (pemain.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }
}