package Fundamentals;

import java.util.Scanner;

public class textFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] banWord = scanner.nextLine().split(", ");
        String text = scanner.nextLine();


        for (String word : banWord) {
            text = text.replace(word, repeatString(word.length()));
        }
        System.out.println(text);

    }

    public static String repeatString(int count) {
        StringBuilder result = new StringBuilder();
        result.append("*".repeat(Math.max(0, count)));
        return result.toString();

    }
}
