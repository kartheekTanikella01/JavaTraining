package exceptionHandling.Interface;

public interface RemoteControl {
    public void turnon();
    default void batterystatus(){
        System.out.println("");
    }
    public static void info(){
        System.out.println("This is info method");


    }
}
