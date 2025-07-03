package calendar;

public class Kalender {
    public static boolean isValidTanggal(int tanggal) {
        return tanggal >= 1 && tanggal <= 30;
    }

    public static int getSelisihHari(int tglPinjam, int tglKembali) {
        if (tglKembali >= tglPinjam) {
            return tglKembali - tglPinjam;
        } else {
            return (30 - tglPinjam) + tglKembali;
        }
    }
}