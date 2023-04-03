package Fundamentals;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = java.lang.Integer.parseInt(scanner.nextLine());
        int num2 = java.lang.Integer.parseInt(scanner.nextLine());

        long fact1 = factorialCalc(num1);
        long fact2 = factorialCalc(num2);
       double divided =factDivision(fact1,fact2);
        System.out.printf("%.2f",divided);

    }

    public static long factorialCalc(int number) {
        long fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact *  i;

        }
        return fact;
    }

    public static int factDivision(long fact1, long fact2) {

        long divided = fact1 / fact2;


        return (int) divided;
    }
}
