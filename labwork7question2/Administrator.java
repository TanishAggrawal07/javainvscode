// package labwork7b;

public class Administrator extends Employee {
    private String title;
    private int countOfFaculty;
    private int countOfCourses;

    public Administrator(String name, String email, String dob, int empId, String title, int countFaculty, int countCourses) {
        super(name, email, dob, empId);
        this.title = title;
        this.countOfFaculty = countFaculty;
        this.countOfCourses = countCourses;
    }

    @Override
    public void displayInfo() {
        System.out.println("\n--- Administrator Details ---");
        super.displayInfo();
        System.out.println("Title: " + title);
        System.out.println("Faculty Managed: " + countOfFaculty);
        System.out.println("Courses Administered: " + countOfCourses);
    }
}
