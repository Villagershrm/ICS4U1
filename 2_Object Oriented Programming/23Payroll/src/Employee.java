public abstract class Employee {
    private int employeeNumber;
    private String firstName;
    private String lastName;

    public Employee(int employeeNumber, String firstName, String lastName) {
        this.employeeNumber = employeeNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    protected int getEmployeeNumber() {
        return employeeNumber;
    }

    public abstract double pay();

    public abstract void deductSickDay(double daysAway);

    public abstract void resetSickDay();

    public abstract void printPayStub();

    public abstract double getSickDaysTaken();

    public abstract double compareSickDay(Employee other);

    public String toString() {
        return "Employee Number: " + employeeNumber + "\nName: " + lastName + ", " + firstName;
    }

    public String basicToString() {
        return employeeNumber + " " + lastName + " " + firstName;
    }
}
