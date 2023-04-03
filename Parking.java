package Fundamentals;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Parking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, String> userCars = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String [] command = scanner.nextLine().split("\\s+");
            String firstCommand = command[0];

            if (firstCommand.equals("register")) {
                String name = command[1];
                String plate = command[2];

                if (userCars.containsKey(name)) {
                    System.out.printf("ERROR: already registered with plate number %s%n", plate);
                } else {
                    userCars.put(name,plate);
                    System.out.printf("%s registered %s successfully%n", name, plate);
                }

            } else if (firstCommand.equals("unregister")) {
                String name = command[1];

                if(userCars.containsKey(name)){
                    userCars.remove(name);
                    System.out.printf("%s unregistered successfully%n", name);
                }else{
                    System.out.printf("ERROR: user %s not found%n", name);
                }
            }

        }
        for (Map.Entry<String, String> entry : userCars.entrySet()) {
            System.out.printf("%s => %s%n", entry.getKey(), entry.getValue());

        }

    }
}
