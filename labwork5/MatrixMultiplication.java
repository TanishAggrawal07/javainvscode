// package labwork5;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] A = new int[3][3];
        int[][] B = new int[3][3];
        int[][] C = new int[3][3];

        System.out.println("Enter elements of first 3x3 matrix (A):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter element A[" + i + "][" + j + "]: ");
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of second 3x3 matrix (B):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter element B[" + i + "][" + j + "]: ");
                B[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                C[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("\nMatrix A:");
        printMatrix(A);
        System.out.println("\nMatrix B:");
        printMatrix(B);
        System.out.println("\nResultant Matrix C (A x B):");
        printMatrix(C);

        sc.close();
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
