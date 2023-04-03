package Fundamentals;

import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String keyWord = scanner.nextLine();
        String text = scanner.nextLine();



        for (int i = 0; i < text.length()  ; i++) {

             text = text.replace(keyWord ,"");

        }
        System.out.println(text);


    }
}
