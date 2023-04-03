package Fundamentals;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        printChar(input);

    }

    public static void printChar(String text) {


        if (text.length() % 2 != 0) {
            int currentChar = (text.length() / 2);
            System.out.println(text.charAt(currentChar));

        }  else{
            int firstSymbol = (text.length() / 2  - 1);
            int secondSymbol = text.length() / 2 ;
            System.out.print(text.charAt(firstSymbol));
            System.out.print(text.charAt(secondSymbol));
        }


    }
}
