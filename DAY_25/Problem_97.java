package DAY_25;

import java.util.Scanner;

public class Problem_97 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of first array: ");
        int n1 = sc.nextInt();

        int[] arr1 = new int[n1];

        System.out.println("Enter elements of first sorted array: ");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter size of second array: ");
        int n2 = sc.nextInt();

        int[] arr2 = new int[n2];

        System.out.println("Enter elements of second sorted array: ");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] merge = new int[n1 + n2];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                merge[k] = arr1[i];
                i++;
            } else {
                merge[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            merge[k] = arr1[i];
            i++;
            k++;
        }

        while (j < n2) {
            merge[k] = arr2[j];
            j++;
            k++;
        }

        System.out.println("Merged sorted array is: ");
        for (i = 0; i < merge.length; i++) {
            System.out.print(merge[i] + " ");
        }
    }
}