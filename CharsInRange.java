package Fundamentals;

import java.util.Scanner;

public class CharsInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String second = scanner.nextLine();

        char firstSymbol = first.charAt(0);
        char secondSymbol = second.charAt(0);
        printChars(firstSymbol, secondSymbol);


    }

    public static void printChars(char first, char second) {

        if (first < second) {
            for (char symbol = (char) (first + 1); symbol < second; symbol++) {
                System.out.print(symbol + " ");
            }
            } else{
                for (char symbol = (char) (second + 1); symbol < first; symbol++) {
                    System.out.print(symbol + " ");
                }

            }




    }


}


