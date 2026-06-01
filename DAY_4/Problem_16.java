package DAY_4;
import java.util.Scanner;
public class Problem_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Range of number a and b to find Armstrong number between them: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Armstrong number between "+a+"  and "+b+" is: ");
        for (int n = a;n<=b;n++){
            int m = n;
            int m1 = m;
            int flag = 0;
            double sum = 0;
            while (n>0){
                n = n/10;
                flag++;
            }
            while (m>0){
                int rem = m%10;
                sum = sum + Math.pow(rem,flag);
                m = m/10;
            }
            if (m1 == sum){
                System.out.print(m1+" ");
            }

        }
    }
}
