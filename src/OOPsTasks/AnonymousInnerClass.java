package OOPsTasks;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Microphone obj=new Microphone() {
            @Override
            public void volume() {
                System.out.println("volume is high");
            }

        };
        obj.volume();
    }

}

interface  Microphone{
    void volume();
}
