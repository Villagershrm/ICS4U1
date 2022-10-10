/**
 * Wing Li
 * Oct 10, 2022
 * Write a method to determine if a number is prime
 */
public class Q3PrimeNumber {
    public static boolean isPrime (int n) {
        if (n > 1)
            return isPrime (n, n - 1);
        return false; // 1 is not prime, and 0 is technically not prime either
        //Negatives are also not prime
    }
    
    private static boolean isPrime (int number, int divisor) {
        if (divisor == 1) {
            return true;
        }
        if (number % divisor == 0) {
            return false;
        }
        return isPrime (number, divisor - 1);
    }

    public static void main(String[] args) {
        System.out.println(isPrime(7));
        System.out.println(isPrime(36));
        System.out.println(isPrime(41));
        System.out.println(isPrime(21));
    }
}
