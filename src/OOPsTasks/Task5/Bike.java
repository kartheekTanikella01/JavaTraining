package OOPsTasks.Task5;

public class Bike extends Vehicle {
    public String model;
    public Boolean withGear;

    public Bike() {
    }

    public Bike(String brand, int speed, String model, Boolean withGear) {
        super(brand, speed);
        this.model = model;
        this.withGear = withGear;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("model of the bike: "+model);
        System.out.println("is gear: "+ withGear);
    }


}
