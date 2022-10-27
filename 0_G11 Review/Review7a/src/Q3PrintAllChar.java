/**
 * Wing Li
 * September 19, 2022
 * Reads then prints each character of a text file called allChar.txt
 */
import java.io.*;

public class Q3PrintAllChar {
    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new FileReader("allChar.txt"));

            String line;
            while ((line = in.readLine()) != null) {
                for (int i = 0; i < line.length(); i++) {
                    if (!Character.isWhitespace(line.charAt(i))) {
                        System.out.println(line.charAt(i));
                    }
                }
            }
            in.close();
        } catch (Exception e) {
            System.out.println("Error reading file");
        }
    }
}
