package Fundamentals;

import java.util.Scanner;

public class sumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = java.lang.Integer.parseInt(scanner.nextLine());
        double sum = 0;

        for (int i = 1; i <= n ; i++) {
            int num = java.lang.Integer.parseInt(scanner.nextLine());
            sum+= num;

        }
        System.out.println(sum);
    }
}
