package javaCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesofList {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Java");
        stringArrayList.add("C");
        stringArrayList.add("Java");
        stringArrayList.add("Python");

        List<String> uniqueList = stringArrayList.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("List after removing duplicates: " + uniqueList);
    }
}
