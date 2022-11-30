public class PartTimeStaff extends Employee {
    private static final double HOURS_IN_A_DAY = 24;

    private double numHoursAssigned;
    private double hourlyRate;
    private double sickDaysTaken;

    public PartTimeStaff (int employeeNumber, String firstName, String lastName, double numHoursAssigned, double hourlyRate) {
        super(employeeNumber, firstName, lastName);
        this.numHoursAssigned = numHoursAssigned;
        this.hourlyRate = hourlyRate;
        sickDaysTaken = 0;
    }

    public PartTimeStaff (int employeeNumber, String firstName, String lastName, double numHoursAssigned, double hourlyRate, double sickDaysTaken) {
        super(employeeNumber, firstName, lastName);
        this.numHoursAssigned = numHoursAssigned;
        this.hourlyRate = hourlyRate;
        this.sickDaysTaken = sickDaysTaken;
    }

    public double pay() {
        return (numHoursAssigned - sickDaysTaken * HOURS_IN_A_DAY) * hourlyRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void deductSickDay(double daysAway) {
        sickDaysTaken += daysAway;
    }

    public void resetSickDay() {
        sickDaysTaken = 0;
    }

    public void printPayStub() {
        System.out.println("This month, the employee # + " + super.getEmployeeNumber() + " earned $" + pay());
    }

    public double getSickDaysTaken() {
        return sickDaysTaken;
    }

    public double compareSickDay(Employee other) {
        return (getSickDaysTaken()) - other.getSickDaysTaken();
    }

    public String toString() {
        return super.toString() + "\nTitle: " + " Part time staff";
    }

    public String basicToString() {
        return super.basicToString() + " " + numHoursAssigned + " " + hourlyRate + " " + sickDaysTaken;
    }
}
