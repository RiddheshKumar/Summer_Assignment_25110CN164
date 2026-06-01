package DAY_5;
//WAP to check Perfect Number.
// perfect no. is sum of its factor.
import java.util.Scanner;
public class Problem_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1;i<n;i++){
            if (n%i==0){
                sum = sum + i;
            }
        }
        if (n == sum){
            System.out.println(n+" is a Perfect Number.");
        }
        else
            System.out.println(n+" is not a Perfect Number.");
    }
}
