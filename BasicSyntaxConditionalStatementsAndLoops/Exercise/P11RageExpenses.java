package BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class P11RageExpenses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int countLostGames = Integer.parseInt(scan.nextLine());
        double priceHeadset = Double.parseDouble(scan.nextLine());
        double priceMouse = Double.parseDouble(scan.nextLine());
        double priceKeyboard = Double.parseDouble(scan.nextLine());
        double priceDisplay = Double.parseDouble(scan.nextLine());

        int numberHeadset = countLostGames / 2;
        int numberMouse = countLostGames / 3;
        int numberKeyboard = countLostGames / 6;
        int numberDisplay = countLostGames / 12;

        double totalSum = numberHeadset * priceHeadset
                + numberDisplay * priceDisplay
                + numberKeyboard * priceKeyboard
                + numberMouse * priceMouse;

        System.out.printf("Rage expenses: %.2f lv.", totalSum);
    }
}
