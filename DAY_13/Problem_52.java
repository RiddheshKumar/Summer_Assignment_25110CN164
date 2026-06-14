package DAY_13;
//Write a program to Count even and odd elements.
import java.util.Scanner;
public class Problem_52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter elements of the array: ");
        for (int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int even = 0;
        int odd = 0;
        for (int i = 0;i<n;i++){
            if (arr[i]%2==0){
                even++;
            }
            else
                odd++;
        }
        System.out.println("No. of even elements in the array is: "+even);
        System.out.println("No. of even element in the array is: "+odd);
    }
}
