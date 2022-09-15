/**
 * Wing Li
 * September 15, 2022
 * Outputs the sum of each pair of digits in a number entered by the user
 */
import java.util.Scanner;

public class Q4AddPairs {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String num;
        int sum = 0;

        num = keyboard.nextLine();
        while (num.length() > 1) {
            sum += Integer.parseInt(num.substring(0,2));
            num = num.substring(2);
        }

        //1 digit is left; add it to the sum
        if (num.length() == 1) {
            sum += Integer.parseInt(num);
        }

        System.out.println(sum);
        keyboard.close();
    }
}
