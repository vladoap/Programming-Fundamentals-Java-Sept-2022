package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P07MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
           String longestSequence = "";
        for (int i = 0; i < numbers.length; i++) {
            String currentSequence = "";
            currentSequence += numbers[i] + " ";
            for (int j = i + 1; j < numbers.length ; j++) {

                if (numbers[i] == numbers[j]) {
                    currentSequence += numbers[j] + " ";
                } else {
                    break;
                }
                }
            if (currentSequence.length() > longestSequence.length()) {
                longestSequence = currentSequence;
            }
            }
        System.out.println(longestSequence);
        }
    }

