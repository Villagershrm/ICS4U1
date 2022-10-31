public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(4, -1, 3);
        Circle c2 = new Circle(3, -2, 5);
        Circle c3 = c1;
        Circle c4 = new Circle(c1);

        System.out.println(c1.area());
        System.out.println(c1.smaller(c2));
        if (c2.isInside(c1)) {
            System.out.println("C2 is entirely within c1");
        } else {
            System.out.println("c2 is not entirely within c1");
        }

        // c1 == c3 is true         -> Same memory address
        // c1 == c4 is false        -> Different memory address
        // c1.equals(c4) is true    -> Same centre and radius
    }
}
