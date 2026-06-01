package DAY_5;
//Write a program to Find C.
import java.util.Scanner;
public class Problem_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();
        int ab = 0;
        int flag = 0;
        for (int i = 1;i<=n;i++){
            if (n%i==0){
                int fac = i;
            }
            for (int j = 2;j<i;j++){
                if (i%j==0){
                    flag++;
                }
                if (flag==0){
                    ab = i;
                }
            }
        }
        System.out.println("Largest prime factor is "+ab);
    }
}
