package Arrays.Exercise;

import java.util.Scanner;

public class P10TreasureHunt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String initialTreasureChest = scan.nextLine();
        String[] initialTreasureChestArr = initialTreasureChest.split("\\|");

        String input = scan.nextLine();

        while (!input.equals("Yohoho!")) {
            String[] inputArr = input.split(" ");

            if (input.contains("Loot")) {
                for (int i = 1; i < inputArr.length ; i++) {
                    boolean currentElementExists = false;
                    for (int j = 0; j < initialTreasureChestArr.length; j++) {
                        if (inputArr[i].equals(initialTreasureChestArr[j])) {
                            currentElementExists = true;
                            break;
                        } else {
                            currentElementExists = false;
                        }
                    }
                    if (!currentElementExists) {
                        String[] arrayAfterAddElement = new String[initialTreasureChestArr.length + 1];
                        arrayAfterAddElement[0] = inputArr[i];
                        for (int k = 1; k < arrayAfterAddElement.length ; k++) {
                            arrayAfterAddElement[k] = initialTreasureChestArr[k - 1];
                        }
                        initialTreasureChestArr = arrayAfterAddElement;
                    }
                    }
            } else if (input.contains("Drop")){
                int dropIndex = Integer.parseInt(inputArr[1]);
                if (dropIndex >= 0 && dropIndex <= initialTreasureChestArr.length - 1) {
                    String dropElement = initialTreasureChestArr[dropIndex];
                    for (int i = dropIndex + 1; i < initialTreasureChestArr.length ; i++) {
                        initialTreasureChestArr[i - 1] = initialTreasureChestArr[i];
                    }
                    initialTreasureChestArr[initialTreasureChestArr.length - 1] = dropElement;
                }
            } else if (input.contains("Steal")) {
                int stealCount = Integer.parseInt(inputArr[1]);
                if (stealCount >= 0 && stealCount <= initialTreasureChestArr.length - 1) {
                    String[] arrayAfterStealElements = new String[initialTreasureChestArr.length - stealCount];
                    for (int i = 0; i < arrayAfterStealElements.length; i++) {
                        arrayAfterStealElements[i] = initialTreasureChestArr[i];
                    }
                    for (int i = initialTreasureChestArr.length - stealCount; i <= initialTreasureChestArr.length - 1; i++) {
                        if (i == initialTreasureChestArr.length - 1) {
                            System.out.print(initialTreasureChestArr[i]);
                        } else {
                            System.out.print(initialTreasureChestArr[i] + ", ");
                        }
                    }
                    initialTreasureChestArr = arrayAfterStealElements;

                } else if (stealCount >= 0) {
                    for (int i = 0; i < initialTreasureChestArr.length; i++) {
                        System.out.print(initialTreasureChestArr[i]);
                        if (i != initialTreasureChestArr.length - 1) {
                            System.out.print(", ");
                        }
                    }
                    initialTreasureChestArr = new String[0];
                }
                System.out.println();
            }
            input = scan.nextLine();
        }
        int numberElements = initialTreasureChestArr.length;
        String result = String.join("", initialTreasureChestArr);
        double lengthString = result.length();
        double averageTreasureGain = lengthString / numberElements;

        if (numberElements > 0) {
            System.out.printf("Average treasure gain: %.2f pirate credits.", averageTreasureGain);
        } else {
            System.out.printf("Failed treasure hunt.");
        }
        System.out.println();

    }
}
