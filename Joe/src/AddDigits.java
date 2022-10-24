//Uses recursion to add the digits of a number
public class AddDigits {
    public static int addDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10 + addDigits(n / 10));
    }
    
    public static void main(String[] args) {
        System.out.println(addDigits(12345));
    }
}
