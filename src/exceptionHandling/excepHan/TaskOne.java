package exceptionHandling.excepHan;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num= scanner.nextInt();
        int res;
        try{
            res=num/0;
        }catch (ArithmeticException exception){
            System.out.println("exception found ");
            exception.printStackTrace();
        }
        scanner.close();
    }
}
