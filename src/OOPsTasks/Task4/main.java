package OOPsTasks.Task4;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Rectangle rec=new Rectangle();
        Circle circle=new Circle();
        System.out.println("Enter the length: ");
        rec.length=sc.nextDouble();
        System.out.println("Enter the width: ");
        rec.width=sc.nextDouble();
       double rectangleArea= rec.area();
        System.out.println("rectangle area is "+rectangleArea);
        System.out.println("enter radius");
        circle.radius=sc.nextDouble();
        System.out.println("area of circle is: "+circle.area() );

    }
}
