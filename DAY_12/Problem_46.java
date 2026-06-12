package DAY_12;
//Write a program to Write function for Armstrong.
import java.util.Scanner;
public class Problem_46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();
        Arm(n);
    }

    public static void Arm(int a) {
        int a1 = a;
        int a2 = a1;
        double sum = 0;
        int count = 0;
        while(a>0){
            a = a/10;
            count++;
        }
        while (a1>0){
            int ld = a1%10;
            sum = sum + Math.pow(ld,count);
            a1 = a1/10;
        }
        if (a2==sum){
            System.out.println(a2+" is a Armstrong Number.");
        }
        else
            System.out.println(a2+" is not a Armstrong Number.");
    }
}
