package DAY_10;
//Write a program to Print number pyramid.
import java.util.Scanner;
public class Problem_39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. of lines of the pattern: ");
        int n = sc.nextInt();
        for (int j = 1; j<= n ; j++){
            for (int i  = 1;i<= n-j;i++){
                System.out.print(" "+" ");
            }
            for (int i =  1;i<=j;i++){
                System.out.print(i+" ");
            }
            for (int i = j-1;i>=1;i--){
                System.out.print(i+" ");
            }
            System.out.println(" ");
        }
    }
}
