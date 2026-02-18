import java.util.Scanner;
public class fibo {
    public static void main(String[] args) {
       System.out.print("enter the nu = ");
       Scanner sc = new Scanner(System.in);
       int a =0 , b= 1 , n = sc.nextInt();
       System.out.println("series is ");
       for(int i=1 ; i<=n ; i++){
        System.out.print(a + " ");
        int next = a+b;
        a=b;
        b= next;
       }
}

}
