package DAY_15;
import java.util.Scanner;
//Write a program to Move zeroes to end.
public class Problem_60 {
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
        int count = 0;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
            if (arr[i] == 0) {
                count++;
            }
        }
        System.out.println(" ");
        int[] arr1 = new int[count];
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                System.out.print(arr[i] + " ");
            }
        }
        for (int i = 1;i<=count;i++){
            System.out.print("0"+" ");
        }
    }
}
