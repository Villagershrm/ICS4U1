public class FractionRunner {
    public static void main(String[] args) throws Exception {
        Fraction fraction1 = new Fraction(20, -25);
        Fraction fraction2 = new Fraction(1, 2);
        Fraction fraction3;
        Fraction fraction4;
        Fraction fraction5 = new Fraction(-0.98);
        Fraction fraction6 = new Fraction(4, -5);

        fraction1.reduce();
        fraction3 = fraction1.plus(fraction2);
        fraction4 = fraction1.times(fraction2);

        System.out.println(fraction1);
        System.out.println(fraction3);
        System.out.println(fraction4);
        System.out.println(fraction5);
        if (fraction1.equals(fraction6)) {
            System.out.println("potato");
        }
    }
}
