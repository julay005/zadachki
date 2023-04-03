package Fundamentals;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class DemonsBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> namesList = Arrays.stream(scanner.nextLine().split("\\s*,\\s*")).collect(Collectors.toList());
        String regexHealth = "[^0-9+*-/.]";
        Pattern pattern = Pattern.compile(regexHealth);
        String regDamage = "\\+?-?\\d+\\.?\\d*";
        Pattern damagePat = Pattern.compile(regDamage);

        for (String name : namesList) {
            Matcher matcher = pattern.matcher(name);
            int health = 0;
            while (matcher.find()) {
                char symbol = matcher.group().charAt(0);
                health += symbol;
            }
            Matcher damageMat = damagePat.matcher(name);
            double damage = 0;
            while (damageMat.find()) {
                double currentDamage = Double.parseDouble(damageMat.group());
                damage += currentDamage;
            }

            for (Character symbol : name.toCharArray()) {
                if (symbol == '/') {
                    damage /= 2;
                } else if (symbol == '*') {
                    damage *= 2;

                }

            }
            System.out.printf("%s - %d health, %.2f damage%n",name,health,damage);
        }


    }
}
