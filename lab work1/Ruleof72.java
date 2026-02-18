import java.util.Scanner;
public class Ruleof72 {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.print("Enter the annual interest rate (in %): ");
            double interestRate = s.nextDouble();
            double yearsToDouble = 72 / interestRate;
            System.out.printf("It will take approximately %.2f years to double your money.\n", yearsToDouble);
            s.close();
        }
}
