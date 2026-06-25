package DAY_15;

import java.util.Scanner;

//Write a program to Rotate array left.
public class problem_58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Element of the array are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");

        System.out.println("Enter rotation step of the array: ");
        int k = sc.nextInt();

        rev(arr, 0, n - 1);
//        System.out.println("Reversed array:");
//        for (int p = 0;p<arr.length;p++){
//            System.out.print(arr[p]+" ");
//        }
//        System.out.println(" ");


        rev(arr, 0, n - k - 1);
//        for (int p = 0;p<arr.length;p++){
//            System.out.print(arr[p]+" ");
//        }
//        System.out.println(" ");

        rev(arr, n - k, n - 1);
        System.out.println("LEFT ROTATED ARRAY");
        for (int p = 0; p < arr.length; p++) {
            System.out.print(arr[p] + " ");
        }
        System.out.println(" ");

    }

    public static void rev(int[] arr, int a, int b) {
        for (int i = a; i < b; i++) {
            if (a < b) {
                int tem = arr[a];
                arr[a] = arr[b];
                arr[b] = tem;
                a++;
                b--;
            }
        }
    }
}
