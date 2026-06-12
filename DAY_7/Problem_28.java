package DAY_7;
import java.util.Scanner;
public class Problem_28 {
    static int reverse = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        rev(n);
        System.out.println("Reverse of " + n + " is: " + reverse);
    }
    public static void rev(int n) {
        if (n == 0) {
            return;
        }
        reverse = reverse * 10 + (n % 10);
        rev(n / 10);
    }
}