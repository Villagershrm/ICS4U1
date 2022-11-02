import java.util.Scanner;

public class TestJackCard {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        JackCard c1 = new JackCard();
        JackCard c2 = new JackCard("Bobby", 100, 3443);

        System.out.print("Input maximum balance: $");
        double maxBalance = Double.parseDouble(keyboard.nextLine());
        JackCard.setMaxBalance(maxBalance);


        if (c1.refill(50)) { //c1: $50, 0 points
            System.out.println("Refilled successfully");
        } else {
            System.out.println("Refill unsuccessful");
        }

        if (c2.pay(60, 3443, false)) { //c2: $40, 30 points
            System.out.println("Payment successful");
        } else {
            System.out.println("Payment unsuccessful");
        }

        if (c1.higherBalance(c2).pay(10, 1234, false)) { //c1: $40, 5 points
            System.out.println("Payment successful");
        } else {
            System.out.println("Payment unsuccessful");
        }

        if (c1.higherPoints(c2).pay(5, 3443, true)) { //c2: $36, 12 points
            System.out.println("Payment successful");
        } else {
            System.out.println("Payment unsuccessful");
        }
        
        c1.combinePoints(c2); //c1: $40, 17 points

        if (c1.pay(5, 1234, true)) { //c1: $35, 19 points
            System.out.println("Payment successful");
        } else {
            System.out.println("Payment unsuccessful");
        }
        
        System.out.print("Input new PIN: ");
        int newPin = Integer.parseInt(keyboard.nextLine());
        if (c1.changePIN("default", newPin)) {
            System.out.println("Successfully changed PIN");
        } else {
            System.out.println("PIN change unsuccessful");
        }
        
        
        System.out.println();
        System.out.println(c1);
        System.out.println(c2);

        keyboard.close();
    }
}
