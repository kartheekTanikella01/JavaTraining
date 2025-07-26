package OOPsTasks.Task5;

public class main {
    public static void main(String[] args) {

        Car mycar=new Car();
        mycar.brand="toyata";
        mycar.model="camry";
        mycar.speed=125;

        mycar.getDetails();

        //dynamic method of overriding:parenclass object reference is used to get child class object and invoke method of child class

        Vehicle myvehicle=new Car("honda",125,"city");
        myvehicle.getDetails();


        

    }
}
