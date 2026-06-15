package DAY_14;
//Write a program to Second largest element.
import java.util.Scanner;
public class Problem_55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the Array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter Element of the array: ");
        for (int i = 0 ; i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int max2 = arr[0];
        for (int i = 1;i<n;i++){
            if (arr[i]>max){
                max2 = max;
                max = arr[i];
            }
            else
            {
                if (arr[i]>max2){
                    max2 = arr[i];
                }
            }
        }
        System.out.println("Largest Element of the array is: "+max);
        System.out.println("2nd largest Element of the array is: "+max2);
    }
}
