package javaCollection;

import java.util.ArrayList;

public class ArrayListOperation {
    public static void main(String[] args) {
        ArrayList<String> str=new ArrayList<>();
        str.add("Java");
        str.add("JavaScript");
        str.add("c++");
        str.add("Ruby");
        str.add("Python");
        System.out.println("the arrayList is before removing second element: "+str);

        str.remove(1);
        System.out.println("after removing: "+str);


    }
}
