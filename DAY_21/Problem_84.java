package DAY_21;

import java.util.Scanner;

public class Problem_84 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        String upper = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }

            upper = upper + ch;
        }

        System.out.println("Uppercase string: " + upper);
    }
}