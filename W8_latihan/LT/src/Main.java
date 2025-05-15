public class Main {
    public static void main(String[] args) {
        Pemilik rembulan = new Pemilik("Rembulan", new Dog("ANJ001"));
        Pemilik bulan = new Pemilik("Bulan", new Cat("KUC002"));

        displayInfo(rembulan);
        displayInfo(bulan);
    }

    public static void displayInfo(Pemilik pemilik) {
        System.out.println("\n-------------------------");
        System.out.println("Nama Pemilik: " + pemilik.getNama());
        
        Animal animal = pemilik.getAnimal();
        System.out.print("Suara hewan: ");
        animal.makeSound();
        
        if (animal instanceof Dog) {
            System.out.println("Jenis hewan: Anjing");
        } else if (animal instanceof Cat) {
            System.out.println("Jenis hewan: Kucing");
        }
        
        System.out.println(animal.getHealthRecord());
    }
}