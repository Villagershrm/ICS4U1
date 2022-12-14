/**
 * Wing Li
 * October 24, 2022
 * Create a fraction object 
 * Important note: Objects are addresses pointing to the actual data, and work similarly to Strings
 * Actually a string is sort of an object
 * 
 * OOA is for longer projects, not contests.
 * 
 * //Order: Fields, constructors, accessors, mutators, then everything else (methods)
 */

public class Fraction {
    //Fields
    //Any function within this class can access these fields
    //I can also add an access control modifier to it such as public or private.
    //Generally, fields are private, and should be modified or accessed using methods.
    private int num;
    private int den;
    private static final int defaultNum = 1;
    private static final int defaultDen = 1;

    //Constructors
    //Constructors are accessed with the keyword "new" before the class name
    //They are also always public, because private constructors are pretty useless
    //i.e. Scanner keyboard = new Scanner(System.in);
    public Fraction(int num, int den) {
        this.num = num;
        setDen(den); //Special treatment for denominators
    }

    public Fraction(Fraction other) {
        this.num = (other.getNum());
        this.den = (other.getDen());
    }

    public Fraction (double d) {
        String text = Double.toString(Math.abs(d));
        int intIndex = text.indexOf('.');
        int factor = (int) Math.pow(10, text.length() - intIndex - 1);

        this.num = (int) (d * factor);
        this.den = factor;

        this.reduce();
    }

    //Default constructor
    //If this was empty, that would be the hidden constructor java will use 
    //if there were no constructors in this code
    public Fraction() {
        num = defaultNum;
        den = defaultDen;
    }

    //Accessors
    public int getNum() {
        return num;
    }

    public int getDen() {
        return den;
    }

    //Mutators
    public void setNum(int num) {
        this.num = num;
    }

    public void setDen(int den) {
        if (den != 0) {
            this.den = den;
        } else {
            this.den = 1;
            System.out.println("You cannot set a denominator to a value of 0!");
        }
    }

    public void setFraction(int num, int den) {
        this.num = num;
        setDen(den);
    }

    //Methods
    //Return the magnitude of this fraction
    public double size () {
        return (Math.abs((double) num / den));
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

    public Fraction larger (Fraction other) {
        if (size() >= other.size()) {
            return this;
        } else {
            return other;
        }
    }

    //Q1
    //Multiply two fractions
    public Fraction times (Fraction other) {
        Fraction product = new Fraction();
        product.num = other.num * num;
        product.den = other.den * den;

        product.reduce();

        return product;
    }

    //Add two fractions
    public Fraction plus (Fraction other) {
        Fraction addFraction = new Fraction();
        addFraction.num = num * other.den + den * other.num;
        addFraction.den = den * other.den;

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

    //Note: This is implicitly called when doing sysout(fraction) or other times where the object
    //      is converted into a string
    public String toString() {
        return (num + "/" + den);
    }

    //Returns true if the ratios of both fractions are the same
    //Not implicitly called
    public Boolean equals(Fraction other) {
        if (other != null && size() == other.size()) {
            return true;
        } else {
            return false;
        }
        
    }

    //Static methods belong to the entire class; they are called without an implicit object
    //AKA "class method"
    public static boolean isValid(Fraction test) {
        if (test.getNum() != 0) {
            return true;
        }
        return false;
    }

    public static Fraction times2 (Fraction x, Fraction y) {
        Fraction product = new Fraction();
        product.num = x.num * y.num;
        product.den = x.den * y.den;

        product.reduce();

        return product;
    }

    public static Fraction abs (Fraction fraction) {
        Fraction absFraction = new Fraction();
        if (fraction.getNum() < 0) {
            absFraction.setNum(fraction.getNum() * -1);
        } else {
            absFraction.setNum(fraction.getNum());
        }

        if (fraction.getDen() < 0) {
            absFraction.setDen(fraction.getDen() * -1);
        } else {
            absFraction.setDen(fraction.getDen());
        }

        return absFraction;
    }

    public static Boolean isPositive(Fraction fraction) {
        boolean positive = true;
        if (fraction.getNum() < 0) {
            positive = !positive;
        }
        if (fraction.getDen() < 0) {
            positive = !positive;
        }

        return positive;
    }
}
