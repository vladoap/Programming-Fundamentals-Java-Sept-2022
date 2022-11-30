
// Задача с Lists - проверява въведени индекс в друг лист дали елементите са еднакви и ги изтрива.
// Брои движения и операции
//


package OldExams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03MemoryGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> sequenceElements = Arrays
                .stream(scan.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        String input = scan.nextLine();
        int countMoves = 0;
        while (!input.equals("end")) {
            List<Integer> indexList = Arrays
                    .stream(input.split("\\s+"))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
            int index1 = indexList.get(0);
            int index2 = indexList.get(1);

            if ((indexList.get(0) == indexList.get(1)) || (indexList.get(0) < 0 || indexList.get(0) >= sequenceElements.size())
            || (indexList.get(1) < 0 || indexList.get(1) >= sequenceElements.size())) {
                countMoves += 1;
                System.out.println("Invalid input! Adding additional elements to the board");
                int middleIndex = sequenceElements.size() / 2;
                String elementAdd = "-" + countMoves + "a";
                sequenceElements.add(middleIndex, elementAdd);
                sequenceElements.add(middleIndex, elementAdd);
            } else if (sequenceElements.get(index1).equals(sequenceElements.get(index2))){
                System.out.printf("Congrats! You have found matching elements - %s!%n", sequenceElements.get(index1));
                String currSymbol = sequenceElements.get(index1);
                sequenceElements.removeAll(Arrays.asList(currSymbol));
              //  sequenceElements.remove(index2);
                countMoves += 1;
            } else if (!sequenceElements.get(index1).equals(sequenceElements.get(index2))) {
                System.out.println("Try again!");
                countMoves += 1;
            }
            if (sequenceElements.isEmpty()) {
                System.out.printf("You have won in %d turns!%n", countMoves);
                break;
            }


            input = scan.nextLine();
        }
        if (!sequenceElements.isEmpty()) {
            System.out.println("Sorry you lose :(");
            for (String item : sequenceElements) {
                System.out.print(item + " ");
            }
        }
    }
}
