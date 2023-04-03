package Fundamentals;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, ArrayList<String>> studentsName = new LinkedHashMap<>();
        String input = scanner.nextLine();



        while (!input.equals("end")) {
            String course = input.split(" : ")[0];
            String student = input.split(" : ")[1];

            if (!studentsName.containsKey(course)) {
                studentsName.put(course,new ArrayList<>());

            }
            studentsName.get(course).add(student);

            input = scanner.nextLine();
        }
        for (Map.Entry<String, ArrayList<String>> entry : studentsName.entrySet()) {

            System.out.printf("%s: %d%n",entry.getKey(),entry.getValue().size());
            entry.getValue().forEach(studentName -> System.out.println("-- " + studentName));

        }

    }
}
