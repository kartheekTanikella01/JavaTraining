package exceptionHandling.abstraction.Task1;

public abstract class Shape {
    public abstract double area();

    public void displayShape(String s){
        System.out.println("The shape is: "+ s);
    }
}
