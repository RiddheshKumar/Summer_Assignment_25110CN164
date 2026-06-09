package DAY_4;
//Write a program to Find nth Fibonacci term.
import java.util.Scanner;
public class Problem_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter which term of Fibonacci series to print: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int newN = a+b;
        int i;
        if (n == 1){
            System.out.println(n+"th term of Fibonacci series is 0");
        }
        else if (n == 2||n==3){
            System.out.println(n+"th term of Fibonacci series is 1");
        }
        for(i= 1;i<=n-3;i++)
        {
            a = b;
            b= newN;
            newN = a+b;
            if (i == n-3){
                System.out.println(n+"th term of Fibonacci series is "+newN);
            }

        }

    }
}
