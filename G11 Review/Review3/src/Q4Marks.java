/** Wing Li
 *  September 12, 2022
 *  a. Ask user to enter the number of students and the number of tests
 *  b. Ask user to enter each of the test marks for all students
 *  c. Calculate and output the average of each student
 *  d. Output the student (represented by the index) with the highest average
 *  e. List the students whose average is higher than the class average
 */
import java.util.Scanner;

public class Q4Marks {
    public static void main(String[] args) {
        //Variable declaration
        Scanner keyboard = new Scanner(System.in);
        int students, tests, bestStudent;
        double[] studentsTotal;
        double classAverageTotal, classAverage, bestTotal;
        classAverageTotal = 0;

        //a. Ask user to enter the number of students and the number of tests
        System.out.print("Input the number of students: ");
        students = Integer.parseInt(keyboard.nextLine());
        studentsTotal = new double[students];

        System.out.print("Input the number of tests: ");
        tests = Integer.parseInt(keyboard.nextLine());

        //Set each total to 0
        for (int i = 0; i < students; i++) {
            studentsTotal[i] = 0;
        }

        //b. Ask user to enter each of the test marks for all students
        for (int i = 0; i < tests; i++) {
            System.out.println("Input each of the test marks of test #" + (i + 1));
            for (int j = 0; j < students; j++) {
                System.out.print("Input mark for student #" + (j + 1) + ": ");
                studentsTotal[j] += keyboard.nextDouble();
            }
        }

        //c. Calculate and output the average of each student
        bestTotal = -1;
        bestStudent = -1;
        for (int i = 0; i < students; i++) {
            //Find the student with the highest total
            if (studentsTotal[i] > bestTotal) {
                bestTotal = studentsTotal[i];
                bestStudent = i + 1; //Index + 1
            }
            classAverageTotal += studentsTotal[i] / (1.0 * tests);
            //Output the average of each student
            System.out.println("Average of student #" + (i + 1) + ": " + (studentsTotal[i] / (1.0 * tests)));
        }

        //d. Output the student (represented by the index) with the highest average
        System.out.println("The student with the highest average is student #" + (bestStudent));

        //e. List the students whose average is higher than the class average
        classAverage = classAverageTotal / (students * 1.0);
        System.out.println("Students who have a higher average than the class average: ");
        for (int i = 0; i < students; i++) {
            if (studentsTotal[i] / (1.0 * tests) > classAverage) {
                System.out.println("Student #" + (i + 1));
            }
        }

        keyboard.close();
    }
}
