package Fundamentals;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            if (input.contains("Contains")) {
                int numberToCheck = Integer.parseInt(input.split(" ")[1]);
                ContainsNum(numbers, numberToCheck);


            } else if (input.contains("Print even")) {
                PrintEven(numbers);

            } else if (input.contains("Print odd")) {
                PrintOdd(numbers);

            } else if (input.contains("Get sum")) {
                GetSum(numbers);
            } else if (input.contains("Filter")) {
                String[] arr = input.split(" ");
                String symbol = arr[1];
                int numToCompare = Integer.parseInt(arr[2]);
                FilterNum(numbers, symbol, numToCompare);

            }

            input = scanner.nextLine();
        }


    }

    public static void PrintEven(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                System.out.print(numbers.get(i) + " ");
            }
        }
        System.out.println();


    }

    public static void PrintOdd(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 != 0) {
                System.out.print(numbers.get(i) + " ");
            }

        }
        System.out.println();
    }

    public static void ContainsNum(List<Integer> numbers, int numToCheck) {

        if (!numbers.contains(numToCheck)) {
            System.out.println("No such number");
        } else {
            System.out.println("Yes");
        }

    }

    public static void GetSum(List<Integer> numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        System.out.println(sum);
    }

    public static void FilterNum(List<Integer> numbers, String symbol, int numberToCompare) {
        switch (symbol) {

            case "<":

                for (int number : numbers) {
                    if (number < numberToCompare) {
                        System.out.print(number + " ");
                    }
                }
                System.out.println();
                break;
            case ">":

                for (int number : numbers) {
                    if (number > numberToCompare) {
                        System.out.print(number + " ");
                    }
                }
                System.out.println();
                break;
            case ">=":

                for (int number : numbers) {
                    if (number >= numberToCompare) {
                        System.out.print(number + " ");
                    }
                }
                System.out.println();
                break;
            case "<=":

                for (int number : numbers) {
                    if (number <= numberToCompare) {
                        System.out.print(number + " ");
                    }
                }
                System.out.println();
                break;
        }

    }
}




