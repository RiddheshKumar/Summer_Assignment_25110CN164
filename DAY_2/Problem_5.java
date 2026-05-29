package DAY_2;
//Write a program to Find sum of digits of a number.
import java.util.Scanner;
public class Problem_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();
        int m = n;
        int sum = 0;
        while (n!=0){
            int ld = n%10;
            sum =sum + ld;
            n = n/10;
        }
        System.out.println("Sum of all the digits of "+m+" is "+sum);
    }
}