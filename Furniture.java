package Fundamentals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String reg  = ">>(?<name>[A-Za-z]*)<<(?<price>[0-9]+\\.?[0-9]+)!(?<quantity>\\d+)";
        Pattern pattern = Pattern.compile(reg);
        List<String> furniture = new ArrayList<>();
        double totalSum = 0;

        while (!input.equals("Purchase")){
            Matcher matcher = pattern.matcher(input);

            if(matcher.find()){
                String furnitureName = matcher.group("name");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));
                furniture.add(furnitureName);
                totalSum += price * quantity;
            }

            input = scanner.nextLine();

        }
        System.out.println("Bought furniture:");
        for (String name:furniture) {
            System.out.println(name);

        }
        System.out.printf("Total money spend: %.2f",totalSum);

    }
}
