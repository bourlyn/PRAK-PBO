package eror;

public class Main {
    public static void main(String[] args) {
        try {
            long[] data = new long[Integer.MAX_VALUE]; // alokasi memori sangat besar
        } catch (OutOfMemoryError e) {
            System.out.println("memori tidak cukup: " + e.getMessage());
        }
    }
}
