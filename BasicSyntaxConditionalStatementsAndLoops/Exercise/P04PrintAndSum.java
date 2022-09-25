package BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class P04PrintAndSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int startNumber = Integer.parseInt(scan.nextLine());
        int endNumber = Integer.parseInt(scan.nextLine());

        int sumNumbers = 0;
        for (int i = startNumber; i <= endNumber; i++) {
            System.out.print(i + " ");
            sumNumbers += i;
        }
        System.out.println();
        System.out.println("Sum: " + sumNumbers);
    }
}
