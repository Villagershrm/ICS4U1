public class FullTimeStaff extends Employee{
    private static final double YEARLYSICKDAY = 20;

    private double yearlySalary;
    private double sickDaysLeft;

    public FullTimeStaff(int employeeNumber, String firstName, String lastName, double yearlySalary) {
        super(employeeNumber, firstName, lastName);
        this.yearlySalary = yearlySalary;
        sickDaysLeft = YEARLYSICKDAY;
    }

    public FullTimeStaff(int employeeNumber, String firstName, String lastName, double yearlySalary, double sickDaysLeft) {
        super(employeeNumber, firstName, lastName);
        this.yearlySalary = yearlySalary;
        this.sickDaysLeft = sickDaysLeft;
    }

    public double getSickDaysTaken() {
        return YEARLYSICKDAY - sickDaysLeft;
    }

    public double getYearlySalary() {
        return yearlySalary;
    }

    //Returns the amount of money earned monthly based on the yearly salary
    public double pay() {
        return yearlySalary / 12;
    }

    public void deductSickDay(double daysAway) {
        sickDaysLeft -= daysAway;
        if (sickDaysLeft <= 0) {
            System.out.println("Warning: No sick days left!");
        }
    }

    public void resetSickDay() {
        sickDaysLeft = YEARLYSICKDAY;
    }

    public void printPayStub() {
        System.out.println("This month, the employee # + " + super.getEmployeeNumber() + " earned $" + pay());
    }

    //Returns negative if the other employee has taken more sick days than this one
    public double compareSickDay(Employee other) {
        return (getSickDaysTaken()) - other.getSickDaysTaken();
    }

    public String toString() {
        return super.toString() + "\nTitle: " + " Full time staff";
    }

    public String basicToString() {
        return super.basicToString() + " " + yearlySalary + " " + sickDaysLeft;
    }
}
