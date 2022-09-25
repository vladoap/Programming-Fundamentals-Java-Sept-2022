package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P04SumOfChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numChars = Integer.parseInt(scan.nextLine());
        int sumASCII = 0;
        for (int i = 1; i <= numChars ; i++) {
            char symbol = scan.nextLine().charAt(0);
            int code = (int) symbol;
            sumASCII += code;
        }

        System.out.printf("The sum equals: %d", sumASCII);
    }
}
