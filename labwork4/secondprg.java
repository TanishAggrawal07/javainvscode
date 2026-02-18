package labwork4;

import java.util.Scanner;

public class secondprg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Convert Decimal to Binary");
        System.out.println("2. Convert Binary to Decimal");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1: 
                System.out.print("Enter a Decimal number: ");
                int decimal = sc.nextInt();

                String binary = "";
                int num = decimal;

                
                for (; num > 0; num = num / 2) {
                    int remainder = num % 2;
                    binary = remainder + binary;
                }
                if (binary.equals("")) binary = "0"; // if input = 0

                System.out.println("Binary equivalent of " + decimal + " = " + binary);
                break;

            case 2: // Binary → Decimal
                System.out.print("Enter a Binary number: ");
                String binStr = sc.next();

                int dec = 0;
                int power = 0;

                // Process from right to left using for loop
                for (int i = binStr.length() - 1; i >= 0; i--) {
                    char digit = binStr.charAt(i);
                    if (digit == '1') {
                        dec += Math.pow(2, power);
                    } else if (digit != '0') {
                        System.out.println("Invalid binary number!");
                        sc.close();
                        return;
                    }
                    power++;
                }

                System.out.println("Decimal equivalent of " + binStr + " = " + dec);
                break;

            case 3:
                System.out.println("Exiting program... Goodbye!");
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
