package Fundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class extractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] path = scanner.nextLine().split("\\\\");

        String name = path[path.length -1];
        String [] extension = name.split("\\.");

        System.out.printf("File name: %s%n",extension[0]);
        System.out.printf("File extension: %s",extension[1]);
    }
}
