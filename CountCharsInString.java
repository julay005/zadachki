package Fundamentals;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();


        Map<Character, Integer> texts = new LinkedHashMap<>();

        for (char symbol : input.toCharArray()) {
            if (symbol == ' ') {
                continue;
            }
            if (!texts.containsKey(symbol)) {

                texts.put(symbol,1);

            } else {
                int currentCount = texts.get(symbol);
                texts.put(symbol,currentCount + 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : texts.entrySet()) {
            System.out.printf("%c -> %d%n",entry.getKey(),entry.getValue());

        }


    }
}
