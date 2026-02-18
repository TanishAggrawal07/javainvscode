import java.util.Scanner;

public class PalindromeWithoutReversal {
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        if (isPalindrome(input))
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
        sc.close();
    }
}
