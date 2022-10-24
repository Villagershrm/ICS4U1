/**
 * Wing Li
 * Oct 10, 2022
 * Make a method that squares a number using a scuffed definition of a square
 * square(1) = 1
 * square(N) = square(N - 1) + 2N - 1
 * This definition of a square comes from rearranging (n - 1) ^ 2
 */
public class Q2Square {
    public static int square(int n) {
        if (n == 1) {
            return 1;
        }
        return square(n - 1) + 2 * n - 1;
    }

    public static void main(String[] args) {
        System.out.println(square(6));
        System.out.println(square(100));
    }
}
