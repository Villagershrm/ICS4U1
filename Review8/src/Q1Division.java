/**
 * Wing Li
 * Sept 20, 2022
 * A simple program that performs integer division but quits when user input something starting with 'q' or 'Q'
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Q1Division {
    public static void main(String[] args) throws Exception {
        final char QUIT = 'q';
        Scanner keyboard = new Scanner(System.in);
        String input = ""; //Not really needed tbh
        int num, dev;
        boolean isQuitting = false;

        while (!isQuitting) {
            try {
                System.out.println();
                System.out.print("Enter the numerator: ");
                num = keyboard.nextInt();
                System.out.print("Enter the divisor: ");
                dev = keyboard.nextInt();
                //Apparently dividing by 0.0 gives us Infinity, which I didn't know happened
                System.out.println(num + " / " + dev + " is " + ((num) / dev));

            } catch (InputMismatchException ime) { //nextInt() throws this when it reads not an int
                input = keyboard.nextLine(); //Remember that when nextInt() throws an exception, it doesn't flush the stream
                if (Character.toLowerCase(input.charAt(0)) == QUIT) {
                    isQuitting = true;
                } else {
                    System.out.println("Invalid input.");
                    System.out.println("Please try again.");
                }
            } catch (ArithmeticException ae) {
                System.out.println("You can't divide by 0");
            }
        }
        keyboard.close();
    }
}
