/**
 * Wing Li
 * September 19, 2022
 * Reads then outputs each line of a text file called line.txt
 */
import java.io.*;

 public class Q2PrintLines {
    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new FileReader("line.txt"));
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
            in.close();
        } catch (Exception e) {
            System.out.println("Error reading");
        }
    }
}
