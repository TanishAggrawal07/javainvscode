// package labwork7b;

public class Person {
    protected String name;
    protected String email;
    protected String dateOfBirth;

    public Person(String name, String email, String dateOfBirth) {
        this.name = name;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Date of Birth: " + dateOfBirth);
    }
}
