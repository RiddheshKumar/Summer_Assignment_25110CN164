package DAY_1;
//WAP to count number of digits in it.
import java.util.Scanner;
public class Program_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a natural Number: ");
        int n = sc.nextInt();
        int count=0;
        for (int i =n;i>0;i=i/10){
            count++;
        }
        System.out.println("Number of digits in "+n+" is "+count);
}
}
