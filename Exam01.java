package Fundamentals;

import java.util.Scanner;

public class Exam01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int  budget =Integer.parseInt(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double priceFlour = Double.parseDouble(scanner.next());
        double PriceEgg = Double.parseDouble(scanner.next());
        double PriceApron = Double.parseDouble(scanner.next());

        int eggs = students * 10;
        int flour = students;
        double apron =  Math.ceil(students * 0.2 + students)  ;
        int freePackages = students / 5;


        double sum = (PriceEgg * eggs) + ((flour - freePackages) * priceFlour) + (apron * PriceApron);


            if(sum <= budget){
                System.out.printf("Items purchased for %.2f$.",sum);
            }else {
                System.out.printf("%.2f$ more needed.",(budget - sum) * -1 );
            }
    }
}
