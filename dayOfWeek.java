package Fundamentals;

import java.util.Scanner;

public class dayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = java.lang.Integer.parseInt(scanner.nextLine());

        String[] Arr = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};


        if (day <= 7) System.out.println(Arr[day - 1]);
        else {
            System.out.println("Invalid Day!");
        }

    }

}
