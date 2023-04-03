package Fundamentals;

import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = java.lang.Integer.parseInt(scanner.nextLine());

        int[] Arr = new int[n];
        for (int i = 0; i < n; i++) {
            int number = java.lang.Integer.parseInt(scanner.nextLine());
            Arr[i] = number;

        }
        for (int i = Arr.length -1 ; i >=0 ; i--) {
            System.out.print(Arr[i] + " ");

        }
    }
}
