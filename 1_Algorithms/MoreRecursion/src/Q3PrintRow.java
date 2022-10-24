/**
 * Wing Li
 * Oct 11, 2022
 * Print a row of n asterisks using recursion 
 * Q4: Also print a right isosceles triangle with side length n
 */
public class Q3PrintRow {
    /*
     * How to print a row of n asterisks using recursion
     * If n is less than 1, print nothing and stop
     * If n is not less than 1, then print an asterisk and do this again with n - 1
     */
    public static void printRow (int n) {
        if (n < 1) {
            return;
        }
        System.out.print("*");
        printRow(n - 1);
    }

    /*
     * Print 1 asterisk, then print 2, then keep printing until you reach n
     */
    public static void printTriangle (int n) {
        if (n < 1) {
            return;
        }
        printTriangle(n - 1);
        printRow(n);
        System.out.println();
        //actuallyPrintTriangle(n, 1);
    }

    /*
    public static void actuallyPrintTriangle (int n, int a) {
        printRow(a);
        System.out.println();
        if (a == n)
            return;
        actuallyPrintTriangle (n, a + 1);
    }
    */
    public static void main(String[] args) throws Exception {
        printTriangle(8);
    }
}
