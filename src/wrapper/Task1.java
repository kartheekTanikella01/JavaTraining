package wrapper;

public class Task1 {
    public static void main(String[] args) {
        int number=565;
        double price=90.8;
        char ch='a';

        Integer intobj=Integer.valueOf(number);
        Double doubobj=Double.valueOf(price);
        Character charObj=Character.valueOf(ch);


        int  value=intobj.intValue();
        double value2=doubobj.doubleValue();
        char value3=charObj.charValue();

        System.out.println(number+" "+price+" "+ch);
        System.out.println(intobj+" "+doubobj+" "+charObj);
        System.out.println(value+" "+value2+" "+value3);






    }

}
