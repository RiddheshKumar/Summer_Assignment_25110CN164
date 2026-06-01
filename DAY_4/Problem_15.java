package DAY_4;
import java.util.Scanner;
public class Program_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();
        int m = n;
        int m1 = m;
        double sum =0;
        int flag = 0;
        while (n>0){
            n = n/10;
            flag++;
        }
        while (m>0) {
            int rem = m % 10;
            sum = sum + Math.pow(rem,flag);
            m  = m/10;

        }
        if (sum==m1){
            System.out.println("Given number is a Armstrong number.");
        }
        else
            System.out.println("Given number is not a Armstrong number.");

    }
}
