package Fundamentals;

import java.util.Scanner;

public class poundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1.36
        double pound = Double.parseDouble(scanner.nextLine());
        double dollar = pound * 1.36;
        System.out.printf("%.3f",dollar);
    }
}
