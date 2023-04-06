package Fundamentals;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        String input = scanner.nextLine();
        StringBuilder passSbd = new StringBuilder();


        while (!input.equals("Done")) {

            if (input.contains("TakeOdd")) {

                for (int i = 1; i < password.length(); i++) {
                    if (i % 2 != 0) {
                        String currentLetter = String.valueOf(password.charAt(i));
                        passSbd.append(currentLetter);
                    }
                }
                System.out.println(passSbd);
            } else if (input.contains("Cut")) {
                int index = Integer.parseInt(input.split(" ")[1]);
                int length = Integer.parseInt(input.split(" ")[2]);

                for (int i = 1; i <=length; i++) {
                    passSbd.delete(index , index + 1);
                }
                System.out.println(passSbd);
                
            } else if (input.contains("Substitute")) {
                String forReplace = input.split(" ")[1];
                String replacement = input.split(" ")[2];

                if (passSbd.toString().contains(forReplace)){
                    String replace = passSbd.toString().replace(forReplace, replacement);
                    passSbd = new StringBuilder(replace);
                    System.out.println(passSbd);
                } else {
                    System.out.println("Nothing to replace!");
                }

            }

            input = scanner.nextLine();
        }
        System.out.println("Your password is: " + passSbd);

    }
}
