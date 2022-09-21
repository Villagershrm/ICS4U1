/**
 * Wing Li
 * Sept 20, 2022
 * Reads from a file called "input.txt" and sums the groups and outputs their sum.
 * Groups are defined by a non-number line of text followed by a series of numbers
 */
import java.io.*;

public class Q2GroupOfNumbers {
    public static void main(String[] args) {
        //Variable declaration
        String groupName = "", input = "";
        double sum = 0;

        try {
            BufferedReader in = new BufferedReader(new FileReader("input.txt"));
            groupName = in.readLine(); //First group name
            
            while (input != null) {
                sum = 0;
                try {                    
                    //Read the numbers
                    while (input != null) {
                        input = in.readLine();
                        if (input != null) {
                            sum += Double.parseDouble(input);
                        }
                    }
                } catch (NumberFormatException nfe) {
                    //Double.parseDouble failed to parse a double
                    System.out.println(groupName);
                    System.out.println("Sum: " + sum);
                    System.out.println();
                    groupName = input;
                } catch (Exception e) {
                    System.out.println("Something that should have happened has happened");
                }
            }
            in.close();
        } catch (IOException iox) {
            System.out.println("Failed to read file");
        } catch (Exception e) {
            System.out.println("Yeah idk what happened");
        }

        //Last group
        System.out.println(groupName);
        System.out.println("Sum: " + sum);
    }
}
