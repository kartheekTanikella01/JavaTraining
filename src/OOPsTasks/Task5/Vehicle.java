package OOPsTasks.Task5;

public class Vehicle {

    public String brand;
    public int speed;

    public Vehicle() {
    }

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }
    public void getDetails(){
        System.out.println("the vehicle brand is: "+brand);
        System.out.println("the vehicle speed is: "+speed);
    }



}
