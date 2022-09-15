/**
 * Wing Li
 * September 15, 2022
 * Encrypts a string
 * first and last character of each string are exchanged. 
 * Middle characters of each string are shifted to the character two after it in 
 * the ASCII table (works for non-letters as well.)
 * spaces are left alone
 * careful with strings less than 3 characters
 */
import java.util.Scanner;

 public class Q2Encrypt {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        char temp;
        char[] chNewWord;
        String line = keyboard.nextLine();
        String codedWord = "";
        //Assume there is not more than two spaces in a row
        String[] words = line.split(" ");
        String[] newWordList = new String[words.length];

        for (int i = 0; i < words.length; i++) {
            chNewWord = words[i].toCharArray();
            temp = chNewWord[0];
            chNewWord[0] = chNewWord[chNewWord.length - 1];
            chNewWord[chNewWord.length - 1] = temp;
            for (int j = 1; j < chNewWord.length - 1; j++) {
                chNewWord[j] = (char) (((int) chNewWord[j]) + 2);
            }

            newWordList[i] = String.valueOf(chNewWord);
        }

        for (String string : newWordList) {
            codedWord = codedWord.concat(string);
            codedWord = codedWord.concat(" ");
        }

        System.out.println(codedWord.trim());
        keyboard.close();
    }
}
