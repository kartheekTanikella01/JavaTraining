package wrapper;

public class Task4 {
    public static void main(String[] args) {
        // Autoboxing: values between -128 to 127 are cached
        Integer a = 100;  // Autoboxing
        Integer b = 100;  // Autoboxing




        // Comparisons
        System.out.println("a == b: " + (a == b));             // true (same cached object)
        System.out.println("a.equals(b): " + a.equals(b));     // true (same value)


    }
}

