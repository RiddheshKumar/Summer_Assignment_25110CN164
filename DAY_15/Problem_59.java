package DAY_15;
//Write a program to Rotate array right.
import java.util.Scanner;
public class Problem_59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements of the array:");
        for (int i  = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Elements of the array are: ");
        for (int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
        System.out.println("Enter no of rotation of the array: ");
        int k = sc.nextInt();

        rev(arr,0,n-1);

        rev(arr,0,k-1);
        rev(arr,k,n-1);

        for (int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");

    }

    public static void rev(int [] arr, int a,int b) {
        for (int i = a;i<b;i++){
            if (a<b){
                int temp = arr[a];
                arr [a] = arr[b];
                arr [b] = temp;
                a++;
                b--;
            }
        }
    }
}
