package DAY_5;
//Write a program to Find largest prime factor.
import java.util.Scanner;
public class Problem_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Natural No: ");
        int n = sc.nextInt();
        int fac = 0;
        int prime = 0;
        for (int i =1; i<=n; i++){
            if (n%i==0){
                fac = i;
            }
            int count = 0;
            for (int j = 2;j<fac;j++) {
                if (fac % j == 0) {
                    count++;
                    break;
                }
            }
            if (count==0){
                prime = fac;
            }

        }
        System.out.println("largest prime factor of given number is "+prime);
    }
}
