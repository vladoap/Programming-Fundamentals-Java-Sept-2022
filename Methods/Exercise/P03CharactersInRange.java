package Methods.Exercise;

import java.util.Scanner;

public class P03CharactersInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char char1 = scan.nextLine().charAt(0);
        char char2 = scan.nextLine().charAt(0);
        printChars(char1, char2);

    }

    public static void printChars(char ch1, char ch2) {
        if (ch1 < ch2) {
            for (char i = (char) (ch1 + 1); i < ch2; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (char i = (char) (ch2 + 1); i < ch1; i++) {
                System.out.print(i + " ");
            }
        }
    }
}
