package DAY_10;
//Write a program to Print reverse pyramid.
import java.util.Scanner;
public class Problem_38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. of lines of prymid: ");
        int n =sc.nextInt();
        for (int j = 1 ; j<= n ;j++ ){
            for (int i = 1; i<=j-1;i++){
                System.out.print(" "+" ");
            }
            for (int i = 1; i<= (((2*n)-(2*j))+1);i++){
                System.out.print("*"+" ");
            }
            System.out.println(" ");
        }
    }
}
