package javaCollection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> ts=new TreeSet<>();
        ts.add("alex");
        ts.add("dani daniels");
        ts.add("bob marley");
        ts.add("claire");
        ts.add("alex");

        System.out.println("tree set maintain natural order and remove duplicates: "+ts);

        //task
        TreeSet<Integer> integerTreeSet=new TreeSet<>();
        integerTreeSet.add(8);
        integerTreeSet.add(23);
        integerTreeSet.add(45);
        integerTreeSet.add(98);

        Iterator<Integer> integerIterator=integerTreeSet.iterator();
        while (integerIterator.hasNext()){
            System.out.println(integerIterator.next());
        }
    }
}
