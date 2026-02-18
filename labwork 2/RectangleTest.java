import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rect = new Rectangle();

        System.out.print("Enter length of rectangle (in meters): ");
        double length = sc.nextDouble();
        rect.setLength(length);

        System.out.print("Enter width of rectangle (in meters): ");
        double width = sc.nextDouble();
        rect.setWidth(width);

        double area = rect.getArea();
        System.out.printf("Area of Rectangle: %.2f meter square%n", area);

        sc.close();
    }
}
