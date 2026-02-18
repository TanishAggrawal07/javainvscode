// package labwork6;

import java.util.Scanner;

public class Parallelogram {
    private double base, side, height;

    public void getInput(Scanner sc) {
        System.out.print("Enter base: ");
        base = sc.nextDouble();
        System.out.print("Enter side: ");
        side = sc.nextDouble();
        System.out.print("Enter height: ");
        height = sc.nextDouble();
    }

    public void calculateArea() {
        double area = base * height;
        System.out.println("Area = " + area);
    }

    public void calculatePerimeter() {
        double peri = 2 * (base + side);
        System.out.println("Perimeter = " + peri);
    }
}
