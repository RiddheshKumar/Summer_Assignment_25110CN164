package DAY_7;
//
import java.util.Scanner;
public class Problem_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No of term you want to print fibonacci series: ");
        int n = sc.nextInt();
        if (n==1)
            System.out.println("0");
        else if (n==2) {
            System.out.println("1");
        }
        else
        {
            System.out.println(facb(n-1));
        }
    }


    public static int facb(int a) {
        if (a==1||a==2){
            return 1;
        }
        else{
            return facb(a-1)+facb(a-2);
        }
    }
}