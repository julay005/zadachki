package Fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exam03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayList<String> phones = new ArrayList<>(Arrays.asList(input.split(", ")));

        while (!input.equals("End")) {

            String[] command = input.split(" - ");

            switch (command[0]) {
                case "Add":
                    if (!phones.contains(command[1])) {
                        phones.add(command[1]);

                    }
                    break;
                case "Remove":
                    phones.remove(command[1]);
                    break;
                case "Bonus phone":
                    String[] newAndOld = command[1].split(":");
                    if (phones.contains(newAndOld[0]) && !phones.contains(newAndOld[1])) {
                        int indexOfTarget = phones.indexOf(newAndOld[0]);
                        ArrayList<String> backupPhones = new ArrayList<>();

                        for (int i = indexOfTarget + 1; i < phones.size(); i++) {
                            backupPhones.add(phones.get(i));
                            phones.remove(i);
                        }
                        phones.add(newAndOld[1]);
                        phones.addAll(backupPhones);
                    }
                    break;

                case "Last":
                    if (phones.contains(command[1])) {
                        phones.remove(command[1]);
                        phones.add(command[1]);
                    }
                    break;
            }

            input = scanner.nextLine();
        }

        System.out.println(phones.toString().replaceAll("[\\[\\]]", ""));

    }
}
