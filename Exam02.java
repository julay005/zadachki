package Fundamentals;

import java.util.*;
import java.util.stream.Collectors;

public class Exam02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("Finish")) {

            if (input.contains("Add")) {
                String[] arr = input.split(" ");
                int numToAdd = Integer.parseInt(arr[1]);
                numbers.add(numToAdd);
            } else if (input.contains("Remove")) {
                String[] arr = input.split(" ");
                int numToAdd = Integer.parseInt(arr[1]);
                numbers.remove(numbers.indexOf(numToAdd));
            } else if (input.contains("Replace")) {
                String[] arr = input.split(" ");
                int targetNum = Integer.parseInt(arr[1]);
                int replacingNum = Integer.parseInt(arr[2]);
                numbers.set(numbers.indexOf(targetNum), replacingNum);


            } else if (input.contains("Collapse")) {
                String[] arr = input.split(" ");
                int num = Integer.parseInt(arr[1]);

                for(int i = 0; i < numbers.size(); i++){
                    if(num > numbers.get(i)){
                        numbers.remove(i);
                    }
                }
            }

            input = scanner.nextLine();
        }

        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));

    }
}


