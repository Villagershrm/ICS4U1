public class Triangle extends Shape{
    private double s1;
    private double s2;
    private double s3;

    public Triangle(double s1, double s2, double s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    public double perimeter() {
        return s1 + s2 + s3;
    }

    public double area() {
        double sP = perimeter() / 2.0;

        return Math.sqrt(sP * (sP - s1) * (sP - s2) * (sP - s3));
    }
}
