/**
 * Wing Li
 * September 19, 2022
 * Ask the user for the dimensions of a 2-d array, initialize all elements of said array to *
 * Then, write it to a file named "star.txt"
 */
import java.util.Scanner;
import java.io.*;

public class Q1StarTable {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        int len, width;
        System.out.println("Input the dimensions of a table");
        len = keyboard.nextInt();
        width = keyboard.nextInt();

        char[][] stars = new char[len][width];

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < width; j++) {
                stars[i][j] = '*';
            }
        }

        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("star.txt"));
            for (int i = 0; i < len; i++) {
                out.write(stars[i]);
                out.newLine();
            }
            out.close();

        } catch (IOException iox) {
            System.out.println("Failed to write");
        }
        keyboard.close();
    }
}
