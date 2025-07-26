package OOPsTasks.Task7;

public class Animal {
    public void sound(){
        System.out.println("this a animal sound");
    }
}

class Dog extends Animal{

    @Override
    public void sound() {
        System.out.println("this is a dog sound");
    }
}

class Cat extends  Animal{
    @Override
    public void sound() {
        System.out.println("this is cat sound ");
    }
}

class Cow extends Animal{
    @Override
    public void sound() {
        System.out.println("this is cow sound");
    }
}

