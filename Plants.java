package Fundamentals;

import java.util.*;

public class Plants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> plantsRarity = new LinkedHashMap<>();
        Map<String, List<Integer>> plantsRating = new LinkedHashMap<>();


        int n = Integer.parseInt(scanner.nextLine());
        String info = scanner.nextLine();

        for (int i = 1; i <= n; i++) {

            String plantName = info.split("<->")[0];

            int rarity = Integer.parseInt(info.split("<->")[1]);
            plantsRarity.put(plantName, rarity);
            plantsRating.put(plantName, new ArrayList<>());
            info = scanner.nextLine();
        }
        while (!info.equals("Exhibition")) {

            if (info.contains("Rate:")) {
                //Rate: Woodii - 10
                String name = info.split(" ")[1];
                int rating = Integer.parseInt(info.split(" - ")[1]);
                if (plantsRating.containsKey(name)) {
                    plantsRating.get(name).add(rating);

                } else {
                    System.out.println("error");
                }


            } else if (info.contains("Update:")) {
                String name = info.split(" ")[1];
                int rarity = Integer.parseInt(info.split(" - ")[1]);

                if (plantsRarity.containsKey(name)) {
                    plantsRarity.put(name, rarity);
                } else {
                    System.out.println("error");
                }


            } else if (info.contains("Reset:")) {
                String name = info.split(" ")[1];

                if (plantsRating.containsKey(name)) {
                    plantsRating.put(name, new ArrayList<>());
                } else {
                    System.out.println("error");
                }


            }
            info = scanner.nextLine();

        }

        double AllRatings = 0;
        double Rating = 0;

        System.out.println("Plants for the exhibition:");
        for (Map.Entry<String, List<Integer>> entry : plantsRating.entrySet()) {
            for (int i = 0; i < entry.getValue().size(); i++) {
                double currentRating = entry.getValue().get(i);
                AllRatings += currentRating;
            }
            if (AllRatings > 0) {
                Rating = AllRatings / entry.getValue().size();
            } else {
                Rating = 0;
            }

            System.out.printf(" - %s; Rarity: %d; Rating: %.2f %n", entry.getKey(), plantsRarity.get(entry.getKey()), Rating);
            AllRatings = 0;
        }

    }
}





