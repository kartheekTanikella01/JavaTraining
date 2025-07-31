package wrapper;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Double> numbers=new ArrayList<>();

        numbers.add(89.2);
        numbers.add(90.8);
        numbers.add(2121.2);

        double sum=0.0;
        for (double n:numbers){
            sum=sum+n;
        }
        double average=sum/numbers.size();
        System.out.println("avarage: "+ average);
        System.out.println(sum);

    }
}
