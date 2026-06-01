package DAY_4;
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
        //System.out.print("0 ");
        //System.out.println("1 ");
        //System.out.println("1 ");
        for(i= 1;i<=n-3;i++)
        {
            a = b;
            b= newN;
            newN = a+b;

        }
        while (i == n-3){
            System.out.println(n+"th term of Fibonacci series is "+newN);
        }
    }
}
