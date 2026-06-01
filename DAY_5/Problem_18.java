package DAY_5;
//WAP to check a Given number is a Strong Number.
//Strong Number are those number whose sum of factorial of its every digit is equal to original Number.
import java.util.Scanner;
public class Problem_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        int m = n;
        int sum = 0;
        while (n>0){
            int ld = n%10;
            n = n/10;
            int pro = 1;
            for (int i = ld;i>=1;i--){
                pro = pro*i;
            }
            sum = sum+pro;
        }
        if (sum == m){
            System.out.println(m+" is a Strong Number.");
        }
        else
            System.out.println(m+" is not a Strong Number.");
    }
}