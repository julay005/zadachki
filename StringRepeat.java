package Fundamentals;

import java.util.Scanner;

public class StringRepeat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");

        StringBuilder sbd = new StringBuilder();

        for (String word : words) {
            int count = word.length();
            sbd.append(word.repeat(count));

        }
        System.out.println(sbd);
    }
}
