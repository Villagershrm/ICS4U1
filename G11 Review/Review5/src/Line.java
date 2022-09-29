/**
 * Wing Li
 * September 15, 2022
 * Returns either the slope of a line or its length
 */
public class Line {

    //Takes the coordinates of a line segment as input and returns its length
    public static double length(int x1, int y1, int x2, int y2) {
        return Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
    }

    //Takes the coordinates of a line segment as input and returns its slope
    public static double slope (int x1, int y1, int x2, int y2) {
        return (y2 - y1) / (x2 - x1);
    }

}
