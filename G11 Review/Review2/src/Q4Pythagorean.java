/* Wing Li
 * September 8, 2022
 * Prints all pythagorean triplets whose largest number is less than or equal to the integer the user inputted
 */
import java.util.Scanner;

public class Q4Pythagorean {
    public static void main(String[] args) {
        //Variable declaration
        Scanner keyboard = new Scanner(System.in);
        int num;
        double c;

        System.out.print("Enter a positive integer: ");
        num = Integer.parseInt(keyboard.nextLine());

        for (int a = 3; a < num - 1; a++) { //Smallest pythagorean triplet starts at 3
            for (int b = a + 1; b < num; b++) {
                c = Math.sqrt(a * a + b * b);
                //If C is an integer and is less than or equal to the maximum number, print a b and c
                if (!(c > Math.floor(c)) && c <= num) { 
                    System.out.println(a + " " + b + " " + (int) c);
                }
            }
        }
        keyboard.close();
    }
}
/* Third for loop that I'm not using
 * for (int c = b + 1; c <= num; c++) {
        if (a * a + b * b == c * c) {
            System.out.println(a + " " + b + " " + c);
        }
    }
 */