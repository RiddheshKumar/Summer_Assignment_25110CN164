package DAY_12;
//Write a program to Write function for Fibonacci.
import java.util.Scanner;
public class Problem_47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a No. of term: ");
        int n = sc.nextInt();
        fib(n);
    }

    public static void fib(int a) {
        int a1 = 0;
        int a2 = 1;
        int a3 =0;
        if (a==1){
            System.out.print(a1+" ");
        }
        else if (a==2){
            System.out.print(a1+" ");
            System.out.print(a2+" ");
        }
        else {
            System.out.print(a1+" ");
            System.out.print(a2+" ");
            for (int i =1;i<=a-2;i++){
                a3 = a2+a1;
                a1=a2;
                a2 = a3;
                System.out.print(a3+" ");
            }
        }
    }
}
