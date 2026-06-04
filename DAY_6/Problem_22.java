package DAY_6;
//Write a program to Convert binary to decimal.
import java.util.Scanner;
public class Problem_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Binary No. : ");
        int n = sc.nextInt();
        int ld = 0;
        int decimal = 0;
        int base = 1;
        while (n>0){
            ld = n % 10;
            decimal = decimal + (ld*base);
            base = base*2;
            n = n/10;
        }
        System.out.println("Decimal of given binary No. is "+decimal);

    }
}
