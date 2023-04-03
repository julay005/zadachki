package Fundamentals;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Academy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, ArrayList<Double>> studentsList = new LinkedHashMap<>();
        String studentName = "";

        for (int i = 0; i < n; i++) {
            studentName = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!studentsList.containsKey(studentName)) {
                studentsList.put(studentName, new ArrayList<>());
            }
            studentsList.get(studentName).add(grade);

        }

        for (Map.Entry<String, ArrayList<Double>> entry : studentsList.entrySet()) {
            int size = entry.getValue().size();
            double gradesSum = 0;
            double averageGrade = 0;
            for (int j = 0; j < size; j++) {
                gradesSum += entry.getValue().get(j);
            }
           averageGrade = gradesSum / entry.getValue().size();

            if(averageGrade < 4.50){
                studentsList.entrySet().remove(entry.getKey());

            } else {
                System.out.printf("%s -> %.2f%n",entry.getKey(),    averageGrade);
            }
        }

    }

}
