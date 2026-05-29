package DAY_2;
//Write a program to Find product of digits.
import java.util.Scanner;
public class Problem_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int m = n ;
        int pro = 1;
        while (n!=0){
            int ld = n%10;
            pro = pro *ld;
            n = n/10;
        }
        System.out.println("Product of all the digits of "+m+" is "+pro);

    }
}
