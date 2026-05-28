package DAY_1;
//WAP to to find FACTORIAL.
import java.util.Scanner;
public class Program_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Positive Integer: ");
        int n = sc.nextInt();
        int product = 1;
        for (int i=n;i>=1;i--){
            product = product * i;
        }
        System.out.println("Factorial of "+n+" is "+product);
    }
}
