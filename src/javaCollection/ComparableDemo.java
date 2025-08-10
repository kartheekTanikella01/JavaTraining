package javaCollection;

import java.util.Arrays;

class Number implements Comparable<Number>{
    int v;
    public Number(int v){
        this.v=v;
    }

    @Override
    public String toString() {
        return "Number{" +
                "v=" + v +
                '}';
    }

    @Override
    public int compareTo(Number o) {
        return this.v-o.v;

    }
}
public class ComparableDemo {
    public static void main(String[] args) {
        Number[] number={new Number(4),new Number(55),new Number(6)};
        System.out.println("Before Sorting: "+ Arrays.toString(number));
        Arrays.sort(number);
        System.out.println("After sorting: "+Arrays.toString(number));

    }

}
