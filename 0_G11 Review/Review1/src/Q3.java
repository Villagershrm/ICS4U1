/*
Wing Li
September 8, 2022
Reads 3 double values and outputs their average
*/
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        double total = 0;

        for (int i = 0; i < 3; i++) {
            total += keyboard.nextDouble();
        }
        
        System.out.println("The average is " + (total / 3.0));
        keyboard.close();
    }
}
