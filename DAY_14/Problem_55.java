package DAY_14;
import java.util.Scanner;
public class Problem_55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of the array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter Elements of the array: ");
        for (int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int max_2 = arr[0];

        for (int i = 0;i<n;i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Max element is "+max);
        for (int i = 0;i<n;i++){
            if (arr[i]>max_2 && arr[i]!=max){
                max_2 = arr[i];
            }
        }
        System.out.println("2nd Max element is "+max_2);
    }
}
