package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class P06CharsToString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char firstSymbol = scan.nextLine().charAt(0);
        char secondSymbol = scan.nextLine().charAt(0);
        char thirdSymbol = scan.nextLine().charAt(0);

        System.out.println(String.format("%c%c%c", firstSymbol,secondSymbol,thirdSymbol));
    }
}
