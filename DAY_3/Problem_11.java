package DAY_3;
//WAP to find GCF.
import java.util.Scanner;
public class Problem_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number a and b (a<b) to find GCF: ");
        int dis = sc.nextInt();
        int did = sc.nextInt();
        int rem = did%dis;
        if (rem == 0){
            System.out.println("GCF of given number is: "+dis);
        }
        else {
            while(rem != 0){
                did = dis;
                dis = rem;
                rem = did % dis;
            }
            System.out.println("GCF of given number is: "+dis);
        }
    }
}
