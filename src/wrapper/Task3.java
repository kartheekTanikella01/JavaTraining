package wrapper;

public class Task3 {
    public static void main(String[] args) {
        // Input Strings
        String intStr = "123";
        String doubleStr = "45.67";
        String boolStr = "true";

        // Parsing using parseXxx()
        int intVal = Integer.parseInt(intStr);
        double doubleVal = Double.parseDouble(doubleStr);
        boolean boolVal = Boolean.parseBoolean(boolStr);

        // Printing values and their types
        System.out.println("Parsed int value: " + intVal + " (Type: " + ((Object)intVal).getClass().getSimpleName() + ")");
        System.out.println("Parsed double value: " + doubleVal + " (Type: " + ((Object)doubleVal).getClass().getSimpleName() + ")");
        System.out.println("Parsed boolean value: " + boolVal + " (Type: " + ((Object)boolVal).getClass().getSimpleName() + ")");
    }
}

