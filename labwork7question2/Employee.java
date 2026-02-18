// package labwork7b;

public class Employee extends Person {
    protected int employeeId;

    public Employee(String name, String email, String dob, int employeeId) {
        super(name, email, dob);
        this.employeeId = employeeId;
    }

    @Override
    public void displayInfo() {
        System.out.println("\n--- Employee Details ---");
        super.displayInfo();
        System.out.println("Employee ID: " + employeeId);
    }
}
