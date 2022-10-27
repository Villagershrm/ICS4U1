/**
 * Wing Li
 * September 15, 2022
 * Outputs the sum of each digit in a number entered by the user
 * Notes: Only adds the digit sum of whole numbers
 */
import java.util.Scanner;

public class Q3AddDigits {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num, sum;
        sum = 0;
        num = Integer.parseInt(keyboard.nextLine());

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        System.out.println("Digit sum: " + sum);
        keyboard.close();
    }
}
