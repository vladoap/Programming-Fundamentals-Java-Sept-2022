package Lists.MoreExercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01Messaging {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbersList = Arrays
                .stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String text = scan.nextLine();
        StringBuilder sb = new StringBuilder(text);
        // създава се обект StringBuilder, на който се присвоява Sring. По този начин може да се използват методи и функционалности за изтриване на deleteCharAt

        int textLength = sb.length();
        String result = "";


        for (int i = 0; i < numbersList. size() ; i++) {
            int sumDigits = 0;
            int currentNumber = numbersList.get(i);
            while (currentNumber != 0) {
                int currentDigit = currentNumber % 10;
                sumDigits += currentDigit;
                currentNumber = currentNumber / 10;
            }

            while (sumDigits > textLength - 1) {
                sumDigits -= textLength;
            }

            char currentSymbol = sb.charAt(sumDigits);
            result += currentSymbol;
            sb = sb.deleteCharAt(sumDigits);



        }

        System.out.println(result);
    }
}
