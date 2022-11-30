package textProcessing.exercise;

import java.util.Scanner;

public class P04CaesarCipher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String lineInput = scan.nextLine();
        StringBuilder resultText = new StringBuilder();
        for (char symbol : lineInput.toCharArray()) {
            char newSymbol = (char) (symbol + 3);
            resultText.append(newSymbol);
        }
        System.out.println(resultText);
    }
}
