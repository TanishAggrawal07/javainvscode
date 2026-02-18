import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take number of lines from user
        System.out.print("Enter the number of lines for the pyramid: ");
        int n = sc.nextInt();
        // Outer loop for rows
        for (int i = 1; i <= n; i++) {
            // Print spaces for alignment
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");  // two spaces for alignment
            }
            // Print increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // Print decreasing numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            // Move to next line
            System.out.println();
        }
        sc.close();
    }
}+