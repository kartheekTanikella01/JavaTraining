package OOPsTasks.Task12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LambdaCollections {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<String> names=new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("enter the name");
            names.add(scanner.nextLine().toUpperCase());
        }

        System.out.println(names);
        List<String> startwithA=names.stream().filter(name->name.startsWith("A")).toList();
        System.out.println(startwithA);
        List<String> sortedList=names.stream().sorted().toList();
        System.out.println(sortedList);




    }
}
