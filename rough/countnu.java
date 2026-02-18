import java.util.Scanner;

public class countnu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.print("Enter digit to count: ");
        int digit = sc.nextInt();

        int count = 0;
        while (n > 0) {
            int c = n % 10;

            if (c == digit){
                count++;
            }
            n = n/10;
        }
        System.out.println("Count = " + count);


    }
}
