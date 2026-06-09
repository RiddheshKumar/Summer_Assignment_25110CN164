package DAY_10;
//Write a program to Print star pyramid.
import java.util.Scanner;
public class Problem_37 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. of lines of the Pattern: ");
        int n = sc.nextInt();
        for (int j = 1; j<=n;j++){
            for (int i = 1; i<= n-j;i++){
                System.out.print(" "+" ");
            }
            for (int i = 1;i<=(2*j-1);i++){
                System.out.print("*"+" ");
            }
            System.out.println(" ");
        }
    }
}
