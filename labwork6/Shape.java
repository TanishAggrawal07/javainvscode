// package labwork6;

import java.util.Scanner;

public class Shape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Shape Calculator ---");
            System.out.println("1. Rectangle");
            System.out.println("2. Circle");
            System.out.println("3. Triangle");
            System.out.println("4. Parallelogram");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Rectangle rect = new Rectangle();
                    rect.getInput(sc);
                    rect.calculateArea();
                    rect.calculatePerimeter();
                    break;
                case 2:
                    Circle cir = new Circle();
                    cir.getInput(sc);
                    cir.calculateArea();
                    cir.calculatePerimeter();
                    break;
                case 3:
                    Triangle tri = new Triangle();
                    tri.getInput(sc);
                    tri.calculateArea();
                    tri.calculatePerimeter();
                    break;
                case 4:
                    Parallelogram para = new Parallelogram();
                    para.getInput(sc);
                    para.calculateArea();
                    para.calculatePerimeter();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 5);

        sc.close();
    }
}