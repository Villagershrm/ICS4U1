public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length; 
    }
    
    public double perimeter() {
        return 2 * (width + length);
    }

    public double area() {
        return width * length;
    }
}
