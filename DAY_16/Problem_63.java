package DAY_16;

import java.util.Scanner;

public class Problem_63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Elements of the array are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        System.out.println("Enter the sum: ");
        int sum = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == sum) {
                    System.out.println("Pair is: " + arr[i] + " " + arr[j]);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No pair found.");
        }
    }
}