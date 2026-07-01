package DAY_20;

import java.util.Scanner;

public class Problem_80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int row = sc.nextInt();

        System.out.println("Enter number of columns: ");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

        System.out.println("Enter elements of the matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int j = 0; j < col; j++) {
            int sum = 0;

            for (int i = 0; i < row; i++) {
                sum = sum + arr[i][j];
            }

            System.out.println("Sum of column " + (j + 1) + " is: " + sum);
        }
    }
}