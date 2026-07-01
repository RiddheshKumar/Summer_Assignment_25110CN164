package DAY_24;

import java.util.Scanner;

public class Problem_93 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.println("Enter second string: ");
        String str2 = sc.nextLine();

        if (str1.length() != str2.length()) {
            System.out.println("Strings are not rotations.");
            return;
        }

        String str = str1 + str1;

        if (str.contains(str2)) {
            System.out.println("Strings are rotations.");
        } else {
            System.out.println("Strings are not rotations.");
        }
    }
}