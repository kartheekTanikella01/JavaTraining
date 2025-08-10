package javaCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingListOpeartion {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(1);
        arrayList.add(6);
        arrayList.add(3);
        arrayList.add(8);
        arrayList.add(5);
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(7);

        System.out.println("Before sorting: "+arrayList);
        arrayList.sort(Comparator.naturalOrder());
        System.out.println("after sorting AO: "+arrayList);
        Collections.sort(arrayList,Collections.reverseOrder());
        arrayList.sort(Comparator.naturalOrder());
        System.out.println("after sorting DO: "+arrayList);
    }
}
