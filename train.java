package Fundamentals;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int capacity = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        while (!input.equals("end")) {

            if (input.contains("Add")) {
                int person = Integer.parseInt(input.split(" ")[1]);
                numbers.add(person);
            } else {
                for (int i = 0; i < numbers.size(); i++) {
                    int people = Integer.parseInt(input.split(" ")[0]);
                    if (numbers.get(i) <= capacity) {
                            numbers.set(i,people);

                    }

                }

            }


            input = scanner.nextLine();


        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));

    }
}
