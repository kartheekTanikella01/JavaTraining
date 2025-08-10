package javaCollection;

import java.util.HashSet;

public class SetProperties {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        set.add("Java");
        set.add("C");
        set.add("Java");
        set.add("Python");

        System.out.println("duplicate is no allowed: "+set);
    }
}
