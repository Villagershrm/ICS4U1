/**
 * Wing Li
 * September 15, 2022
 * Turns a string uppercase
 */
import java.util.Scanner;

public class Q1MakeUppercase {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = keyboard.nextLine();

        System.out.println("Uppercase Equivalent: " + input.toUpperCase());
        keyboard.close();
    }
}
