public class FractionRunner {
    public static void main(String[] args) throws Exception {
        Fraction fraction = new Fraction(20, -25);
        Fraction fraction2 = new Fraction(1, 2);
        Fraction fraction3;
        Fraction fraction4;
        Fraction fraction5 = new Fraction(-0.98);

        fraction.reduce();
        fraction3 = fraction.plus(fraction2);
        fraction4 = fraction.times(fraction2);

        System.out.println(fraction.getNum() + "/" + fraction.getDen());
        System.out.println(fraction3.getNum() + "/" + fraction3.getDen());
        System.out.println(fraction4.getNum() + "/" + fraction4.getDen());
        System.out.println(fraction5.getNum() + "/" + fraction5.getDen());

    }
}
