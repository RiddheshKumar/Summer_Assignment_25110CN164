package DAY_8;
//Write a program to Print half pyramid pattern.
import java.util.Scanner;
public class Problem_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of Lines of the Primide: ");
        int n = sc.nextInt();
        for (int j = 1 ; j<= n; j++){
            for (int i=1;i<=n-j;i++){
                System.out.print(" "+" ");
            }
            for (int i = 1;i<=j;i++){
                System.out.print("*"+" ");
            }
            System.out.println(" ");
        }
    }
}
