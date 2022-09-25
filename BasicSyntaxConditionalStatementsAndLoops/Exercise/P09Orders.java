package BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class P09Orders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int countOrders = Integer.parseInt(scan.nextLine());
  double totalPrice = 0;

        for (int i = 1; i <= countOrders; i++) {
            double priceCapsule = Double.parseDouble(scan.nextLine());
            int days = Integer.parseInt(scan.nextLine());
            int capsulesCount = Integer.parseInt(scan.nextLine());
            double currentOrderPrice = priceCapsule * days * capsulesCount;
            totalPrice += currentOrderPrice;
            System.out.printf("The price for the coffee is: $%.2f%n", currentOrderPrice);

        }

        System.out.printf("Total: $%.2f", totalPrice);
    }
}
