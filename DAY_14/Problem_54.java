package DAY_14;
//Write a program to Frequency of an element.
import java.util.Scanner;
public class Problem_54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of the array: ");
        for (int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Element to find its frequency: ");
        int n1 = sc.nextInt();
        int count = 0;
        for (int i = 0;i<n;i++){
            if (arr[i]==n1){
                count++;
            }
        }
        if (count==0){
            System.out.println("Given element "+n1+" is not present in the given array.");
        }
        else
        {
            System.out.println("Given element "+n1+" have "+count+" frequency in the given array.");
        }
    }
}
