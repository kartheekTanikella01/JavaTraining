package exceptionHandling.excepHan;

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int age= scanner.nextInt();
        try{
            validateAge(age);
        }catch (Exception ex){
            System.out.println("Exception caught: "+ex.getMessage());
        }

    }
    public static void validateAge(int age) throws Exception{
        if (age>18){
            System.out.println("the age is valid: "+age);
        }else{
            throw  new Exception("age must be above 18");
        }

    }
}
