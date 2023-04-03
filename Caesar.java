package Fundamentals;

import java.util.Scanner;

public class Caesar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        StringBuilder encryptedText = new StringBuilder();


            char[] symbols = text.toCharArray();
            for (char symbol : symbols) {

                char newSymbol = (char) (symbol + 3);
                encryptedText.append(newSymbol);
            }
        System.out.println(encryptedText);
    }
}
