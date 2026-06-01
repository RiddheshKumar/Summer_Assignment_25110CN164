package DAY_4;
//WAP to print Fibonacci series.
import java.util.Scanner;
public class Problem_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Fibonacci series.");
        System.out.println("Enter No. of term to print: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int newN = a+b;
        System.out.print("0 ");
        System.out.print("1 ");
        System.out.print("1 ");
        for (int i = 1;i<=n-3;i++){
            a = b;
            b = newN;
            newN = a+ b;
            System.out.print(newN+" ");
        }

    }
}
