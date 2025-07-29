package exceptionHandling.excepHan;

public class TaskFour {
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5};
        int num=12;
        int res;
        try{
            res=num/0;
            System.out.println(res);
            System.out.println(numbers[5]);
        }catch (ArithmeticException e){
            System.out.println("Exception caught:"+ e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception caught: "+ e.getMessage());
        }
    }
}
