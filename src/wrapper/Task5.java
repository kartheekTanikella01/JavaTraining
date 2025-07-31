package wrapper;

// Generic Class
class Box<T> {
    private T value;

    // Store value
    public void setValue(T value) {
        this.value = value;
    }

    // Retrieve value
    public T getValue() {
        return value;
    }
}

public class Task5 {
    public static void main(String[] args) {
        // Instantiate Box for Integer
        Box<Integer> intBox = new Box<>();
        intBox.setValue(100); // Autoboxing int to Integer
        System.out.println("Integer value: " + intBox.getValue());

        // Instantiate Box for Double
        Box<Double> doubleBox = new Box<>();
        doubleBox.setValue(45.67); // Autoboxing double to Double
        System.out.println("Double value: " + doubleBox.getValue());
    }
}

