// package labwork7b;

public class Student extends Person {
    private String course;
    private int studentId;

    public Student(String name, String email, String dob, String course, int studentId) {
        super(name, email, dob); // call parent constructor
        this.course = course;
        this.studentId = studentId;
    }

    @Override
    public void displayInfo() {
        System.out.println("\n--- Student Details ---");
        super.displayInfo(); // call Person's displayInfo()
        System.out.println("Course: " + course);
        System.out.println("Student ID: " + studentId);
    }
}
