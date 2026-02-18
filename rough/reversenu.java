import java.util.Scanner;

public class reversenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int ans = 0;
        while (n > 0) {
            int rem = n % 10;
            n = n/10;
            ans = ans*10 + rem;
        }
        System.out.println(ans);


    }
}

