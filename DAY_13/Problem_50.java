package DAY_13;
//Write a program to Find sum and average of array.
import java.util.Scanner;
public class Problem_50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of the array: ");
        for (int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0;i<n;i++){
            sum = sum + arr[i];
        }
        System.out.println("Sum of the array is: "+sum);
        System.out.println("Average of the array: "+sum/n);
    }
}
