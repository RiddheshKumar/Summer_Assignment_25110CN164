package DAY_24;

import java.util.Scanner;

public class Problem_95 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String str = sc.nextLine();

        String word = "";
        String longest = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                word = word + str.charAt(i);
            } else {
                if (word.length() > longest.length()) {
                    longest = word;
                }
                word = "";
            }
        }

        if (word.length() > longest.length()) {
            longest = word;
        }

        System.out.println("Longest word is: " + longest);
    }
}