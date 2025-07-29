package exceptionHandling.Interface;

public class Tv implements RemoteControl {
    @Override
    public void turnon() {
        System.out.println("tv is on");

    }

    @Override
    public void batterystatus() {
        RemoteControl.super.batterystatus();
        System.out.println("batter status ");
    }


    public static void main(String[] args) {
        Tv tv = new Tv();
        tv.batterystatus();
        tv.turnon();
        RemoteControl.info();
    }
}
