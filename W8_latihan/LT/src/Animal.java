public class Animal {
    private HealthRecord HealthRecord;

    public Animal(String nomorRekam) {
        this.HealthRecord = new HealthRecord(nomorRekam);
    }

    public void makeSound() {
        System.out.println("Animal bersuara");
    }

    public HealthRecord getHealthRecord() {
        return HealthRecord;
    }
}