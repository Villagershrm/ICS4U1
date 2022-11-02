/**
 * Wing Li
 * October 30, 2022
 * Create a circle class
 */

public class Circle {
    // Fields
    private int x;
    private int y;
    private int radius;

    // Constructors
    public Circle() {
        x = 0;
        y = 0;
        radius = 1;
    }
    
    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        setRadius(radius);
    }

    public Circle(Circle other) {
        x = other.getX();
        y = other.getY();
        radius = other.getRadius();
    }

    // Accessors
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }

    // Mutators
    public void setX(int x) {
        this.x = x;
    }
    
    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        if (radius < 0) {
            radius *= -1;
        }
        this.radius = radius;
    }

    public void setCoords(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setCircle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        setRadius(radius);
    }

    // Methods
    public double area () {
        return Math.PI * radius * radius;
    }

    public Circle smaller (Circle other) {
        if (other == null || area() <= other.area()) {
            return this;
        }
        return other;
    }

    public double distance (Circle other) {
        return Math.sqrt(Math.pow(x - other.getX(), 2) +  Math.pow(y - other.getY(), 2));
    }

    // Returns true if and only if the implicit circle is fully inside the explicit circle
    public boolean isInside (Circle other) {
        if (other != null && distance(other) + radius < other.getRadius()) {
            return true;
        }
        return false;
    } 

    public boolean equals (Circle other) {
        if (other != null && x == other.getX() && y == other.getY() && radius == other.getRadius()) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "centre: (" + x + ", " + y + ")\tradius: " + radius;
    }
}
