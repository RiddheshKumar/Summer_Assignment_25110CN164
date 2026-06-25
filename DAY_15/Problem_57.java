package DAY_15;
import java.util.Scanner;
//Write a program to Reverse array.
public class Problem_57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Elements.");
        for (int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
        rev(arr);
        System.out.println("Reversed array: ");
        for (int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void rev(int [] arr) {
        int n = arr.length;
        for (int i = 0;i<n/2;i++){
            if (i!=n-i-1){
                int temp = arr[i];
                arr[i] = arr[n-1-i];
                arr[n-1-i] = temp;
            }
        }
    }
}
