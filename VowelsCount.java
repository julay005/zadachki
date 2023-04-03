package Fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        VowelsReturn(word);


    }

    public static void VowelsReturn(String word) {
        int count = 0;

        for (char letter : word.toLowerCase(Locale.ROOT).toCharArray()
        )
            if (letter == 'e' || letter == 'a' || letter == 'o' || letter == 'i' || letter == 'u') {
                count++;
            }
        System.out.println(count);
    }


}

