package DAY_14;
//Write a program to Linear search.
import java.util.Scanner;
public class Problem_53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of the array: ");
        for (int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element to search: ");
        int n1  = sc.nextInt();
        int count = 0;
        for (int i =0;i<n;i++){
            if (arr[i]==n1){
                System.out.println("Given elements "+n1+" is found at index "+i);
                count++;
                break;
            }
        }
        if (count==0){
            System.out.println("Given elements "+n1+" is not found in the given array.");
        }
    }
}
