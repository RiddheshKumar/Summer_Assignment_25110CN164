package DAY_16;
//Write a program to Find missing number in array.
import java.util.Scanner;
public class Problem_61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter a series of natural number in which some elements are missing: ");
        for (int i  = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int a = arr[0];
        int b = arr[arr.length-1];
        System.out.println("This array consist of natural Number "+a+" to "+b+" in which some of are missing are:");
        for (int i = 0;i<arr.length;i++){
            if (arr[i] != a){
                System.out.print(a+" ");
                a++;
            }
            a++;
            if (a == arr[arr.length-1]){
                break;
            }
        }
    }
}
