package Fundamentals;

import java.util.Scanner;

public class ThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = java.lang.Integer.parseInt(scanner.nextLine());
        int secondNUm = java.lang.Integer.parseInt(scanner.nextLine());
        int thirdNum = java.lang.Integer.parseInt(scanner.nextLine());
        System.out.println(printSmallest(firstNum,secondNUm,thirdNum));


    }

    public static int printSmallest(int first, int second, int third) {

        int number =0;

        if (first > second && third>second){
                number=second;
        }
        else if(first<second&& first<third){
            number=first;
        } else {
            number=third;
        }
        return number;

    }
}
