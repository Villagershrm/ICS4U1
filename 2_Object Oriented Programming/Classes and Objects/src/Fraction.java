/**
 * Wing Li
 * October 24, 2022
 * Create a fraction object 
 * Important note: Objects are addresses pointing to the actual data, and work similarly to Strings
 * Actually a string is sort of an object
 */

public class Fraction {
    //Fields
    //Any function within this class can access these fields
    //I can also add an access control modifier to it such as public or private.
    int num;
    int den;

    //Constructor
    public Fraction(int num, int den) {
        this.num = num;
        this.den = den;
    }

    //Default constructor
    //If this was empty, that would be the hidden constructor java uses 
    //if there were no constructors in this code
    public Fraction() {
        num = 1;
        den = 1;
    }

    //Return the magnitude of this fraction
    public double size () {
        return (Math.abs((double)num / den));
    }

    /**
     * @param other - The Fraction that's being compared
     * @return Returns true if the implicit fraction is equal to or larger than the explicit fraction, 
     *         otherwise false
     */
    public boolean isLarger (Fraction other) {
        if (size() >= other.size()) {
            return true;
        } else {
            return false;
        }
    }

    //Q1
    //Multiply two fractions
    public Fraction times (Fraction other) {
        Fraction product = new Fraction();
        product.num = other.num * num;
        product.den = other.den * num;

        product.reduce();

        return product;
    }

    //Add two fractions
    public Fraction plus (Fraction other) {
        Fraction addFraction = new Fraction();
        addFraction.num = num * other.den + den * other.num;
        addFraction.den = num * other.den;

        addFraction.reduce();

        return addFraction;
    }

    //Q3
    //Change current fraction to the product of this fraction and the provided fraction p.
    public void timesEquals(Fraction p) {
        num *= p.num;
        den *= p.den;
    }

    //Reduce a fraction to its simplist form
    public void reduce() {
        boolean isNegative = false;

        //Change fraction to positive and note if the fraction should be negative
        if (num < 0 && den < 0) {
            num *= -1;
            den *= -1;
        } else if (num < 0) {
            isNegative = true;
            num *= -1;
        } else if (den < 0) {
            isNegative = true;
            den *= -1;
        }

        boolean hasReduced = false;
        //Reduce the fraction with both positive numerator and denominator
        for (int i = num; i > 1 && !hasReduced; i--) {
            if (num % i == 0 && den % i == 0) {
                num /= i;
                den /= i;
                hasReduced = true;
            }
        }

        //I prefer to put any and all negatives at the numerator
        if (isNegative) {
            num *= -1;
        }
    }
    public static void main(String[] args) throws Exception {
        Fraction fraction = new Fraction(20, -25);
        fraction.reduce();

        System.out.println(fraction.num + " " + fraction.den);
    }
}
