package Fundamentals;

import java.util.Scanner;

public class metersToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         double meters = Double.parseDouble(scanner.nextLine());
         double km = (meters /1000);
          Math.ceil(km);


        System.out.printf("%.2f",km);



    }
}
