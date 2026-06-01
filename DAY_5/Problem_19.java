package DAY_5;
//Write a program to Print factors of a number.
import java.util.Scanner;
public class Problem_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();
        for (int i = 1; i<= n;i++){
            if (n%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
