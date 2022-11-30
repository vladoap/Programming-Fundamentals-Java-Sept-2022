package OldExams;

import java.util.Scanner;

public class P08GuineaPig {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double quantityFood = Double.parseDouble(scan.nextLine());
        double quantityHay = Double.parseDouble(scan.nextLine());
        double quantityCover = Double.parseDouble(scan.nextLine());
        double pigWeight = Double.parseDouble(scan.nextLine());


        for (int i = 1; i <= 30 ; i++) {
            quantityFood -= 0.3;
            if (i % 2 == 0) {
                quantityHay -= quantityFood * 0.05;
            }
            if (i % 3 == 0) {
                quantityCover -= pigWeight / 3.00;
            }
        }

        if (quantityFood > 0.001 && quantityCover > 0.001 && quantityHay > 0.001) {
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.", quantityFood, quantityHay, quantityCover);
        } else {
            System.out.println("Merry must go to the pet store!");
        }
    }
}
