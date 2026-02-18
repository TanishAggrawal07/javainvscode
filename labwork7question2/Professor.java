// package labwork7b;

public class Professor extends Employee {
    private String department;
    private String[] listOfCourses;
    private int professorId;

    public Professor(String name, String email, String dob, int empId, int profId, String dept, String[] courses) {
        super(name, email, dob, empId);
        this.professorId = profId;
        this.department = dept;
        this.listOfCourses = courses;
    }

    public void displayAllCourses() {
        System.out.println("Courses taught:");
        for (String course : listOfCourses) {
            System.out.println("- " + course);
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("\n--- Professor Details ---");
        super.displayInfo();
        System.out.println("Professor ID: " + professorId);
        System.out.println("Department: " + department);
        displayAllCourses();
    }
}
