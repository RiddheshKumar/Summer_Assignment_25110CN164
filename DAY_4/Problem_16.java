package DAY_4;
// WAP to print Armstrong Number in Range.
import java.util.Scanner;

public class Problem_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Range of number a and b to find Armstrong number between them: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Armstrong number between " + a + " and " + b + " is: ");

        for (int n = a; n <= b; n++) {

            int m = n;
            int m1 = n;
            int temp = n;      // Temporary variable
            int flag = 0;
            double sum = 0;

            while (temp > 0) {
                temp = temp / 10;
                flag++;
            }

            while (m > 0) {
                int rem = m % 10;
                sum = sum + Math.pow(rem, flag);
                m = m / 10;
            }

            if (sum == m1) {
                System.out.print(m1 + " ");
            }
        }
    }
}