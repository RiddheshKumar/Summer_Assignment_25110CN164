package DAY_13;
//Write a program to Find largest and smallest element.
import java.util.Scanner;
public class Problem_51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of the array:");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter elements of the array: ");
        for (int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for (int i = 0;i<n;i++){
            if (arr[i]>max){
                max = arr[i];
            }
            else if (arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Largest element of the array is: "+max);
        System.out.println("Smallest element of the array is: "+min);
    }
}
