/*
Wing Li
September 8, 2022
Gets a positive integer and finds the smallest power of 2 greater than or equal to the number
*/
import java.util.Scanner;

public class Q2LeastTwoPower {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num, currentPow;
        currentPow = 0;
        
        System.out.print("Input a positive integer: ");
        num = Integer.parseInt(keyboard.nextLine());

        while (Math.pow(2, currentPow) < num) {
            currentPow++;
        }

        System.out.println("2^" + currentPow + " = " + (int) Math.pow(2, currentPow));

        keyboard.close();
    }
}
