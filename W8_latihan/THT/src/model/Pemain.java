package model;
import java.util.ArrayList;

public class Pemain {
    private String username;
    private String password;
    private int posisi;
    private ArrayList<String> inventori;
    private int level;
    private int exp;
    private int maxExp;

    public Pemain(String username, String password) {
        this.username = username;
        this.password = password;
        this.posisi = 0;
        this.inventori = new ArrayList<>();
        this.level = 0;
        this.exp = 0;
        this.maxExp = 99;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getPosisi() {
        return posisi;
    }

    public void setPosisi(int posisi) {
        this.posisi = posisi;
    }

    public ArrayList<String> getInventori() {
        return inventori;
    }

    public void tambahItem(String item) {
        inventori.add(item);
        System.out.println("Anda mendapatkan: " + item);
    }

    public void tampilkanInventori() {
        System.out.println("\n=== Inventori Anda ===");
        if (inventori.isEmpty()) {
            System.out.println("Inventori kosong!");
        } else {
            for (String item : inventori) {
                System.out.println("- " + item);
            }
        }
        System.out.println("Level: " + level);
        System.out.println("XP: " + exp + "/" + maxExp);
    }

    public void tambahExp(int jumlah) {
        this.exp += jumlah;
        System.out.println("Anda mendapatkan " + jumlah + " XP!");
        
        while (this.exp >= this.maxExp) {
            levelUp();
        }
    }

    private void levelUp() {
        this.level++;
        this.exp -= this.maxExp;
        this.maxExp = (int)(this.maxExp * 1.5);
        System.out.println("=================================");
        System.out.println(" SELAMAT! Anda naik ke level " + this.level + "!");
        System.out.println("=================================");
    }

    public void kurangiLevel() {
        if (this.level > 1) {
            this.level--;
            this.exp = 0;
            System.out.println("Anda turun ke level " + this.level + "!");
        } else {
            System.out.println("Level anda sudah minimum");
        }
    }

    public int getLevel() {
        return level;
    }

    public int getExp() {
        return exp;
    }

    public int getMaxExp() {
        return maxExp;
    }
}