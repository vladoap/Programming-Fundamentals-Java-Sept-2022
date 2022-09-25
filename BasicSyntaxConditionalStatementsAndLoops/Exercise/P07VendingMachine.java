package BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class P07VendingMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        double sumMoney = 0;

        while (!input.equals("Start")) {
            double enteredCoin = Double.parseDouble(input);
            if (enteredCoin == 2) {
                sumMoney += 2.00;
            } else if (enteredCoin == 1) {
                sumMoney += 1.00;
            } else if (enteredCoin == 0.5) {
                sumMoney += 0.50;
            } else if (enteredCoin == 0.2) {
                sumMoney += 0.20;
            } else if (enteredCoin == 0.1) {
                sumMoney += 0.10;
            } else {
                System.out.printf("Cannot accept %.2f%n", enteredCoin);
            }
            input = scan.nextLine();
        }

        double totalMoneyEntered = sumMoney;
        input = scan.nextLine();

        while (!input.equals("End")) {
            String enteredProduct = input;

            switch (enteredProduct) {
                case "Nuts":
                    if (sumMoney >= 2.0) {
                        System.out.println("Purchased Nuts");
                        sumMoney -= 2.0;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    if (sumMoney >= 0.70) {
                        System.out.println("Purchased Water");
                        sumMoney -= 0.70;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    if (sumMoney >= 1.50) {
                        System.out.println("Purchased Crisps");
                        sumMoney -= 1.50;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    if (sumMoney >= 0.80) {
                        System.out.println("Purchased Soda");
                        sumMoney -= 0.80;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    if (sumMoney >= 1.0) {
                        System.out.println("Purchased Coke");
                        sumMoney -= 1.0;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }

            input = scan.nextLine();

        }
        if (input.equals("End")) {
            System.out.printf("Change: %.2f", sumMoney);
        }


    }
}
