import java.util.Scanner;

public class CSVAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter comma-separated numbers: ");
        String input = sc.nextLine();

        String[] numbers = input.split(",");
        int sum = 0;
        for (String num : numbers) {
            sum += Integer.parseInt(num.trim());
        }

        double average = (double) sum / numbers.length;
        System.out.println("Average: " + average);
        sc.close();
    }
}