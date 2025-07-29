package exceptionHandling.Interface.task3;

public class MainFUnctionalPrinter implements Printable ,Scannable{
    @Override
    public void PrintableInfo() {
        System.out.println("printable info");
    }

    @Override
    public void ScannableInfo() {
        System.out.println("Scannable info");

    }

    public static void main(String[] args) {
        MainFUnctionalPrinter mainFUnctionalPrinter=new MainFUnctionalPrinter();
        mainFUnctionalPrinter.PrintableInfo();
        mainFUnctionalPrinter.ScannableInfo();

    }
}
