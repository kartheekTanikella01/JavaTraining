package javaCollection.hashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapTask {
    public static void main(String[] args) {
        String str="kartheek";
        HashMap<Character,Integer> charCount=new HashMap<>();

        for (Character c:str.toCharArray()){
            charCount.put(c,charCount.getOrDefault(c,0)+1);
        }
        for (Map.Entry<Character,Integer> entry:charCount.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
