package DAY_2;
//WAP to find SUM of all digits of a number.
import java.util.Scanner;
public class Program_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int count = 0,sum = 0;
        for (int i =n;i>0;i=i/10)
        {
            count = i%10;
            sum = sum + count;
        }
        System.out.println("Sum of all digits of "+n+" is "+sum);
    }

}