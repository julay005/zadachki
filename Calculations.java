package Fundamentals;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String commandInput = scanner.nextLine();

        int a = java.lang.Integer.parseInt(scanner.nextLine());
        int b = java.lang.Integer.parseInt(scanner.nextLine());

        switch (commandInput) {
            case "add":
                printAdd(a, b);
                break;
            case "multiply":
                printMultiply(a, b);
                break;
            case "subtract":
                printSubtract(a, b);
                break;
            case "divide":
                printDivide(a,b);
                break;
        }

    }

    private static void printAdd(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    private static void printMultiply(int a, int b) {
        int sum = a * b;
        System.out.println(sum);
    }

    private static void printSubtract(int a, int b) {
        int sum = a - b;
        System.out.println(sum);
    }
    public static void printDivide (int a,int b){
        int sum = a / b;
        System.out.println(sum);
    }


}
