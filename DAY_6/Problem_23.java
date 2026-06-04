package DAY_6;
//Write a program to Count set bits in a number.
// it means no. of 1 present in binary number.
import java.util.Scanner;
public class Problem_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();
        int ld =0;
        int base = 1;
        int binary = 0;
        while (n > 0 ){
            ld = n%2;
            binary = binary + (base*ld);
            base = base * 10;
            n = n / 2;
        }
        //System.out.println(binary);
        int count = 0;
        int ld2 = 0;
        while(binary>0){
            ld2 = binary%10;
            if (ld2==1){
                count++;
            }
            binary = binary/10;
        }
        System.out.println("Count set bits in given number is "+count);


    }
}
