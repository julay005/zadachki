package Fundamentals;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String reg = "%(?<name>[A-Z][a-z]*)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*\\|(?<count>[0-9]+)\\|[^|$%.]*?(?<price>[0-9]+\\.?[0-9]*)\\$";
        Pattern pattern = Pattern.compile(reg);
        double totalIncome = 0;


        while (!input.equals("end of shift")) {
            Matcher matcher = pattern.matcher(input);

            if(matcher.find()){
                String name = matcher.group("name");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));
                double bill = price * count;
                totalIncome +=bill;

                System.out.printf("%s: %s - %.2f%n",name,product,bill);
            }
            input = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f",totalIncome);


    }
}
