package DAY_3;
//Write a program to Check whether a number is prime.
import java.util.Scanner;
public class Problem_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int flag = 0;
        for (int i = 2 ; i<n ; i++){
            if (n%i==0){
                flag++;
            }
        }
        if (flag>0){
            System.out.println("This is not a Prime number.");
        }
        else
            System.out.println("This is a Prime number.");
    }
}
