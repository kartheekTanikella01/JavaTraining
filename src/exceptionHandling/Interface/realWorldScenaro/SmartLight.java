package exceptionHandling.Interface.realWorldScenaro;

public class SmartLight implements Controllable{
    public boolean isOn;


    @Override
    public void turnOn() {
       isOn=true;
        System.out.println("it is turnon");
    }

    @Override
    public void turnOf() {
        isOn=false;
        System.out.println("turn off");

    }

    @Override
    public void stuatus() {
        System.out.println("stauts is: "+(isOn?"ON":"OFF"));
    }
}
