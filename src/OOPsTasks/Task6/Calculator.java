package OOPsTasks.Task6;

public class Calculator {

    public int add(int num1,int num2){
        System.out.println("int return");
        return num1+num2;
    }

    public double add(double num1,double num2){
        System.out.println("double return");
        return  num1+num2;
    }

    public String add(String s1,String s2){
        System.out.println("String return");
        return s1+s2;
    }

    public static void main(String[] args) {
        Calculator c=new Calculator();
        System.out.println(c.add(5.15,7.23));

    }

}
