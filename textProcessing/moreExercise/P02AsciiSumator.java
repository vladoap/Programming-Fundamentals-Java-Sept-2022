package textProcessing.moreExercise;

import java.util.Scanner;

public class P02AsciiSumator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char firstSymbol = scan.nextLine().charAt(0);
        char secondSymbol = scan.nextLine().charAt(0);
        String text = scan.nextLine();

        int sum = 0;
        for (char symbol : text.toCharArray()) {
            if (symbol > firstSymbol && symbol < secondSymbol) {
                sum += symbol;
            }
        }

        System.out.println(sum);

    }
}
