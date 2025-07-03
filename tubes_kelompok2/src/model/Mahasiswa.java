package model;

public class Mahasiswa extends Pengguna {
    public Mahasiswa(String id, String nama) {
        super(id, nama);
    }

    @Override
    public String getRole(){
        return "Mahasiswa";
    }
}