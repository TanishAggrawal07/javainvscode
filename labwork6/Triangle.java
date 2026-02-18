// package labwork6;

import java.util.Scanner;

public class Triangle {
    private double a, b, c;

    public void getInput(Scanner sc) {
        System.out.print("Enter side a: ");
        a = sc.nextDouble();
        System.out.print("Enter side b: ");
        b = sc.nextDouble();
        System.out.print("Enter side c: ");
        c = sc.nextDouble();
    }

    public void calculateArea() {
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Area = " + area);
    }

    public void calculatePerimeter() {
        double peri = a + b + c;
        System.out.println("Perimeter = " + peri);
    }
}
