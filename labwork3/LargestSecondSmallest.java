// package labwork3;
import java.util.Scanner;

public class LargestSecondSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd number: ");
        int c = sc.nextInt();
        System.out.print("Enter 4th number: ");
        int d = sc.nextInt();

        int first, second, third, fourth;

        if (a >= b && a >= c && a >= d) {
            first = a;
            if (b >= c && b >= d) {
                second = b;
                if (c >= d) {
                    third = c;
                    fourth = d;
                } else {
                    third = d;
                    fourth = c;
                }
            } else if (c >= b && c >= d) {
                second = c;
                if (b >= d) {
                    third = b;
                    fourth = d;
                } else {
                    third = d;
                    fourth = b;
                }
            } else {
                second = d;
                if (b >= c) {
                    third = b;
                    fourth = c;
                } else {
                    third = c;
                    fourth = b;
                }
            }
        } 
        else if (b >= a && b >= c && b >= d) {
            first = b;
            if (a >= c && a >= d) {
                second = a;
                if (c >= d) {
                    third = c;
                    fourth = d;
                } else {
                    third = d;
                    fourth = c;
                }
            } else if (c >= a && c >= d) {
                second = c;
                if (a >= d) {
                    third = a;
                    fourth = d;
                } else {
                    third = d;
                    fourth = a;
                }
            } else {
                second = d;
                if (a >= c) {
                    third = a;
                    fourth = c;
                } else {
                    third = c;
                    fourth = a;
                }
            }
        } 
        else if (c >= a && c >= b && c >= d) {
            first = c;
            if (a >= b && a >= d) {
                second = a;
                if (b >= d) {
                    third = b;
                    fourth = d;
                } else {
                    third = d;
                    fourth = b;
                }
            } else if (b >= a && b >= d) {
                second = b;
                if (a >= d) {
                    third = a;
                    fourth = d;
                } else {
                    third = d;
                    fourth = a;
                }
            } else {
                second = d;
                if (a >= b) {
                    third = a;
                    fourth = b;
                } else {
                    third = b;
                    fourth = a;
                }
            }
        } 
        else {
            first = d;
            if (a >= b && a >= c) {
                second = a;
                if (b >= c) {
                    third = b;
                    fourth = c;
                } else {
                    third = c;
                    fourth = b;
                }
            } else if (b >= a && b >= c) {
                second = b;
                if (a >= c) {
                    third = a;
                    fourth = c;
                } else {
                    third = c;
                    fourth = a;
                }
            } else {
                second = c;
                if (a >= b) {
                    third = a;
                    fourth = b;
                } else {
                    third = b;
                    fourth = a;
                }
            }
        }

        System.out.println("Largest      : " + first);
        System.out.println("2nd Largest  : " + second);
        System.out.println("3rd Largest  : " + third);
        System.out.println("Smallest     : " + fourth);

        sc.close();
    }
}
