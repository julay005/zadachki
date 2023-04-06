package Fundamentals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Barcode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String reg = "@#*\\w{6,}@#*";
        Pattern pattern = Pattern.compile(reg);



        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String match = matcher.group();

                for (char symbol : match.toCharArray()) {

                    if (Character.isDigit(symbol)) {
                        String code = String.valueOf(symbol);

                    }
                }


            } else {
                System.out.println("Invalid barcode");
            }

        }
    }
}
