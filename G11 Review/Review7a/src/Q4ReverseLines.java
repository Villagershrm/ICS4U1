/**
 * Wing Li
 * September 19, 2022
 * Reads the amount of the lines in reverse.txt, then reverses them, then outputs them
 */
import java.io.*;

public class Q4ReverseLines {
    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new FileReader("reverse.txt"));
            //Assume the first line is always an integer describing the rest of the file
            int lineN = Integer.parseInt(in.readLine()); 

            //Read the rest of the lines and store them in a String[] array
            String[] lines = new String[lineN];
            for (int i = 0; i < lineN; i++) {
                lines[i] = in.readLine();
            }

            //Print the lines in reversed order
            for (int i = lineN - 1; i >= 0; i--) {
                System.out.println(lines[i]);
            }
            in.close();
        } catch (Exception e) {
            System.out.println("Problem reading file");
        }
    }
}
