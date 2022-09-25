package BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class P06StrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());
        int startNumber = num;
        int fact = 1;
        int factSum = 0;

        while (num > 0) {
            fact = 1;
            int currentDigit = num % 10;
            for (int i = 1; i <= currentDigit; i++) {
                fact = fact * i;
            }
            factSum += fact;
            num = num / 10;
        }
        if (factSum == startNumber) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
