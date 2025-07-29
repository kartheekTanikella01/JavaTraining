package exceptionHandling.abstraction.Task1;

public class Rectangle extends Shape{
    String shapeis;
    double length;
    double width;

    public Rectangle() {
        super();

    }

    public Rectangle(double length, double width,String shapeis) {
        this.length = length;
        this.width = width;
        this.shapeis=shapeis;
    }

    @Override
    public double area() {
        return length*width;
    }

}
