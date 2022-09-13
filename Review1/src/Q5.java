/*
Wing Li
September 8, 2022
Calculates the price of an order for an employee, as well as displays the amount of change due.
*/
import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        //Variable declaration
        Scanner keyboard = new Scanner(System.in);
        final Double BURGER_PRICE = 1.69;
        final Double FRIES_PRICE = 1.09;
        final Double SODA_PRICE = 0.99;
        final Double PST = 0.08;
        final Double GST = 0.05;
        int burgerNum, friesNum, sodaNum;
        double subtotal, total, tendered;

        //Get input from user
        System.out.print("Input the number of burgers ordered: ");
        burgerNum = Integer.parseInt(keyboard.nextLine());
        System.out.print("Input the number of fries ordered: ");
        friesNum = Integer.parseInt(keyboard.nextLine());
        System.out.print("Input the number of sodas ordered: ");
        sodaNum = Integer.parseInt(keyboard.nextLine());

        //Calculation
        subtotal = burgerNum * BURGER_PRICE + friesNum * FRIES_PRICE + sodaNum * SODA_PRICE;
        total = subtotal * (1 + PST + GST);

        //Output subtotal, taxes, and total
        System.out.printf("The subtotal is $%.2f.%n", subtotal);
        System.out.printf("The PST is $%.2f.%n", subtotal * PST);
        System.out.printf("The GST is $%.2f.%n", subtotal * GST);
        System.out.printf("The total price is $%.2f.%n", total);

        //Blank line for style purposes
        System.out.println();

        //Ask for amount tendered
        System.out.print("Input the amount tendered: $");
        tendered = Double.parseDouble(keyboard.nextLine());

        //Output the customer's change
        System.out.printf("The change will be $%.2f.%n", (tendered - total));

        keyboard.close();
    }
}
