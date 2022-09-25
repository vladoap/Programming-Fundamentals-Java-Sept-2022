package BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class P01Ages {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = Integer.parseInt(scan.nextLine());

        if (age >= 66) {
            System.out.println("elder");
        } else if (age >= 20) {
            System.out.println("adult");
        }else if (age >= 14) {
            System.out.println("teenager");
        }else if (age >= 3) {
            System.out.println("child");
        } else if (age >= 0) {
            System.out.println("baby");
        }
    }
}
