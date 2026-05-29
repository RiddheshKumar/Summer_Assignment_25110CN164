package DAY_2;
//Write a program to Reverse a number.
import java.util.Scanner;
public class Problem_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();
        int m = n;
        int ld = 0,rev = 0;
        while (n!=0){
            ld = n%10;
            rev = rev*10+ld;
            n= n/10;
        }
        System.out.println("Reverse of "+m+" is "+rev);

    }
}
