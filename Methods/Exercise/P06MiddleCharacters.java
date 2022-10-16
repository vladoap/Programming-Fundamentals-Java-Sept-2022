package Methods.Exercise;

import java.util.Scanner;

public class P06MiddleCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        printMiddleChar(input);

    }
    public static void printMiddleChar(String input) {
        char middleChar1 = ' ';
        char middleChar2 = ' ';
        if (input.length() % 2 == 0) {
            middleChar1 = input.charAt(input.length() / 2 - 1);
            middleChar2 = input.charAt(input.length() / 2);
            System.out.print(middleChar1);
            System.out.print(middleChar2);
        } else {
            middleChar1 = input.charAt(input.length() / 2);
            System.out.println(middleChar1);
        }

    }

}
