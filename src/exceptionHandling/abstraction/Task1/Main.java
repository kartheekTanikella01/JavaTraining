package exceptionHandling.abstraction.Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        Circle circle=new Circle();
        System.out.println("Enter the length: ");
        rectangle.width=scanner.nextDouble();
        System.out.println("Enter the width:  ");
        rectangle.length=scanner.nextDouble();
        rectangle.shapeis=scanner.next();
        rectangle.displayShape(rectangle.shapeis);
        System.out.println(rectangle.area());
        System.out.println("Enter the radius");
        circle.radius=scanner.nextDouble();
        circle.shapeis=scanner.next();
        circle.displayShape(circle.shapeis);
        System.out.println(circle.area());

    }
}
