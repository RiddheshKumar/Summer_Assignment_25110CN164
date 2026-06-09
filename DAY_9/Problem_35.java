package DAY_9;
//Write a program to Print repeated character pattern.
import java.util.Scanner;
public class Problem_35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No.of lines of Pattern : ");
        int n = sc.nextInt();
        char a = 'A';
        for (int j = 1;j<=n;j++){
            for (int i = 1; i<= j;i++){
                System.out.print(a+" ");
            }
            a++;
            System.out.println(" ");
        }
    }
}
