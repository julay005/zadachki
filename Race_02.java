package Fundamentals;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String names = scanner.nextLine();
        List<String> Racers = Arrays.stream(names.split(", ")).collect(Collectors.toList());
        String input = scanner.nextLine();
        Map<String, Integer> racersDistance = new LinkedHashMap<>();
        for (String name : Racers) {
            racersDistance.put(name, 0);
        }

        String nameReg = "[A-Za-z]";
        String kmReg = "[0-9]";
        Pattern namePattern = Pattern.compile(nameReg);
        Pattern kmPattern = Pattern.compile(kmReg);

        while (!input.equals("end of race")) {

            Matcher nameMatcher = namePattern.matcher(input);
            Matcher kmMatcher = kmPattern.matcher(input);
            StringBuilder namesRacers = new StringBuilder();

            while (nameMatcher.find()) {
                namesRacers.append(nameMatcher.group());
            }
            int distance = 0;
            while (kmMatcher.find()) {
                distance += Integer.parseInt(kmMatcher.group());
            }

            String racer = namesRacers.toString();

            if (Racers.contains(racer)) {
                int currentKm = racersDistance.get(racer);
                distance += currentKm;
                racersDistance.put(racer, distance + currentKm);
            }

            input = scanner.nextLine();
        }

        for (int i = 0; i < 3; i++) {
            String racer = Racers.get(i);
            if (i == 0) {
                System.out.printf("1st place: %s%n", racer);
            } else if (i == 1) {
                System.out.printf("2nd place: %s%n", racer);
            } else  {
                System.out.printf("3rd place: %s%n",racer);
            }

        }

    }
}
