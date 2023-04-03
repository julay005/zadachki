package Fundamentals;

import java.util.Scanner;

public class TownInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        int population = java.lang.Integer.parseInt(scanner.nextLine());
        int km = java.lang.Integer.parseInt(scanner.nextLine());
        System.out.printf("Town %s has population of %d and area %d square km.",city,population,km);
    }
}
