package BasicSyntaxConditionalStatementsAndLoops.MoreExercise;

import java.util.Scanner;

public class R03GamingStore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double balance = Double.parseDouble(scan.nextLine());
        double initialMoney = balance;

        String input = scan.nextLine();
        while (!input.equals("Game Time")) {
            switch (input) {
                case "OutFall 4":
                    if (balance >= 39.99) {
                        balance -= 39.99;
                        System.out.println("Bought OutFall 4");
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "CS: OG":
                    if (balance >= 15.99) {
                        balance -= 15.99;
                        System.out.println("Bought CS: OG");
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "Zplinter Zell":
                    if (balance >= 19.99) {
                        balance -= 19.99;
                        System.out.println("Bought Zplinter Zell");
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "Honored 2":
                    if (balance >= 59.99) {
                        balance -= 59.99;
                        System.out.println("Bought Honored 2");
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "RoverWatch":
                    if (balance >= 29.99) {
                        balance -= 29.99;
                        System.out.println("Bought RoverWatch");
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "RoverWatch Origins Edition":
                    if (balance >= 39.99) {
                        balance -= 39.99;
                        System.out.println("Bought RoverWatch Origins Edition");
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                default:
                    System.out.println("Not Found");
                    break;
            }
            if (balance ==0) {
                System.out.println("Out of money!");
                break;
            }
            input = scan.nextLine();
        }
        if (input.equals("Game Time")) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", initialMoney - balance, balance );
        }
    }
}
