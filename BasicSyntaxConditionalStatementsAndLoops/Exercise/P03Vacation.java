package BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberPeople = Integer.parseInt(scan.nextLine());
        String groupType = scan.nextLine();
        String dayOfWeek = scan.nextLine();

        double totalPrice = 0;
        switch (groupType) {
            case "Students":
                switch (dayOfWeek) {
                    case "Friday":
                        totalPrice = numberPeople * 8.45;
                        break;
                    case "Saturday":
                        totalPrice = numberPeople * 9.80;
                        break;
                    case "Sunday":
                        totalPrice = numberPeople * 10.46;
                        break;
                    }
                    if (numberPeople >= 30) {
                        totalPrice = totalPrice * 0.85;
                    }
                break;
            case "Business":
                if (numberPeople >= 100) {
                    numberPeople -= 10;
                }
                switch (dayOfWeek) {
                    case "Friday":
                        totalPrice = numberPeople * 10.90;
                        break;
                    case "Saturday":
                        totalPrice = numberPeople * 15.60;
                        break;
                    case "Sunday":
                        totalPrice = numberPeople * 16.00;
                        break;
                }

                break;
            case "Regular":
                switch (dayOfWeek) {
                    case "Friday":
                        totalPrice = numberPeople * 15.00;
                        break;
                    case "Saturday":
                        totalPrice = numberPeople * 20.00;
                        break;
                    case "Sunday":
                        totalPrice = numberPeople * 22.50;
                        break;
                }
                if (numberPeople >= 10 && numberPeople <= 20) {
                totalPrice = totalPrice * 0.95;
            }
                break;


        }

        System.out.printf("Total price: %.2f", totalPrice);
        }
    }

