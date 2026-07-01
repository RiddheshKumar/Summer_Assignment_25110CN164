package DAY_19;

import java.util.Scanner;

public class Problem_76 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int row = sc.nextInt();

        System.out.println("Enter number of columns: ");
        int col = sc.nextInt();

        if (row != col) {
            System.out.println("Diagonal sum is possible only for a square matrix.");
            return;
        }

        int[][] arr = new int[row][col];

        System.out.println("Enter elements of the matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix is:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int sum = 0;

        for (int i = 0; i < row; i++) {
            sum = sum + arr[i][i];
        }

        System.out.println("Diagonal sum is: " + sum);
    }
}