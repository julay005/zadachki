package Fundamentals;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        int count = java.lang.Integer.parseInt(scanner.nextLine());

        System.out.println(repeatString(word, count));



    }

    private static String repeatString(String text, int n) {
       String text2 = "";
        for (int i = 0; i < n; i++) {
            text2 += text;





        }
        return text2;


    }

}
