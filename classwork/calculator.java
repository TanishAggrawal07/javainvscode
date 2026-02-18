import java.util.Scanner; 
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt(); 
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt(); 
        int sum = num1 + num2;
        int multiply = num1*num2; 
        int sub = num1-num2;
        int divide = num1/num2;
        System.out.println("The sum is: " + sum); 
        System.out.println("The multiply is: " +multiply); 
        System.out.println("The sub is: " +sub);
        System.out.println("The divide is: " +divide);
        sc.close(); 
    }
}
