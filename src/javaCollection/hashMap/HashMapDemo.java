package javaCollection.hashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> hs=new HashMap<>();
        hs.put(1,"ALex");
        hs.put(2,"Bob");
        hs.put(3,"Clare");
        hs.put(4,"tony");
        hs.put(5,"chris");

        System.out.println("Value for 1: "+ hs.get(1));

        hs.remove(2);
        System.out.println(hs);

        for (Map.Entry<Integer,String> e: hs.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}
