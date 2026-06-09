package DAY_9;
//Write a program to Print reverse star pattern.
import java.util.Scanner;
public class Problem_33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. lines of Pattern: ");
        int n = sc.nextInt();
        for (int j = 1;j<=n;j++){
            for (int i = 1;i <= n-j+1;i++){
                System.out.print("*"+" ");
            }
            System.out.println(" ");
        }
    }
}
