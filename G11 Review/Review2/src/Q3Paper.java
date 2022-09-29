/* Wing Li
 * September 8, 2022
 * A piece of paper has:
 * - Starting area 1 square metre
 * - Starting thickness 0.090 mm
 * Every procedure, the paper is cut in half with the pieces stacked on each other
 * Find the thickness and area of the pile after 40 procedures
 */
public class Q3Paper {
    public static void main(String[] args) {
        final Double STARTING_AREA = 1.0; //square metres
        final Double STARTING_THICKNESS = 0.090; //millimetres
        final Integer PROCEDURES = 40;
        
        double area = STARTING_AREA;
        double thickness = STARTING_THICKNESS;

        for (int i = 0; i < PROCEDURES; i++) {
            area /= 2.0;
            thickness *= 2;
        }

        System.out.println("After " + PROCEDURES + " procedures, the area is " + area + " square metres, and the thickness is " + thickness + " mm.");
    }
}
