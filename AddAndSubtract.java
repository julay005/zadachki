package Fundamentals;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = java.lang.Integer.parseInt(scanner.nextLine());
        int second = java.lang.Integer.parseInt(scanner.nextLine());
        int third = java.lang.Integer.parseInt(scanner.nextLine());
         int addedSum = sum(first,second);
        System.out.println( subtract(addedSum,third));




    }
    public static int  sum(int num1,int num2 ){
         int sum = num1 + num2;


        return sum;

    }
    public static int subtract (int sum,int num3){
        int sumFinal = sum -num3;
        return sumFinal;
    }
}
