package Fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers1 = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).toList();
        List<Integer> numbers2 = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> ResultList = new ArrayList<>();

       int minSize = Math.min(numbers1.size(),numbers2.size());
        for (int i = 0; i < minSize; i++) {
            int firstNum = numbers1.get(i);
            int secondNum = numbers2.get(i);

            ResultList.add(firstNum);
            ResultList.add(secondNum);

        }
            if(numbers1.size() > numbers2.size()){
                ResultList.addAll(numbers1.subList(minSize,numbers1.size()));
            } else {
                ResultList.addAll(numbers2.subList(minSize,numbers2.size()));
            }
        System.out.println(ResultList.toString().replaceAll("[\\[\\],]",""));

        }
    }

