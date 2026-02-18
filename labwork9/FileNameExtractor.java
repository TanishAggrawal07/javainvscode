import java.util.Scanner;

public class FileNameExtractor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter full filename: ");
        String fullName = sc.nextLine();
        int dotIndex = fullName.lastIndexOf(".");
        String name = fullName.substring(0, dotIndex);
        String extension = fullName.substring(dotIndex + 1);
        System.out.println("Filename: " + name);
        System.out.println("Extension: " + extension);
        sc.close();
    }
}