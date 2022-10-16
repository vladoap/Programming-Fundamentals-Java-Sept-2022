package Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbersList = Arrays
                .stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String inputLine = scan.nextLine();

        while (!inputLine.equals("End")) {
            if (inputLine.contains("Add")) {
                int addNumber = Integer.parseInt(inputLine.split("\\s+")[1]);
                numbersList.add(addNumber);
            } else if (inputLine.contains("Remove")) {
                int removeIndex = Integer.parseInt(inputLine.split("\\s+")[1]);
                if (removeIndex >= 0 && removeIndex < numbersList.size()) {
                    numbersList.remove(removeIndex);
                } else {
                    System.out.println("Invalid index");
                }

            } else if (inputLine.contains("Shift")) {
               shiftList(numbersList, inputLine);
            } else if (inputLine.contains("Insert")) {
                int insertIndex = Integer.parseInt(inputLine.split("\\s+")[2]);
                int insertNumber = Integer.parseInt(inputLine.split("\\s+")[1]);
                if (insertIndex >= 0 && insertIndex < numbersList.size()) {
                    numbersList.add(insertIndex, insertNumber);
                } else {
                    System.out.println("Invalid index");
                }
            }
            inputLine = scan.nextLine();
        }
        System.out.println(numbersList.toString().replaceAll("[\\[\\],]", ""));
    }

    public static List<Integer> shiftList(List<Integer> numList, String input) {
        int countShiftTimes = Integer.parseInt(input.split(" ")[2]);
        if (input.contains("left")) {
            for (int i = 1; i <= countShiftTimes; i++) {
                int firstNumber = numList.get(0);
                numList.remove(0);
                numList.add(firstNumber);
            }
        } else if (input.contains("right")) {
            for (int i = 1; i <= countShiftTimes; i++) {
                int lastNumber = numList.get(numList.size() - 1);
                numList.remove(numList.size() - 1);
                numList.add(0, lastNumber);
            }
        }
        return numList;

    }
    }

