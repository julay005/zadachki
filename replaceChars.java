package Fundamentals;

import java.util.Scanner;

public class replaceChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        StringBuilder sbd = new StringBuilder(text);

        for (int i = 0; i < sbd.length() - 1; i++) {
            if (sbd.charAt(i) == sbd.charAt(i + 1)) {
                sbd.deleteCharAt(i + 1);
                i--;
            }
        }
        System.out.println(sbd);


    }
}
