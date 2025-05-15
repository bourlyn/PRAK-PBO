public class Pemilik {
    private String nama;
    private Animal animal;

    public Pemilik(String nama, Animal A) {
        this.nama = nama;
        this.animal = A;
    }

    public String getNama() {
        return nama;
    }

    public Animal getAnimal() {
        return animal;
    }
}