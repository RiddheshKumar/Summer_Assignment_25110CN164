package DAY_1;
//WAP to print multiplication table.
import java.util.Scanner;
public class Program_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Multiplication Table of "+n);
        for (int i = 1;i<=10;i++){
            System.out.println(n+" * "+i+" = "+(i*n));
        }
    }
}
