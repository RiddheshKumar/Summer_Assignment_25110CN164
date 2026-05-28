package DAY_1;
// WAP to calculate sum of first n natural numbers.
import java.util.Scanner;
public class Program_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of natural Number: ");
        int n= sc.nextInt();
        int sum = 0;
        for (int i =1;i<=n;i++){
            sum = sum + i;
        }
        System.out.println("Sum of All Natural Number is "+sum);


    }
}
