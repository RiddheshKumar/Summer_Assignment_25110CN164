package DAY_6;
//Write a program to Convert decimal to binary
import java.util.Scanner;
public class Problem_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Decimal Number: ");
        int n = sc.nextInt();
        int base =1;
        int binary = 0;
        int ld = 0;
        while (n>0){
            ld = n%2;
            binary = binary+(ld*base);
            base = base *10;
            n = n / 2;
        }
        System.out.println("Binary of given Decimal No. is "+binary);
    }
}
