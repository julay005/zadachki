package Fundamentals;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = java.lang.Double.parseDouble(scanner.nextLine());
         double length = java.lang.Double.parseDouble(scanner.nextLine());

        double area =  Area(width,length);;
        System.out.printf("%.0f",area);




    }
    private static double Area(double width,double length){

        return width * length;

    }
}
