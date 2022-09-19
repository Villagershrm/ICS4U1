/**
 * Wing Li
 * September 15, 2022
 * Outputs if the length of two lines are the same
 * Outputs if the slope of two lines is parallel/perpendicular 
 */
import java.util.Scanner;

public class CheckLine {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        int x1L1, x2L1, y1L1, y2L1, x1L2, x2L2, y1L2, y2L2;

        System.out.println("Please enter the two coordinates of line 1:");
        System.out.print("Vertex 1 x-value:\t");
        x1L1 = Integer.parseInt(keyboard.nextLine());
        System.out.print("Vertex 1 y-value:\t");
        y1L1 = Integer.parseInt(keyboard.nextLine());
        System.out.println();

        System.out.print("Vertex 2 x-value:\t");
        x2L1 = Integer.parseInt(keyboard.nextLine());
        System.out.print("Vertex 2 x-value:\t");
        y2L1 = Integer.parseInt(keyboard.nextLine());
        System.out.println();

        System.out.println("Please enter the two coordinates of line 2:");
        System.out.print("Vertex 1 x-value:\t");
        x1L2 = Integer.parseInt(keyboard.nextLine());
        System.out.print("Vertex 1 y-value:\t");
        y1L2 = Integer.parseInt(keyboard.nextLine());
        System.out.println();

        System.out.print("Vertex 2 x-value:\t");
        x2L2 = Integer.parseInt(keyboard.nextLine());
        System.out.print("Vertex 2 x-value:\t");
        y2L2 = Integer.parseInt(keyboard.nextLine());

        double line1L = Line.length(x1L1, y1L1, x2L1, y2L1);
        double line2L = Line.length(x1L2, y1L2, x2L2, y2L2);
        double line1S = Line.slope(x1L1, y1L1, x2L1, y2L1);
        double line2S = Line.slope(x1L2, y1L2, x2L2, y2L2);

        System.out.println("Results:");
        if (line1L == line2L) {
            System.out.println("The two lines have the same length");
        } else {
            System.out.println("The two lines do not have the same length");
        }

        if (line1S == line2S) {
            System.out.println("The two lines are parallel");
        } else if (line1S == -1 * line2S) {
            System.out.println("The two lines are perpendicular");
        }
        keyboard.close();
    }
}
