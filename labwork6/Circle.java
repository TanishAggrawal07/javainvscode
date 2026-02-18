// package labwork6;

import java.util.Scanner;

public class Circle {
    private double radius;

    public void getInput(Scanner sc) {
        System.out.print("Enter radius: ");
        radius = sc.nextDouble();
    }

    public void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area = " + area);
    }

    public void calculatePerimeter() {
        double peri = 2 * Math.PI * radius;
        System.out.println("Perimeter = " + peri);
    }
}
