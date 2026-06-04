package DAY_6;
//Write a program to Find x^n without pow().
import java.util.Scanner;
public class Problem_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base(X) and power(n): ");
        double X = sc.nextDouble();
        double n = sc.nextDouble();
        double num = Math.pow(X,n);
        System.out.println(X+"^"+n+" is "+num);
    }
}
