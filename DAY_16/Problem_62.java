package DAY_16;

import java.util.Scanner;

public class Problem_62 {
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

        int maxFreq = 0;
        int maxElement = arr[0];

        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > maxFreq) {
                maxFreq = count;
                maxElement = arr[i];
            }
        }

        System.out.println("Maximum frequency element is: " + maxElement);
        System.out.println("Frequency is: " + maxFreq);
    }
}