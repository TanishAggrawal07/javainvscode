package labwork4;

import java.util.Scanner;

public class SearchMaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("\n--- MENU ---");
        System.out.println("1. Search a number");
        System.out.println("2. Find Maximum");
        System.out.println("3. Find Minimum");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter number to search: ");
                int search = sc.nextInt();
                int pos = -1;
                for (int i = 0; i < 10; i++) {
                    if (numbers[i] == search) {
                        pos = i;
                        break;
                    }
                }
                if (pos != -1) {
                    System.out.println("Number " + search + " found at position " + (pos + 1));
                } else {
                    System.out.println(" Number " + search + " not found.");
                }
                break;

            case 2:
                int max = numbers[0];
                for (int i = 1; i < 10; i++) {
                    if (numbers[i] > max) {
                        max = numbers[i];
                    }
                }
                System.out.println("Maximum number = " + max);
                break;

            case 3:
                int min = numbers[0];
                for (int i = 1; i < 10; i++) {
                    if (numbers[i] < min) {
                        min = numbers[i];
                    }
                }
                System.out.println("Minimum number = " + min);
                break;

            case 4:
                System.out.println("Exiting program...");
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}