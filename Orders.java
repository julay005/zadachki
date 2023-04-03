package Fundamentals;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Double> priceProducts = new LinkedHashMap<>();
        Map<String, Integer> quantityProducts = new LinkedHashMap<>();

        double totalPrice = 0;


        while ((!input.equals("buy"))) {
            String product = input.split(" ")[0];
            double price = Double.parseDouble(input.split(" ")[1]);
            int quantity = Integer.parseInt(input.split(" ")[2]);

            if (!quantityProducts.containsKey(product)) {

                quantityProducts.put(product, quantity);

            } else {
                int currentQuantity = quantityProducts.get(product);

                quantityProducts.put(product, currentQuantity + quantity);
            }
            priceProducts.put(product, price);
            input = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : quantityProducts.entrySet()) {
            String product = entry.getKey();
            totalPrice = quantityProducts.get(product) * priceProducts.get(product);

            System.out.printf("%s -> %.2f%n", product, totalPrice);

        }

    }

}
