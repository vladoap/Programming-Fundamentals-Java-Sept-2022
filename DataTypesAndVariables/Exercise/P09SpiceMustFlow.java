package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P09SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int startingYield = Integer.parseInt(scan.nextLine());
        int currentYield = startingYield;
        int totalSpices = 0;
        int days = 0;

        while (currentYield >= 100) {
            totalSpices = totalSpices + (currentYield - 26);
            currentYield -= 10;
            days++;

        }
        if (totalSpices >= 26) {
            totalSpices -= 26;
        }

        System.out.println(days);
        System.out.println(totalSpices);

    }
}
