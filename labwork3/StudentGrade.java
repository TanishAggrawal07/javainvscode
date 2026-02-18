// package labwork3;
import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student grade (0-100): ");
        int grade = sc.nextInt();

        switch (grade / 10) {
            case 10:
                if (grade == 100)
                    System.out.println("Perfect Score");
                else
                    System.out.println("Excellent");
                break;
            case 9:
                System.out.println("Excellent");
                break;
            case 8:
                System.out.println("Good");
                break;
            case 7:
                System.out.println("Above Average");
                break;
            case 6:
                System.out.println("Average");
                break;
            case 5:
                System.out.println("Below Average");
                break;
            case 4: case 3: case 2: case 1: case 0:
                System.out.println("Not Passing");
                break;
            default:
                System.out.println("Invalid Grade");
        }

        sc.close();
    }
}
