package Fundamentals;

import java.util.Scanner;

public class ContactNames {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        String fName= scanner.nextLine();
        String sName =scanner.nextLine();
         String symbol = scanner.nextLine();
        System.out.println(fName+ symbol +sName);

    }
}
