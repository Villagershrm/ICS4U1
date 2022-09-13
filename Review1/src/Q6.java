/*
Wing Li
September 8, 2022
Asks for a three-digit number, finds the sum of the digits of the number, and then prints both the number and its digit sum
*/
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        //Variable declaration
        Scanner keyboard = new Scanner(System.in);
        int num, numTemp, sum;

        System.out.print("Input a three-digit number: ");
        num = Integer.parseInt(keyboard.nextLine());

        //Check if the number is three-digits
        if (!(num < 100 || num > 999)) {
            //Find the sum of the digits
            sum = 0;
            numTemp = num;
            for (int i = 0; i < 3; i++) {
                sum += numTemp % 10;
                numTemp /= 10;
            }

            //Print the number and its digit sum
            System.out.println("The number is " + num + " and its digit sum is " + sum + ".");

        } else {
            System.out.println("Invalid number");
        }

        keyboard.close();
    }
}
