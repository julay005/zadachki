package Fundamentals;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            if (input.contains("Add")) {
                String[] arr = input.split(" ");
                int numToAdd = Integer.parseInt(arr[1]);
                numbers.add(numToAdd);

            } else if (input.contains("Remove")) {
                String[] arr = input.split(" ");
                int numToAdd = Integer.parseInt(arr[1]);
                numbers.remove(numToAdd);

            } else if (input.contains("RemoveAt")) {
                String[] arr = input.split(" ");
                int numToAdd = Integer.parseInt(arr[1]);
                numbers.remove(numToAdd);

            } else if (input.contains("Insert")) {
                String[] arr = input.split(" ");
                int index = Integer.parseInt(arr[1]);
                int numToAdd = Integer.parseInt(arr[2]);
                numbers.add(numToAdd,index);


            }

            input = scanner.nextLine();
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }
}
