package Methods.MoreExercise;

import java.util.Scanner;

public class P05MultiplicationSign {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        int num3 = Integer.parseInt(scan.nextLine());
        printTypeOfNumber(num1, num2, num3);

    }
    public static void printTypeOfNumber(int n1, int n2, int n3) {
        if (n1 == 0 || n2 == 0 || n3 == 0) {
            System.out.println("zero");
        } else if (n1 < 0 && n2 > 0 && n3 > 0) {
            System.out.println("negative");
        } else if (n2 < 0 && n3 > 0 && n1 > 0) {
            System.out.println("negative");
        } else if (n3 < 0 && n1 > 0 && n2 > 0) {
            System.out.println("negative");
        } else if (n3 < 0 && n2 < 0 && n3 < 0) {
            System.out.println("negative");
        } else {
            System.out.println("positive");
        }
    }
}
