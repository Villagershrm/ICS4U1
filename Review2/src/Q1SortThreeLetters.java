/*
Wing Li
September 8, 2022
Sorts three letters and outputs them in alphabetical order
*/
import java.util.Scanner; 

public class Q1SortThreeLetters {
    public static void main(String[] args) throws Exception {
        //Variable declaration
        Scanner keyboard = new Scanner(System.in);
        char char1, char2, char3, charTemp;

        System.out.print("Input a lowercase letter: ");
        char1 = keyboard.next().charAt(0);
        System.out.print("Input a lowercase letter: ");
        char2 = keyboard.next().charAt(0);
        System.out.print("Input a lowercase letter: ");
        char3 = keyboard.next().charAt(0);

        if (!Character.isLowerCase(char1) || !Character.isLowerCase(char2) || !Character.isLowerCase(char3)) {
            System.out.println("Error: invalid input");

        } else {
            char[] letters = new char[3];
            letters[0] = char1;
            letters[1] = char2;
            letters[2] = char3;

            //Simple bubble sort
            do {
                charTemp = 0;
                if (letters[0] > letters[1]) {
                    charTemp = letters[0];
                    letters[0] = letters[1];
                    letters[1] = charTemp;
                }

                if (letters [1] > letters[2]) {
                    charTemp = letters[1];
                    letters[1] = letters[2];
                    letters[2] = charTemp;
                }

            } while (charTemp != 0); 
            
            System.out.println(letters);
        }
        keyboard.close();
    }
}
