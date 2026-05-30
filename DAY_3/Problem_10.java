package DAY_3;
import java.util.Scanner;
public class Problem_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a range of Number: ");
        System.out.println("Enter 1st number:");
        int n = sc.nextInt();
        System.out.println("Enter 2nd number:");
        int m = sc.nextInt();
        System.out.println("List of Prime Number Between "+n+" to "+m+" are:");
        for (int i = n; i<=m;i++){
            int flag = 0;
            for (int j = 2;j<i;j++){
                if (i%j==0){
                    flag++;
                }
            }
            if(flag==0) {
                System.out.println(i);
            }
        }
    }
}
