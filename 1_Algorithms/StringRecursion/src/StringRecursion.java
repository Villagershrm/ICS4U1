/**
 * Wing Li
 * October 13, 2022
 * Do stuff with strings with recursion
 */

public class StringRecursion {
    //Find the length of a string
    public static int length(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        return length(s.substring(1)) + 1;
    }

    //See if two strings are equal ignore case
    public static boolean equalsIgnoreCase(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false; //Base case: Strings do not have the same length
        }
        if (s1.isEmpty() && s2.isEmpty()) {
            return true; //Base case: Strings are both empty
        }

        if (Character.toLowerCase(s1.charAt(0)) == Character.toLowerCase(s2.charAt(0))) {
            return equalsIgnoreCase(s1.substring(1), s2.substring(1));
        }

        return false; //Base case: Strings do not have the same characters
    }

    //Count how many times a character appears in a string
    public static int countChar(String s, char c) {
        if (s.isEmpty()) {
            return 0; //Base case: String is empty
        }
        if (s.charAt(0) == c) {
            return countChar(s.substring(1), c) + 1;
        }
        return countChar(s.substring(1), c);
    }

    //Bonus: Check if a character is a vowel 
    public static boolean isVowel(Character c) {
        final char[] VOWELS = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for (int i = 0; i < VOWELS.length; i++) {
            if (c == VOWELS[i]) {
                return true;
            }
        }
        return false;
    }

    //Check if two string are the same, ignoring their vowels
    public static boolean equalsIgnoreVowel(String s1, String s2) {
        /* Legacy code: Is not useful for this approach of solving this problem
        if (s1.length() != s2.length()) {
            return false; //Base case: Strings do not have the same length
        }
        */

        //Check if the strings are empty
        if (s2.isEmpty() && s2.isEmpty()) {
            return true; //Base case: Strings are both empty
        }
        
        char c1 = 0;
        if (!s1.isEmpty()) {
            c1 = s1.charAt(0);
        }
        char c2 = 0;
        if (!s2.isEmpty()) {
            c2 = s2.charAt(0);
        }

        //Remove vowels from non-empty strings
        if (isVowel(c1)) {
            return equalsIgnoreVowel(s1.substring(1), s2);
        }
        if (isVowel(c2)) {
            return equalsIgnoreVowel(s1, s2.substring(1));
        }

        //The current first characters of the two arrays are not vowels; compare the characters
        if (c1 == c2) {
            return equalsIgnoreVowel(s1.substring(1), s2.substring(1));
        }

        return false;
    }

    //Move all specified instances of this character to the back of a string
    public static String moveToEnd(String s, char x) {
        if (s.isEmpty()) {
            return "";
        }
        
        if (s.charAt(0) == x) {
            return moveToEnd(s.substring(1), x) + x;
        }

        return s.charAt(0) + moveToEnd(s.substring(1), x);
    }

    //Reverses a string
    public static String reverse(String s) {
        if (s.isEmpty()) {
            return "";
        }

        return reverse(s.substring(1)) + s.charAt(0);
    }

    //Determines if a string is a palindrome
    public static boolean isPalindrome (String s) {
        s = s.trim(); //Trim to include palindromes which have white space in them such as "rat star"
        
        //Base case: String is length 1 or length 0
        if (s.length() <= 1) {
            return true;
        } 
        //Trim punctuation
        if (!Character.isLetter(s.charAt(0))) {
            return isPalindrome(s.substring(1));
        }
        if (!Character.isLetter(s.charAt(s.length() - 1))) {
            return isPalindrome(s.substring(0, s.length() - 1));
        }

        if(s.charAt(0) == s.charAt(s.length() - 1)) {
            //To approach base case, shrink the string size
            return isPalindrome (s.substring(1, s.length() - 1));
        }
        return false;
    }

    //Going above and beyond
    public static boolean isPalindromeIgnoreCase (String s) {
        return isPalindrome(s.toLowerCase());
    }

    //Generate all strings of this length without a wrapper
    //I failed.
    /*
    public static String generateAllString(int n) {
        if (n <= 0) {
            return "\n";
        }
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(generateAllString(n - 1) + c);
        }

        return "";
    }
    */
    
    public static void main(String[] args) throws Exception {
        //System.out.println(length("Hello, World!"));
        //System.out.println(equalsIgnoreCase("Hello, World!", "hello, world!"));
        //System.out.println(countChar("XaaaYaaaZaaaYaaaaY", 'Y' ));
        //System.out.println(equalsIgnoreVowel("kaaaaaaaaangaroo", "kongaroo"));
        //System.out.println(moveToEnd("How are you", 'o'));
        //System.out.println(reverse("Hello, world!")); 
        //System.out.println(isPalindrome("$ra?t! star!!!!"));
        //System.out.println(generateAllString(2));
    }
}
