/**
 * Wing Li
 * Oct 6, 2022
 * Palindromes are inevitable when you're working with recursion, so I'm doing it early
 */
import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome (String s) {
        s = s.trim(); //Trim to include palindromes which have white space in them such as "rat star"
        
        //Base case: String is length 1 or length 0
        if (s.length() <= 1) {
            return true;
        } else if(s.charAt(0) == s.charAt(s.length() - 1)) { //Actually this "else" is not necessary
            //To approach base case, shrink the string size
            return isPalindrome (s.substring(1, s.length() - 1));
        }
        return false;
    }

    public static boolean isPalindromeIgnoreCase (String s) {
        return isPalindrome (s.toLowerCase());
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = keyboard.nextLine();

        System.out.print("That word is ");
        if (!isPalindrome(word)) {
            System.out.print("not ");
        }
        System.out.println("a palindrome");

        keyboard.close();
    }
}
