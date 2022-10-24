/**
 * Wing Li
 * October 24, 2022
 * Create a fraction object 
 */
public class Fraction {
    int num;
    int den;

    //Constructor
    public Fraction(int num, int den) {
        this.num = num;
        this.den = den;
    }

    //Default constructor
    public Fraction() {
        this.num = 1;
        this.den = 1;
    }

    //Q1
    //Multiply two fractions
    public Fraction times (Fraction other) {
        Fraction fraction = new Fraction();
        fraction.num = other.num * this.num;
        fraction.den = other.den * this.num;

        return fraction;
    }

    //Add two fractions
    public Fraction plus (Fraction other) {
        Fraction addFraction = new Fraction();
        addFraction.num = this.num * other.den + this.den * other.num;
        addFraction.den = other.den * this.num;

        return addFraction;
    }

    //Q3
    //Change current fraction to the product of this fraction and the provided fraction p.
    public void timesEquals(Fraction p) {
        this.num *= this.num * p.num;
        this.den *= this.den * p.den;
    }

    //Reduce a fraction to its simplist form
    public void reduce() {
        boolean isNegative = false;
        
        //Change fraction to positive if it's negative / negative
        if (this.num < 0 && this.den < 0) {
            this.num *= -1;
            this.den *= -1;
        } else if (this.num < 0) {
            isNegative = true;
            this.num *= -1;
        } else if (this.den < 0) {
            isNegative = true;
            this.den *= -1;
        }
        
        //Reduce
        for (int i = this.num; i > 1; i--) {
            if (this.num % i == 0 && this.den % i == 0) {
                this.num /= i;
                this.den /= i;
            }
        }

        //I prefer to put any and all negatives at the numberator
        if (isNegative) {
            this.num *= -1;
        }
    }
    public static void main(String[] args) throws Exception {
        Fraction fraction = new Fraction(20, -25);
        fraction.reduce();

        System.out.println(fraction.num + " " + fraction.den);
    }
}
