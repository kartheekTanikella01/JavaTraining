package exceptionHandling.abstraction.Task1;

public class Circle extends Shape{
    String shapeis;
    double radius;

    public Circle() {
    }

    public Circle(double radius,String shapeis) {
        this.radius = radius;
        this.shapeis=shapeis;
    }

    @Override
    public double area() {
        return 2.17*radius*radius;
    }
}
