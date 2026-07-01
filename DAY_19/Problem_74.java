package DAY_19;

import java.util.Scanner;

public class Problem_74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int row = sc.nextInt();

        System.out.println("Enter number of columns: ");
        int col = sc.nextInt();

        int[][] arr1 = new int[row][col];
        int[][] arr2 = new int[row][col];
        int[][] sub = new int[row][col];

        System.out.println("Enter elements of first matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of second matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sub[i][j] = arr1[i][j] - arr2[i][j];
            }
        }

        System.out.println("Subtraction of matrices is: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(sub[i][j] + " ");
            }
            System.out.println();
        }
    }
}