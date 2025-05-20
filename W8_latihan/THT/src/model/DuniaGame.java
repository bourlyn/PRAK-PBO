package model;
import java.util.Random;

class HasilKejadian {
    String deskripsi;
    String item;
    
    public HasilKejadian(String deskripsi, String item) {
        this.deskripsi = deskripsi;
        this.item = item;
    }
}
public class DuniaGame {
 public String[] kejadianRandom() {
    Random random = new Random();
    String[] kejadianBiasa = {
        "Bertemu Pedagang",
        "Diserang Goblin", 
        "Tidak Ada Kejadian",
        "Tersesat di Hutan"
    };
    
    String[] kejadianItem = {
        "Pedang Legendaris",
        "Ramuan Penyembuh",
        "Harta Karun",
        "Perisai Baja"
    };

    if (random.nextInt(10) < 7) { // 70% kejadian biasa
        return new String[] {
            kejadianBiasa[random.nextInt(kejadianBiasa.length)],
            null
        };
    } else { // 30% dapat item
        String item = kejadianItem[random.nextInt(kejadianItem.length)];
        return new String[] {
            "Anda menemukan " + item + "!",
            item
        };
        }
    }

    public int gerakanAcak() {
        return new java.util.Random().nextInt(3) - 1;
    }
}