package OOPsTasks.Task11;

public class Main  {
    public static void main(String[] args) {
        MathOperations add= (a,b)->a+b;
        MathOperations sub=(a,b)->a-b;
        MathOperations product=(a,b)-> a*b;

        System.out.println(add.operate(1,2));
        System.out.println(sub.operate(2,1));
        System.out.println(product.operate(12,43));


    }
}


