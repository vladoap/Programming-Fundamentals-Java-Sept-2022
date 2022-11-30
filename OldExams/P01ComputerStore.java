package OldExams;

import java.util.Scanner;

public class P01ComputerStore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        double sum = 0;
        while (!input.equals("special") && !input.equals("regular")) {
            double partPrice = Double.parseDouble(input);
            if (partPrice < 0) {
                System.out.println("Invalid price!");
            } else {
                sum += partPrice;
            }


            input = scan.nextLine();
        }
        if (sum == 0) {
            System.out.println("Invalid order!");
        } else {
            double taxes = sum * 0.2;
            double totalPrice = sum + taxes;
            if (input.equals("special")) {
                totalPrice = totalPrice * 0.9;
            }
            System.out.printf("Congratulations you've just bought a new computer!\n" +
                    "Price without taxes: %.2f$\n" +
                    "Taxes: %.2f$\n" +
                    "-----------\n" +
                    "Total price: %.2f$\n"
            , sum, taxes, totalPrice);
        }
    }
}
