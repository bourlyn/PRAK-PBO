package aktivitas;

class Animal {
    void eat(){
        System.out.println("AKU MAKAN");
    }
}

class Dog extends Animal{
    void soundAnjing(){
        System.out.println("guguk");
    }
}

class Pig extends Animal{
    void soundBabi(){
        System.out.println("hihi");
    }
}

public class Main_3 {
    public static void main(String[] args) {
    Dog dog = new Dog();
    dog.eat();
    dog.soundAnjing();

    Pig pig = new Pig();
    pig.eat();
    pig.soundBabi();
    }
}
