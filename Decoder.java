package Fundamentals;

import java.util.Scanner;

public class Decoder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();
        StringBuilder messageSbd = new StringBuilder(message);
        String input = scanner.nextLine();

        while (!input.equals("Decode")){

            if (input.contains("Move")){
                int countToMove = Integer.parseInt(input.split("\\|")[1]);
                String textToMove = messageSbd.substring(0,countToMove);
                messageSbd.delete(0,countToMove);
                messageSbd.append(textToMove);
            } else if (input.contains("Insert")) {
                int index = Integer.parseInt(input.split("\\|")[1]);
                String toInsert = input.split("\\|")[2];
                messageSbd.insert(index,toInsert);
            } else if (input.contains("ChangeAll")) {
                String forReplace = input.split("\\|")[1];
                String replace = input.split("\\|")[2];
                String currentText = messageSbd.toString();
                currentText = currentText.replace(forReplace,replace);
                messageSbd = new StringBuilder(currentText);

            }
            input = scanner.nextLine();
        }
        System.out.printf("The decrypted message is: %s", messageSbd);


    }
}
