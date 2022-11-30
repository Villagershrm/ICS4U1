import java.io.*;

public class Payroll {
    private Employee[] staffList;

    private static final String FULL_TIME_EMPLOYEE = "full ";
    private static final String PART_TIME_EMPLOYEE = "part ";

    public Payroll(Employee[] staffList) {
        this.staffList = staffList;
    }

    public void listAllEmployee() {
        for (Employee e: staffList) {
            System.out.println(e);
        }
    }

    public void printAllPayStub() {
        for (Employee e: staffList) {
            e.printPayStub();
        }
    }

    public int findEmployee(int employeeNumber) {
        for (int i = 0; i < staffList.length; i++) {
            if (staffList[i].getEmployeeNumber() == employeeNumber) {
                return i;
            }
        }
        return -1;
    }

    public void enterSickDay(double daysAway, int employeeNumber) {
        int employeeIndex = findEmployee(employeeNumber);

        if (employeeIndex == -1) {
            return;
        }

        staffList[employeeIndex].deductSickDay(daysAway);
    }

    public void saveStaffList(String fileName) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, false));

            int employees = staffList.length;

            writer.write(employees);
            writer.newLine();

            for (int i = 0; i < employees; i++) {
                if (staffList[i] instanceof FullTimeStaff) {
                    writer.write(FULL_TIME_EMPLOYEE);
                    
                } else {
                    writer.write(PART_TIME_EMPLOYEE);
                }
                writer.write(staffList[i].basicToString());
                writer.newLine();
            }

            writer.close();
        } catch (IOException iox) {
            System.out.println("Failed to write");
        }
    }

    public void loadStaffList(String fileName) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            Employee[] newStaffList;

            String currentEmployee;
            String[] cei;

            int employees = Integer.parseInt(reader.readLine());
            newStaffList = new Employee[employees];
            String employeeType;
            
            for (int i = 0; i < employees; i++) {
                employeeType = reader.readLine();

                currentEmployee = reader.readLine();

                cei = currentEmployee.split(" ");

                if (employeeType.equals(FULL_TIME_EMPLOYEE)) {
                    newStaffList[i] = new FullTimeStaff(Integer.parseInt(cei[0]), cei[1], cei[2], 
                                        Double.parseDouble(cei[3]), Double.parseDouble(cei[4]));
                } else {
                    newStaffList[i] = new PartTimeStaff(Integer.parseInt(cei[0]), cei[1], cei[2], 
                                        Double.parseDouble(cei[3]), Double.parseDouble(cei[4]), Double.parseDouble(cei[5]));
                }
            }

            reader.close();
        } catch (IOException iox) {
            System.out.println("Failed to read");
        }
    }

    //Returns the average salary of all full time staff
    public double averageSalary() {
        int fullTimeStaffCount = 0;
        double totalSalary = 0;

        for (int i = 0; i < staffList.length; i++) {
            if (staffList[i] instanceof FullTimeStaff) {
                fullTimeStaffCount++;
                totalSalary += staffList[i].pay() * 12;
            }
        }

        return totalSalary / fullTimeStaffCount;
    }

    public double averageHourlyRate() {
        int partTimeStaffCount = 0;
        double totalHourlyRate = 0;

        for (int i = 0; i < staffList.length; i++) {
            if (staffList[i] instanceof PartTimeStaff) {
                partTimeStaffCount++;
                totalHourlyRate += ((PartTimeStaff) staffList[i]).getHourlyRate();
            }
        }

        return totalHourlyRate / partTimeStaffCount;
    }

    public Employee mostAbsentFullTime() {
        Employee mostAbsent = null;

        for (int i = 0; i < staffList.length; i++) {
            if (staffList[i] instanceof FullTimeStaff) {
                if (mostAbsent == null || mostAbsent.compareSickDay(staffList[i]) < 0) {
                    mostAbsent = staffList[i];
                }
            }
        }

        return mostAbsent;
    }

    public Employee mostAbsentPartTime() {
        Employee mostAbsent = null;

        for (int i = 0; i < staffList.length; i++) {
            if (staffList[i] instanceof PartTimeStaff) {
                if (mostAbsent == null || mostAbsent.compareSickDay(staffList[i]) < 0) {
                    mostAbsent = staffList[i];
                }
            }
        }

        return mostAbsent;
    }

    public void yearlySickDayReset() {
        for (int i = 0; i < staffList.length; i++) {
            if (staffList[i] instanceof FullTimeStaff) {
                staffList[i].resetSickDay();
            }
        }
    }

    public void monthlySickDayReset() {
        for (int i = 0; i < staffList.length; i++) {
            if (staffList[i] instanceof PartTimeStaff) {
                staffList[i].resetSickDay();
            }
        }
    }
}
