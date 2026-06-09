package DAY_8;
//Write a program to Print number triangle.
import java.util.Scanner;
public class Problem_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. of lines of the Pattern: ");
        int n = sc.nextInt();
        for (int j = 1;j<=n;j++){
            for (int i =1 ;i<=j;i++){
                System.out.print(i+" ");
            }
            System.out.println(" ");
        }

    }
}
