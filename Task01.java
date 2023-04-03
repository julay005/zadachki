package Fundamentals;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        String command = scanner.nextLine();
        StringBuilder passSbd = new StringBuilder(password);


        while (!command.equals("Complete")) {
            if (command.contains("Make Upper")) {
                int index = Integer.parseInt(command.split(" ")[2]);
                String letterCase = String.valueOf(passSbd.charAt(index));
                passSbd.deleteCharAt(index);
                passSbd.insert(index, letterCase.toUpperCase());
                System.out.println(passSbd);
            } else if (command.contains("Make Lower")) {
                int index = Integer.parseInt(command.split(" ")[2]);
                String letterCase = String.valueOf(passSbd.charAt(index));
                passSbd.deleteCharAt(index);
                passSbd.insert(index, letterCase.toLowerCase());
                System.out.println(passSbd);

            } else if (command.contains("Insert")) {
                //Insert 3 R
                int index = Integer.parseInt(command.split(" ")[1]);
                String toInsert = command.split(" ")[2];
                if (index >= 0 && index < passSbd.length()) {
                    passSbd.insert(index, toInsert);
                }
                System.out.println(passSbd);
            } else if (command.contains("Replace")) {
                // Replace * 10
                String[] values = command.split(" ");
                char symbol = values[1].charAt(0);
                int replaceSymbol = Integer.parseInt(values[2]);

                for (int i = 0; i < passSbd.length(); i++) {
                    if(symbol == passSbd.charAt(i)){
                        passSbd.setCharAt(i, (char) (symbol + replaceSymbol));
                    }
                }

                System.out.println(passSbd);
            } else if (command.contains("Validation")) {
                int lowerCaseLetters = 0;
                int upperCaseLetters = 0;
                int specialSymbols = 0;
                int digits = 0;

                for (int i = 0; i < passSbd.length(); i++) {
                    if(passSbd.charAt(i) >= 'a' && passSbd.charAt(i) <= 'z'){
                        lowerCaseLetters++;
                    } else if(passSbd.charAt(i) >= 'A' && passSbd.charAt(i) <= 'Z'){
                        upperCaseLetters++;
                    } else if (passSbd.charAt(i) >= '0' && passSbd.charAt(i) <= '9') {
                        digits++;
                    } else if (passSbd.charAt(i) != '_'){
                        specialSymbols++;
                    }
                }

                if(passSbd.length() < 8){
                    System.out.println("Password must be at least 8 characters long!");
                }

                if(lowerCaseLetters == 0){
                    System.out.println("Password must consist at least one lowercase letter!");
                }

                if(upperCaseLetters == 0){
                    System.out.println("Password must consist at least one uppercase letter!");
                }

                if(specialSymbols > 0){
                    System.out.println("Password must consist only of letters, digits and _!");
                }

                if(digits == 0){
                    System.out.println("Password must consist at least one digit!");
                }
            }



            command = scanner.nextLine();
        }

    }
}
