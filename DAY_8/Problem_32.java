package DAY_8;
//Write a program to Print repeated-number.
import java.util.Scanner;
public class Problem_32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. of lines of the Pattern: ");
        int n = sc.nextInt();
        int p =1;
        for (int j = 1;j<=n;j++){
            for (int i = 1;i<=j;i++){
                System.out.print(p+" ");
            }
            p++;
            System.out.println(" ");
        }
    }
}
