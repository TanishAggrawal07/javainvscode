import java.util.Scanner;

public class firstprogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;    
            
            System.out.println("1. Calculate Factorial of a number ‘n’");
            System.out.println("2. Generate the first ‘n’ Prime numbers");
            System.out.println("3. Generate the Fibonacci series up to ‘n' terms");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
            
                System.out.print("Enter n: ");
                int n = sc.nextInt();
                int a = 1;
                for (int i = 1; i <= n; i++) {
                    a *= i;
                }
                System.out.println("Factorial of " + n + " = " + a);

            } else if (choice == 2) {
                
                System.out.print("Enter n: ");
                int n = sc.nextInt();
                int count = 0, num = 2;
                System.out.print("First " + n + " prime numbers: ");
                while (count < n) {
                    boolean isPrime = true;
                    for (int i = 2; i <= num / 2; i++) {
                        if (num % i == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                    if (isPrime) {
                        System.out.print(num + " ");
                        count++;
                    }
                    num++;
                }
                System.out.println();

            } else if (choice == 3) {
                // Fibonacci using DO-WHILE loop
                System.out.print("Enter n: ");
                int n = sc.nextInt();
                int a = 0, b = 1, c, i = 1;
                System.out.print("Fibonacci series up to " + n + " terms: ");
                do {
                    System.out.print(a + " ");
                    c = a + b;
                    a = b;
                    b = c;
                    i++;
                } while (i <= n);
                System.out.println();

            } else if (choice == 4) {
                System.out.println("Exit program");
            } else {
                System.out.println("Invalid choice! Please try again.");
            }

        sc.close();
    }
}
