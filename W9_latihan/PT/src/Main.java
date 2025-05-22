class Karyawan {
    double hitungGaji() {
        return 0;
    }
    
    // Hitung gaji dengan bonus (overloading)
    double hitungGaji(boolean denganBonus) {
        if (denganBonus) {
            return hitungGaji() + 5000;
        }
        return hitungGaji();
    }
}

class SoftwareEngineer extends Karyawan {
    @Override
    double hitungGaji() {
        return 10000;
    }
    
    @Override
    double hitungGaji(boolean denganBonus) {
        if (denganBonus) {
            return hitungGaji() + 2000; // Bonus Software Engineer
        }
        return hitungGaji();
    }
}

class DataScientist extends Karyawan {
    @Override
    double hitungGaji() {
        return 12000; 
    }
    
    @Override
    double hitungGaji(boolean denganBonus) {
        if (denganBonus) {
            return hitungGaji() + 2500; // Bonus Data Scientist
        }
        return hitungGaji();
    }
}

class Intern extends Karyawan {
    @Override
    double hitungGaji() {
        return 3000; 
    }
    
    @Override
    double hitungGaji(boolean denganBonus) {
        if (denganBonus) {
            return hitungGaji() + 300; // Bonus Intern
        }
        return hitungGaji();
    }
}

public class Main {
    public static void main(String[] args) {
        // Daftar karyawan (polymorphism)
        Karyawan[] staff = {
            new SoftwareEngineer(),
            new DataScientist(),
            new Intern()
        };
        
        System.out.println("\nGAJI POKOK");
        System.out.println("-----------");
        for (Karyawan orang : staff) {
            System.out.println("Gaji: " + orang.hitungGaji());
        }
        
        System.out.println("\nGAJI + BONUS");
        System.out.println("--------------");
        for (Karyawan orang : staff) {
            if (orang instanceof SoftwareEngineer) {
                SoftwareEngineer se = (SoftwareEngineer) orang;
                System.out.println("Total Software Engineer: " + se.hitungGaji(true));
            } else if (orang instanceof DataScientist) {
                DataScientist ds = (DataScientist) orang;
                System.out.println("Total Data Scientist: " + ds.hitungGaji(true));
            } else if (orang instanceof Intern) {
                Intern intern = (Intern) orang;
                System.out.println("Total Intern: " + intern.hitungGaji(true));
            }
        }
    }
}