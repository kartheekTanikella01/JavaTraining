package OOPsTasks.Task5;

public class Car extends Vehicle {
    public String model;

    public Car() {

    }

    public Car(String brand, int speed, String model) {
        super(brand, speed);
        this.model = model;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("the model of the car is"+ model);
    }
}
