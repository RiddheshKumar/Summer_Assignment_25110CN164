package DAY_6;
//Write a program to Find x^n without pow().
import java.util.Scanner;
public class Problem_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base(X) and power(n): ");
        int X = sc.nextInt();
        int n = sc.nextInt();
        int pro = 1;
        for (int i = 1;i<=n;i++) {
            pro = pro * X;
        }
        System.out.println("x^n is "+pro);
    }
}
