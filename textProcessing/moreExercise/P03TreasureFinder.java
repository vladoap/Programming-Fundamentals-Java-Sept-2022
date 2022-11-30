package textProcessing.moreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P03TreasureFinder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] keyArr = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String lineInput = scan.nextLine();
        while (!lineInput.equals("find")) {
            StringBuilder currentTextDecrypt = new StringBuilder();
            int pos = 0;
            for (char symbol : lineInput.toCharArray()) {
                if (pos == keyArr.length) {
                    pos = 0;
                }

                currentTextDecrypt.append((char) (symbol - keyArr[pos]));
                pos++;

            }

           int startIndexOfType = currentTextDecrypt.indexOf("&") + 1;
           int endIndexOfType = currentTextDecrypt.lastIndexOf("&");
           String type = currentTextDecrypt.substring(startIndexOfType, endIndexOfType);
            int startIndexOfCoordinates = currentTextDecrypt.indexOf("<") + 1;
            int endIndexOfCoordinates = currentTextDecrypt.indexOf(">");
            String coordinates = currentTextDecrypt.substring(startIndexOfCoordinates, endIndexOfCoordinates);

            System.out.printf("Found %s at %s%n", type, coordinates);


            lineInput = scan.nextLine();
        }
    }
}
