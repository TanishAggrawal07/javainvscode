// package labwork7b;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== University People Management System ===");

        // ① Create Student
        Student s1 = new Student("Riya", "riya@uni.edu", "12-03-2003", "B.Tech CSE", 101);
        s1.displayInfo();

        // ② Create Professor
        String[] courses = {"OOP in Java", "Data Structures"};
        Professor p1 = new Professor("Dr. Mehta", "mehta@uni.edu", "05-09-1980", 501, 201, "Computer Science", courses);
        p1.displayInfo();

        // ③ Create Administrator
        Administrator a1 = new Administrator("Mr. Sharma", "sharma@uni.edu", "10-01-1975", 601, "Dean of Students", 45, 120);
        a1.displayInfo();
    }
}
