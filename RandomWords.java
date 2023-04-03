package Fundamentals;


import java.util.Random;
import java.util.Scanner;

public class RandomWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] Array = input.split(" ");

        Random rnd = new Random();
        for (int i = 0; i < Array.length; i++) {
            int index1 = rnd.nextInt(Array.length);
            int index2 = rnd.nextInt(Array.length);

            String oldWord = Array[index1];
            Array[index1] = Array[index2];
            Array[index2] = oldWord;


        }
        System.out.println(String.join(System.lineSeparator(),Array));

    }
}
