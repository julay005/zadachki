package Fundamentals;

import java.util.Scanner;

public class ValidUsername {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] usernames = scanner.nextLine().split(", ");


        for (String user : usernames) {
            if(IsValidUser(user)){
                System.out.println(user);
            }


        }

    }

    public static boolean IsValidUser(String user) {
        if (user.length() < 3 || user.length() > 16) {
            return false;
        }
        for (char symbol:user.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol) && symbol != '-' && symbol != '_'){
                return false;
            }

        }
        return true;

    }
}


