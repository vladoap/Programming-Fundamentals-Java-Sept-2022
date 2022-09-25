package DataTypesAndVariables.MoreExercise;

import java.util.Scanner;

public class P03FloatingEquality {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double num1 = Double.parseDouble(scan.nextLine());
        double num2 = Double.parseDouble(scan.nextLine());

        if (Math.abs(num1 - num2) < 0.000001 ) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
