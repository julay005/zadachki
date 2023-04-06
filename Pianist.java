package Fundamentals;

import java.util.*;

public class Pianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();


        Map<String, String> pieceComposer = new LinkedHashMap<>();
        Map<String, String> pieceKey = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {

            String piece = input.split("\\|")[0];
            String composer = input.split("\\|")[1];
            String key = input.split("\\|")[2];

            pieceComposer.put(piece, composer);
            pieceKey.put(piece,key);
            input = scanner.nextLine();

        }
        while (!input.equals("Stop")) {

            if (input.contains("Add")) {
                String piece = input.split("\\|")[1];
                String composer = input.split("\\|")[2];
                String key = input.split("\\|")[3];

                if (pieceComposer.containsKey(piece)) {
                    System.out.printf("%s is already in the collection!%n", piece);
                } else {
                    pieceComposer.put(piece,composer);
                    pieceKey.put(piece,key);
                    System.out.printf("%s by %s in %s added to the collection!%n", piece, composer, key);
                }

            } else if (input.contains("Remove")) {
                String piece = input.split("\\|")[1];


                if (pieceComposer.containsKey(piece)) {
                    pieceComposer.remove(piece);
                    System.out.printf("Successfully removed %s!%n", piece);
                } else {
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);

                }


            } else if (input.contains("ChangeKey")) {
                String piece = input.split("\\|")[1];
                String key = input.split("\\|")[2];

                if (pieceKey.containsKey(piece)) {
                    pieceKey.put(piece,key);
                    System.out.printf("Changed the key of %s to %s!%n", piece, key);
                } else {
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                }


            }


            input = scanner.nextLine();
        }

        for (Map.Entry<String, String> entry : pieceComposer.entrySet()) {
            System.out.printf("%s -> Composer: %s, Key: %s%n", entry.getKey(), entry.getValue(), pieceKey.get(entry.getKey()));
        }


    }
}






