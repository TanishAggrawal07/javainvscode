// package labwork6;

import java.util.Scanner;

public class Rectangle {
    private double length, width;

    public void getInput(Scanner sc) {
        System.out.print("Enter length: ");
        length = sc.nextDouble();
        System.out.print("Enter width: ");
        width = sc.nextDouble();
    }

    public void calculateArea() {
        double area = length * width;
        System.out.println("Area = " + area);
    }

    public void calculatePerimeter() {
        double peri = 2 * (length + width);
        System.out.println("Perimeter = " + peri);
    }
}
