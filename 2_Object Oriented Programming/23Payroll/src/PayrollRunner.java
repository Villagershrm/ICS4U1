public class PayrollRunner {
    public static void main(String[] args) throws Exception {
        FullTimeStaff owen = new FullTimeStaff(334790664, "Owen", "Wang", 60000);
        PartTimeStaff jacob = new PartTimeStaff(334546445, "Jacob", "Din", 10, 14);
        Employee[] staffList = {owen, jacob};
        Payroll payroll = new Payroll(staffList);
        payroll.listAllEmployee();
        payroll.saveStaffList("potato");
    }
}
