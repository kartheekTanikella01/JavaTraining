package exceptionHandling.Interface.realWorldScenaro;

public interface Controllable {
    public void turnOn();
    public void turnOf();

    default void stuatus(){
        System.out.println("the system is either on/off");
    }
    public static void info(){
        System.out.println("this is a static method with device info ");
    }

}
