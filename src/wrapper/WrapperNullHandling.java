package wrapper;

import java.util.Optional;

public class WrapperNullHandling {
    public static void main(String[] args) {
        Double amount = null;

        try {
            double val = amount; // Unboxing null throws NPE
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException during unboxing.");
        }

        // Fix using Optional
        Optional<Double> optionalAmount = Optional.ofNullable(amount);
        double safeAmount = optionalAmount.orElse(0.0);
        System.out.println("Safe value using Optional: " + safeAmount);
    }
}
