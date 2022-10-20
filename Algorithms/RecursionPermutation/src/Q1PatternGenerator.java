/**
 * Wing Li
 * October 17, 2022
 * Print out the bit patterns with length n with k ones in descending order
 * The first input will be the number of bit patterns
 */
import java.util.Scanner;

public class Q1PatternGenerator {
     
    public static void bitPattern(int n, int k) {
        bitPattern(n, k, "");
    }

    public static void bitPattern(int n, int k, String soFar) {
        if (n == 0) {
            if (k == 0) {
                System.out.println(soFar);
            }
            return;
        }
        bitPattern(n - 1, k - 1, soFar + "1");
        bitPattern(n - 1, k, soFar + "0");
    }
    public static void main(String[] args) throws Exception {
        //Grab input
        Scanner keyboard = new Scanner(System.in);
        int patterns, n, k;

        patterns = Integer.parseInt(keyboard.nextLine());
        for (int i = 0; i < patterns; i++) {
            n = keyboard.nextInt();
            k = keyboard.nextInt();

            bitPattern(n, k);
        }

        keyboard.close();
    }
}
