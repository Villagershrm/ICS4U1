/**
 * Wing Li
 * October 18, 2022
 * Output all permutations of a string
 */
public class Q2StringPermutation {
    public static void permutate(String s) {
        permutate(s, "");
    }

    public static void permutate(String s, String soFar) {
        if (s.length() == 1) {
            System.out.println(s + soFar);
            System.out.println(soFar + s);
            return;
        }
        permutate(s.substring(1), soFar + s.charAt(0));
        permutate(s.substring(0, s.length() - 1), soFar + s.charAt(s.length() - 1));
        //permutate(s.charAt(0) + s.substring(2), soFar + s.charAt(1));

        for (int i = 0; i < s.length(); i++) {
            
        }
    }

    public static void main(String[] args) {
        permutate("abc");
    }
}
