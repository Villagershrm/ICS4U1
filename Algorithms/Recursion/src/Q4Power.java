/**
 * Wing Li
 * Oct 10, 2022
 * Write a simple method to raise a number by another number using recursion
 */
public class Q4Power {
    public static double power(double x, int n) {
        //Assumptions made: n is greater than 0
        //This method is limited in the fact that n can only be a natural number, or stack overflow happens
        //Checking for a negative n will significantly increase runtime
        if (n == 1) {
            return x;
        }
        return x * power(x, n - 1);
    }

    public static void main(String[] args) {
        System.out.println(power(2.4, 3));
        System.out.println(power(-10, 5));
    }
}
