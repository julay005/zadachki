package Fundamentals;


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneMatcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();
        String reg = "\\+359([ -])2\\1\\d{3}\\1\\d{4}\\b";
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(input);
        List<String> phones = new LinkedList<>();

        while (matcher.find()) {
            String num = matcher.group();
            phones.add(num);

        }
        System.out.println(String.join(", ", phones));
    }
}
