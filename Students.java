package Fundamentals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {

    public static class Student {
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getFirstName() {
            return firstName;
        }

        public String firstName;

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getLastName() {
            return lastName;
        }

        public String lastName;

        public void setAge(String age) {
            this.age = age;
        }

        public String getAge() {
            return age;
        }

        public String age;

        public void setTown(String town) {
            this.town = town;
        }

        public String getTown() {
            return town;
        }

        public String town;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Student> students = new ArrayList<>();

        while (!input.equals("end")) {
            String[] info = input.split(" ");

            String firstName = info[0];
            String lastName = info[1];
            String age = info[2];
            String town = info[3];

            Student student = new Student();

            student.setFirstName(firstName);
            student.setLastName(lastName);
            student.setAge(age);
            student.setTown(town);

            students.add(student);


            input = scanner.nextLine();
        }
        String filterTown = scanner.nextLine();
        for (Student student : students) {
            if (student.getTown().equals(filterTown)) {
                System.out.printf("%s %s is %s years old%n", student.getFirstName(), student.getLastName(), student.getAge());

            }


        }


    }
}
