package DAY_20;

import java.util.Scanner;

public class Problem_77 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows of first matrix: ");
        int row1 = sc.nextInt();

        System.out.println("Enter number of columns of first matrix: ");
        int col1 = sc.nextInt();

        System.out.println("Enter number of rows of second matrix: ");
        int row2 = sc.nextInt();

        System.out.println("Enter number of columns of second matrix: ");
        int col2 = sc.nextInt();

        if (col1 != row2) {
            System.out.println("Matrix multiplication is not possible.");
            return;
        }

        int[][] arr1 = new int[row1][col1];
        int[][] arr2 = new int[row2][col2];
        int[][] mul = new int[row1][col2];

        System.out.println("Enter elements of first matrix: ");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of second matrix: ");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < col1; k++) {
                    mul[i][j] = mul[i][j] + arr1[i][k] * arr2[k][j];
                }
            }
        }

        System.out.println("Multiplication of matrices is: ");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.print(mul[i][j] + " ");
            }
            System.out.println();
        }
    }
}