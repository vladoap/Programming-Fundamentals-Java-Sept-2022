package exam;

import java.util.Scanner;

public class CookingMasterclass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        int countStudents = Integer.parseInt(scan.nextLine());
        double priceFlourPackage = Double.parseDouble(scan.nextLine());
        double priceEgg = Double.parseDouble(scan.nextLine());
        double priceApron = Double.parseDouble(scan.nextLine());

        double totalPriceEggs = priceEgg * countStudents * 10;
        int countFreeFlour = countStudents / 5;
        double totalPriceFlour = ((countStudents - countFreeFlour) * priceFlourPackage);
        double studentsApron = Math.ceil(countStudents * 1.20);
        double totalPriceApron = studentsApron * priceApron;

        double totalSum = totalPriceApron + totalPriceFlour + totalPriceEggs;

        if (totalSum <= budget) {
            System.out.printf("Items purchased for %.2f$.", totalSum);
        } else {
            System.out.printf("%.2f$ more needed.", totalSum - budget);
        }

    }
}
