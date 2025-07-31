package wrapper;

import java.util.ArrayList;
import java.util.Collections;

public class Task6 {
    public static void main(String[] args) {
        ArrayList<Integer> marks=new ArrayList<>();
        marks.add(345);
        marks.add(987);
        marks.add(9089);

        marks.remove(Collections.min(marks));
        System.out.println("After removing lowest marks: "+ marks);

        int max=Collections.max(marks);
        int min=Collections.min(marks);

        int sum=0;
        for (int mark:marks){
            sum+=mark;
        }

        int avg=sum/marks.size();

        System.out.println("Max mark: " + max);
        System.out.println("Min mark: " + min);
        System.out.println("Average mark: " + avg);



    }
}
