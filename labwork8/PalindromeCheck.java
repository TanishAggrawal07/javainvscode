import java.util.Scanner;

public class PalindromeCheck {
    public static String reverseString(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--)
            rev += str.charAt(i);
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String original = input.toLowerCase();
        String reversed = reverseString(original);
        if (original.equals(reversed))
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
        sc.close();
    }
}
