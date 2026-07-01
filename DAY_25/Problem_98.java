package DAY_25;

import java.util.Scanner;

public class Problem_98 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.println("Enter second string: ");
        String str2 = sc.nextLine();

        System.out.println("Common characters are: ");

        for (int i = 0; i < str1.length(); i++) {
            boolean found = false;

            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    found = true;
                    break;
                }
            }

            if (found) {
                boolean duplicate = false;

                for (int j = 0; j < i; j++) {
                    if (str1.charAt(i) == str1.charAt(j)) {
                        duplicate = true;
                        break;
                    }
                }

                if (!duplicate) {
                    System.out.print(str1.charAt(i) + " ");
                }
            }
        }
    }
}