package exceptionHandling.abstraction.RealworldScenario1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        UPI upi=new UPI(scanner.nextLong(), scanner.nextLong());
        upi.paymentMethod();
        CreditCard creditCard=new CreditCard(scanner.nextLong(), scanner.nextLong());
        creditCard.paymentMethod();
        Cash cash=new Cash(scanner.nextLong());
        cash.paymentMethod();

    }


}
