package DAY_14;
//Write a program to Find duplicates in array.
import java.util.Scanner;
public class Problem_56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of the array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter elements of the array: ");
        for (int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for (int j = 0;j<n;j++){
            int count = 0;
            for (int i = 0;i<n;i++){
                if (arr[i]==arr[j]){
                    count++;
                }
            }
            if (count>1){
                System.out.println("Element "+arr[j]+" is repeted "+count+" times in the given array.");
            }
        }

    }
}
