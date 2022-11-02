public class JackCard {
    private String holderName;
    private double balance;
    private double discountRate;
    private int points;
    private int pin;
    private static double maxBalance = 1000;

    //Constructors
    public JackCard() {
        holderName = "default";
        balance = 0;
        discountRate = 0;
        points = 0;
        pin = 1234;
    }

    public JackCard(String name, double initialBalance, int pin) {
        holderName = name;
        balance = initialBalance;
        this.pin = pin;
        determineDiscount();
        points = 0;
    }

    //Accessors
    public String getName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    public double getDiscount() {
        return discountRate;
    }
    
    public int getPoints() {
        return points;
    }

    public int getPin() {
        return pin;
    }

    public static double getMaxBalance() {
        return maxBalance;
    }

    //Mutators
    public void setName(String name) {
        this.holderName = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public static void setMaxBalance(double newMax) {
        maxBalance = newMax;
    }

    //Methods
    public void determineDiscount() {
        if (balance >= 500) {
            discountRate = 0.05;
        } else if (balance >= 200) {
            discountRate = 0.03;
        } else if (balance >= 100) {
            discountRate = 0.02;
        }
        discountRate = 0;
    }

    public boolean refill(double amount) {
        if (balance + amount > maxBalance) {
            balance = maxBalance;
            determineDiscount();
            return false; //Cannot add full amount to the balance
        } else {
            balance += amount;
            determineDiscount();
            return true;
        }
    }

    public boolean pay (double amount, int pin, Boolean usePoints) {
        //Check if the PIN is correct
        if (this.pin != pin) {
            return false;
        }
        //PIN is correct.
        
        if (!usePoints) {
            if (balance >= (1 - discountRate) * amount) {
                balance -= (1 - discountRate) * amount;
                points += amount / 2; //Add points
                determineDiscount();
                return true;
            }
        } else {
            if (points / 20 >= amount) {
                points -= amount * 20; //Purchases made with points are not discounted
                return true;
            } else if (balance >= (1 - discountRate) * (amount - points / 20)) {
                balance -= (1 - discountRate) * (amount - points / 20);
                points %= 20; //Deduct points
                points += (amount - points / 20) / 2; //Add points
                determineDiscount();
                return true;
            }
        }

        return false; //Insufficient funds
    }

    public JackCard higherBalance(JackCard other) {
        if (other != null && balance >= other.getBalance()) {
            return this;
        }
        return other;
    }

    public JackCard higherPoints(JackCard other) {
        if (other != null && points >= other.getPoints()) {
            return this;
        }
        return other;
    }

    public void combinePoints(JackCard other) {
        if (other != null) {
            points += other.getPoints();

            other.setPoints(0);
        }
    }

    public boolean changePIN(String name, int newPin) {
        if (holderName.equals(name)) {
            pin = newPin;
            return true;
        }
        return false;
    }

    public String toString() {
        String output = "";
        output += "Card Holder: " + holderName + "\n";
        output += "Balance: $" + balance + "\n";
        output += "Discount rate: " + discountRate * 100 + "%\n";
        output += "Points: " + points + "\n";
        output += "PIN: " + pin + "\n"; //Not sure why we also return the PIN but ok
        return output;
    }
}
