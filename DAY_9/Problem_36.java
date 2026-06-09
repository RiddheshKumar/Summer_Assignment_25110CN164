package DAY_9;
//Write a program to Print hollow square pattern.
import java.util.Scanner;
public class Problem_36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. of Star in Each side of the Square: ");
        int n = sc.nextInt();
        for (int j = 1;j<=n;j++){
            for (int i = 1;i<=n; i++){
                if (j==1||j==n||i==1||i==n)
                    System.out.print("*"+" ");
                else
                    System.out.print(" "+" ");
            }
            System.out.println(" ");
        }
    }
}
