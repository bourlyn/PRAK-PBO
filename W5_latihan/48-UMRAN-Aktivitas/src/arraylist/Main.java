package arraylist;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[] hari = new String[7];
        hari[0] = "Senin";
        hari[1] = "Selasa";
        hari[2] = "Rabu";
        hari[3] = "Kamis";
        hari[4] = "Jumat";

        for (String string : hari) {
            System.out.println(string);
        }

        ArrayList<String> days = new ArrayList<>();
        days.add("Senin");
        days.add("Selasa");

        System.out.println(days.get(0));
        days.set(0, "Minggu");
        System.out.println(days.get(0));

        //hapus elemen
        days.remove(0);

        //ukuran elemen
        int ukuran=days.size();
    }
}
