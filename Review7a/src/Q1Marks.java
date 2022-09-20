/**
 * Wing Li
 * September 19, 2022
 * Reads the test results from marks.txt, then prints the following results to results.txt:
 *  Average of the five tests for each student
 *  Student with the highest overall average, then print their student number
 *  Class average of each test and print the result
 * Marks:
 * {{0.2, 0.4, 1, 2, 3}, 
        {10, 10, 10, 10, 10}, 
        {20, 20, 20, 20, 20}, 
        {30, 30, 30, 30, 30},
        {40, 40, 40, 40, 40},
        {50, 50, 50, 50, 50},
        {60, 60, 60, 60, 60},
        {70, 70, 70, 70, 70},
        {80, 80, 80, 80, 80},
        {92, 93, 94, 95, 96}}
 */
import java.io.*;

public class Q1Marks {
    public static void main(String[] args) throws Exception {
        final int STUDENTS = 10;
        final int TESTS = 5;
        double[][] marks = new double[STUDENTS][TESTS];
        String[] temp = new String[TESTS];
        int bestStudent = -1;
        double highestSum = -1;
        double classTotal = 0;
        double currentSum = 0;
        int readCounter = 0;
        String line;

        
        try {
            System.out.println("Flag 1");
            BufferedReader in = new BufferedReader(new FileReader("marks.txt"));
            //BufferedWriter out = new BufferedWriter(new FileWriter("results.txt"));

            System.out.println("Flag 2");
            //Read the marks
            while ((line = in.readLine()) != null) {
                temp = line.split(" ");
                for (int j = 0; j < TESTS; j++) {
                    marks[readCounter][j] = Double.parseDouble(temp[j]);
                    System.out.println(Double.parseDouble(temp[j]));
                }
                readCounter++;
            }
            in.close();
        } catch (Exception e) {
            System.out.println("Problem reading");
        }
        
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("results.txt"));
            //Find the average for each student
            for (int i = 0; i < STUDENTS; i++) {
                currentSum = 0;
                for (int j = 0; j < TESTS; j++) {
                    currentSum += marks[i][j];
                }
                out.write("Student " + (i + 1) + " average: " + (currentSum / (1.0 * TESTS)) + "\n");

                if (currentSum > highestSum) {
                    highestSum = currentSum;
                    bestStudent = i;
                }
            }
            out.newLine();

            //Print the best student
            out.write("Student with highest overall average: " + (bestStudent + 1) + "\n");
            out.newLine();

            //Class average of each test
            for (int i = 0; i < TESTS; i++) {
                classTotal = 0;
                for (int j = 0; j < STUDENTS; j++) {
                    classTotal += marks[j][i];
                }

                out.write("Class average of test " + (i + 1) + ": " + (classTotal / (1.0 * STUDENTS)) + "\n");
            }

            //in.close();
            out.close();
        } catch (Exception e) {
            System.out.println("Problem reading or writing.");
        }
    }
}
