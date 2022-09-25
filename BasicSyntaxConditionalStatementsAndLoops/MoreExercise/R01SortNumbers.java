package BasicSyntaxConditionalStatementsAndLoops.MoreExercise;

import java.util.Scanner;

public class R01SortNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        int num3 = Integer.parseInt(scan.nextLine());

        int maxNumber = Math.max(num1, Math.max(num2,num3));
        int minNumber = Math.min(num1, Math.min(num2,num3));

        System.out.println(maxNumber);

        if (num1 == maxNumber && num2 == minNumber) {
            System.out.println(num3);
        } else if (num2 == maxNumber && num1 == minNumber) {
            System.out.println(num3);
        } else if (num2 == maxNumber && num3 == minNumber) {
            System.out.println(num1);
        } else if (num3 == maxNumber && num2 == minNumber) {
            System.out.println(num1);
        } else if (num1 == maxNumber && num3 == minNumber) {
            System.out.println(num2);
        } else if (num3 == maxNumber && num1 == minNumber) {
            System.out.println(num2);
        }

        System.out.println(minNumber);




    }
}
