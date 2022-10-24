/**
 * Wing Li
 * October 10, 2022
 * Find the GCD of two natural numbers
 * If m == n, then the gcd is m (or n, either works)
 * If m > n, then the gcd is gcd(n, m - n). Euclid's algorithm. Too big brain for me
 * If m < n, then try again but with the numbers reversed
 */
public class Q1GreatestCommonDivisor {
    public static int gcd (int m, int n) {
        if (m == n) {
            return m; //Base case
        } else if (m < n) {
            return gcd(n, m); //Half-moves towards base case
        }

        return gcd(n, m - n); //Moves towards base case
    }

    public static void main(String[] args) {
        System.out.println(gcd(120, 240));
        System.out.println(gcd(11, 17));
    }
}
