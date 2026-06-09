package DAY_8;
//Write a program to Print character triangle.
import java.util.Scanner;
public class Problem_31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lines of Pattern: ");
        int n = sc.nextInt();
        for (int j =1;j<= n;j++ ){
            char a = 'A';
            for (int i = 1;i<=j;i++){
                System.out.print(a+" ");
                a++;
            }
            System.out.println(" ");
        }
    }
}
