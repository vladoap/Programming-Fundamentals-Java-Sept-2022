package BasicSyntaxConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class Passed_or_Failed {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double grade = Double.parseDouble(scan.nextLine());

        if (grade >= 3.00) {
            System.out.printf("Passed!");
        } else {
            System.out.printf("Failed!");
        }

    }
}
