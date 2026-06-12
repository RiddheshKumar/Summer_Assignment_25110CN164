package DAY_7;
//Write a program to Recursive sum of digits.
import java.util.Scanner;
public class Problem_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("SUM of all digits is: "+summ(n));
    }

    public static int summ(int a) {
        if (a<10)
        {
            return a;
        }

        return (a%10)+summ(a/10);
    }
}