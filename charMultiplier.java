package Fundamentals;

import java.util.Scanner;

public class charMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");

        String firstWord = words[0];
        String secondWord = words[1];

        int MaxLength =  Math.max(firstWord.length(),secondWord.length());
        int minLength = Math.min(firstWord.length(),secondWord.length());
        int sum = 0;



        for (int index = 0; index < minLength; index++) {
            sum += firstWord.charAt(index) * secondWord.charAt(index);

        }

        if(MaxLength == firstWord.length()){
            for (int i = minLength; i < MaxLength; i++) {
                sum += firstWord.charAt(i);
            }
        }else {
            for (int i = minLength; i < secondWord.length(); i++) {
                sum+= secondWord.charAt(i);
            }
        }
        if(MaxLength == minLength){
            System.out.println(sum);
            return;
        }
        System.out.println(sum);


    }
}
