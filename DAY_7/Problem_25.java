package DAY_7;
//Write a program to Recursive factorial.
import java.util.Scanner;
public class Problem_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();
        System.out.println("Factorial of "+n+" is: "+fac(n));
    }

    public static int fac(int a) {
        if (a==0){
            return 1;
        }
        return a * fac(a-1);
    }
}
