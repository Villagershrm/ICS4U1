/**
 * Wing Li
 * September 19, 2022
 * Reads a file with numbers and outputs the sum to the standard output.
 */
import java.io.*;

public class Q3AddNumbers {
    public static void main(String[] args) {
        double sum = 0;
        try {
            BufferedReader in = new BufferedReader(new FileReader("numbers.txt"));
            String line;
            while ((line = in.readLine()) != null) {
                sum += Double.parseDouble(line);
            }

            in.close();
            System.out.println(sum);
        } catch (Exception e) {
            System.out.println("Failed to read file");
        }

    }
}
