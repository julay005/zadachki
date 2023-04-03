package Fundamentals;

import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder digitSbd = new StringBuilder();
        StringBuilder letterSbd = new StringBuilder();
        StringBuilder otherSbd = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char text = input.charAt(i);
            if (Character.isDigit(text)) {
                digitSbd.append(text);
            } else if (Character.isLetter(text)) {
                letterSbd.append(text);
            } else {
                otherSbd.append(text);
            }
        }
        System.out.println(digitSbd);
        System.out.println(letterSbd);
        System.out.println(otherSbd);
    }
}
