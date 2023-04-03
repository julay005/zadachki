package Fundamentals;

import java.util.*;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> heroes = new LinkedHashMap<>();

        String command = scanner.nextLine();

        while (!command.equals("end")) {

            if(command.contains("Enroll")){
                String name = command.split(" ")[1];
                if (!heroes.containsKey(name)){
                    heroes.put(name,new ArrayList<>());
                }
                else {
                    System.out.println(name + "is already enrolled.");
                }



            } else if (command.contains("Learn")) {
                String name = command.split(" ")[1];
                String spell = command.split(" ")[2];

                if(!heroes.containsKey(name)){
                    System.out.println(name +"doesn't exist.");
                } else if (heroes.containsValue(spell)) {
                    System.out.println(name + "has already learnt " + spell);
                } else   {
                    heroes.put(name, Collections.singletonList(spell));
                }



            } else if (command.contains("Unlearn")) {
                String name = command.split(" ")[1];
                String spell = command.split(" ")[2];

                if(!heroes.containsKey(name)){
                    System.out.println(name +"doesn't exist.");
                }
                else if (!heroes.containsValue(spell)) {
                    System.out.println(name + " doesn't know " + spell);
                } else {
                    heroes.remove(name,spell);
                }

            }

            command = scanner.nextLine();
        }
        System.out.println(heroes);



    }
}
