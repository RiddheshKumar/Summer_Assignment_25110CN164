package DAY_9;
//Write a program to Print reverse number triangle.
import java.util.Scanner;
public class Problem_34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. of lines of pattern : ");
        int n = sc.nextInt();
        for (int j = 1 ; j<= n;j++){
            for (int i = 1; i<= n-j+1 ; i++){
                System.out.print(i+" ");
            }
            System.out.println(" ");
        }
    }
}
