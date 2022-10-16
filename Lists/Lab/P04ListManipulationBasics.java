package Lists.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbersList = Arrays
                .stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String inputLine = scan.nextLine();

        while (!inputLine.equals("end")) {
            String[] inputArr = inputLine.split(" ");
            switch (inputArr[0]) {
                case "Add":
                    int numberToAdd = Integer.parseInt(inputArr[1]);
                    numbersList.add(numberToAdd);
                    break;
                case "Remove":
                    int numberToRemove = Integer.parseInt(inputArr[1]);
                    // Взима се стойността на числото и се превръща в обект,
                    // за да се прочете като елемент, а не като индекс.
                    numbersList.remove(Integer.valueOf(numberToRemove));
                    break;
                case "RemoveAt":
                    int removeIndex = Integer.parseInt(inputArr[1]);
                    numbersList.remove(removeIndex);
                    break;
                case "Insert":
                    int numberToInsert = Integer.parseInt(inputArr[1]);
                    int insertIndex = Integer.parseInt(inputArr[2]);
                    numbersList.add(insertIndex, numberToInsert);
                    break;
            }
            inputLine = scan.nextLine();
        }

        System.out.println(numbersList.toString().replaceAll("[\\[\\],]", ""));
    }
}
