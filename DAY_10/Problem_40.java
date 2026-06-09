package DAY_10;
//Write a program to Print character pyramid.
import java.util.Scanner;
public class Problem_40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of lines of the Pattern: ");
        int n = sc.nextInt();
        for (int j = 1;j<=n;j++){
            for (int i = 1;i<=n-j;i++){
                System.out.print(" "+" ");
            }
            for (int i  = 1; i<=j; i++){
                System.out.print((char)(i+64)+" ");
            }
            for (int i = j-1;i>=1;i--){
                System.out.print((char) (i+64)+" ");
            }
            System.out.println(" ");
        }
    }
}
