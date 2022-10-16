package Methods.Lab;

import java.util.Scanner;

public class P05Orders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String product = scan.nextLine();
        int quantity = Integer.parseInt(scan.nextLine());

        totalPrice(product, quantity);
    }
    public static void totalPrice(String product, int quantity) {
        switch (product) {
            case "coffee":
                System.out.printf("%.2f", quantity * 1.50);
                break;
            case "water":
                System.out.printf("%.2f",quantity * 1.00);
                break;
            case "coke":
                System.out.printf("%.2f",quantity * 1.40);
                break;
            case "snacks":
                System.out.printf("%.2f",quantity * 2.00);
                break;
        }
    }
}
