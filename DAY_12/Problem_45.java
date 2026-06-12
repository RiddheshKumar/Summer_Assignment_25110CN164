package DAY_12;
//Write a program to Write function for palindrome.
import java.util.Scanner;
public class Problem_45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num: ");
        int n = sc.nextInt();
        Palindrom(n);
    }
    public static void Palindrom(int a) {
        int n = a;
        int ld = 0;
        int rev = 0;
        while (a>0){
            ld =a%10;
            rev = rev *10 + ld;
            a = a/10;
        }
        if (n==rev){
            System.out.println(n+" is a Palindrom Number.");
        }
        else
            System.out.println(n+" is not a Palindrom Number.");
    }
}
