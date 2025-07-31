package wrapper;

import java.util.Arrays;

public class WrapperSorting {
    public static void main(String[] args) {
        Integer[] numbers = {45, 12, 67, 23, 89, 67};

        Arrays.sort(numbers); // Ascending
        System.out.println("Sorted: " + Arrays.toString(numbers));

        // 2nd highest = length - 2
        int secondHighest = numbers[numbers.length - 2];
        System.out.println("Second highest: " + secondHighest);
    }
}
