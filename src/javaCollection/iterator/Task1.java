package javaCollection.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Apple");
        names.add("Banana");
        names.add("Avocado");
        names.add("Mango");
        names.add("Apricot");

        // Character to remove (case-insensitive)
      char characterRemoval='A';

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            if (name.toLowerCase().charAt(0) ==Character.toLowerCase(characterRemoval)) {
                iterator.remove();
            }
        }

        System.out.println("After removal: " + names);
    }
}
