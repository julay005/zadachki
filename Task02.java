package Fundamentals;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();


        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            String text = scanner.nextLine();
            String reg = "!(?<command>[A-Za-z]{3,})!:\\[(?<text>[A-Za-z]{8,})\\]";
            Pattern pattern = Pattern.compile(reg);
            Matcher matcher = pattern.matcher(text);

            if(!matcher.find()){
                System.out.println("The message is invalid");
            } else {
                String Match = matcher.group("text");

                for (char symbol: Match.toCharArray()) {
                    int current = symbol;
                    numbers.add(current);
                }
                String command = matcher.group("command");
                System.out.print(command + ":");
                for ( int num: numbers) {
                    System.out.print(" " + num + "");

                }
                System.out.println();

            }
        }

    }
}

