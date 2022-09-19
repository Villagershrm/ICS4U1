/**
 * Wing Li
 * September 19, 2022
 * Reads passage.txt and outputs the number of upper and number of lower case letters
 */
import java.io.*;

public class Q4CountCases {
    public static void main(String[] args) {
        int uppercase = 0, lowercase = 0;
        try {
            BufferedReader in = new BufferedReader(new FileReader("passage.txt"));
            String line;
            while ((line = in.readLine()) != null) {
                for (int i = 0; i < line.length(); i++) {
                    if (Character.isLowerCase(line.charAt(i))) {
                        lowercase++;
                    }
                    if (Character.isUpperCase(line.charAt(i))) {
                        uppercase++;
                    }
                }
            }
            
            in.close();
            System.out.println("Uppercase: " + uppercase);
            System.out.println("Lowercase: " + lowercase);
        } catch (Exception e) {
            System.out.println("Failed to read.");
        }
    }
}
