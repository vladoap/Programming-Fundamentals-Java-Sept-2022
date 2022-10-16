package Arrays.MoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P01EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberStrings = Integer.parseInt(scan.nextLine());

        int[] numbers = new int[numberStrings];
        for (int i = 1; i <= numberStrings ; i++) {
            String input = scan.nextLine();
            String[] inputArr = input.split("");
            int currentSum = 0;
            for (String item : inputArr) {
                int currentNumber = (int) item.charAt(0);
                switch (item) {
                    case "A":
                    case "a":
                    case "E":
                    case "e":
                    case "I":
                    case "i":
                    case "O":
                    case "o":
                    case "U":
                    case "u":
                        currentNumber = currentNumber * input.length();
                        break;
                    default :
                        currentNumber = currentNumber / input.length();
                        break;

                }
                currentSum += currentNumber;

            }
            numbers[i - 1] = currentSum;
        }
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }
}
