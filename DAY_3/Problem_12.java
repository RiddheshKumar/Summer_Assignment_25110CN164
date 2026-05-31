package DAY_3;
import java.util.Scanner;
public class Problem_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter to number to find LCM: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i =1;i<=(a*b);i++){
            if (i%a==0 && i%b==0){
                System.out.println("LCM of given number is "+i);
                break;
            }
        }
    }
}
