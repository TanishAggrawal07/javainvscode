// package labwork5;

import java.util.Scanner;
import java.util.Random;

public class SearchInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(1000);
        }

        System.out.println("Array elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.print("Enter a number (<1000) to search: ");
        int target = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Number " + target + " found at index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Number " + target + " not found in array.");
        }

        sc.close();
    }
}

