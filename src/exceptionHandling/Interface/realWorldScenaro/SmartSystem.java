package exceptionHandling.Interface.realWorldScenaro;

public class SmartSystem {
    public static void main(String[] args) {
        Controllable.info();
        Controllable light=new SmartLight();
        light.turnOn();
        light.stuatus();
        light.turnOf();
        
    }
}
