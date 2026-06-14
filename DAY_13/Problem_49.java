package DAY_13;
//Write a program to Input and display array.
import java.util.Scanner;
public class Problem_49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of the Array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter Elements of the array: ");
        for (int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Elements Stored inside the array are: ");
        for (int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
