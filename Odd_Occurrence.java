package Fundamentals;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Odd_Occurrence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");

        LinkedHashMap<String, Integer> count = new LinkedHashMap<>();

        for (String word : words) {
            String word_lower = word.toLowerCase();
            if (count.containsKey(word_lower)) {
                count.put(word_lower, count.get(word_lower) + 1);
            } else {
                count.put(word_lower, 1);
            }


        }
        ArrayList<String> odds = new ArrayList<>();
        for (var entry : count.entrySet()) {
            if (entry.getValue() % 2 == 1) {
                odds.add(entry.getKey());
            }

        }
        for (int i = 0; i < odds.size(); i++) {
            System.out.print(odds.get(i));
            if(i < odds.size() -1 ){
                System.out.print(", ");
            }


        }


    }
}

