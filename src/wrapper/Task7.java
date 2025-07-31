package wrapper;

import java.util.ArrayList;

public class Task7 {
    public static void main(String[] args) {
        ArrayList<String> stringnumber=new ArrayList<>();
        stringnumber.add("56");
        stringnumber.add("98");
        stringnumber.add("78");
        stringnumber.add("23");

        ArrayList<Integer> arrayList=new ArrayList<>();
        for (String i:stringnumber){
            int intvalue=Integer.parseInt(i);
            arrayList.add(intvalue);
        }
        ArrayList<Integer> celsiusList = new ArrayList<>();
        ArrayList<Double> fahrenheitList = new ArrayList<>();

        // Step 2: Parse and convert each Celsius to Fahrenheit
        for (String temp : stringnumber) {
            int celsius = Integer.parseInt(temp); // Convert to int
            double fahrenheit = (celsius * 9.0 / 5) + 32; // Celsius to Fahrenheit

            celsiusList.add(celsius);
            fahrenheitList.add(fahrenheit);
        }
        System.out.println("Celsius\tFahrenheit");
        for (int i = 0; i < celsiusList.size(); i++) {
            System.out.println(celsiusList.get(i) + "\t" + fahrenheitList.get(i));
        }
    }
}
