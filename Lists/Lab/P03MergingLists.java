package Lists.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03MergingLists {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbersList1 = Arrays
                .stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> numbersList2 = Arrays
                .stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        // 1. Установяване каква е дължината на най-малкия лист
        // 2. Интерираме по-малкия лист и добавяне към резултантния лист текущото число на първия
        // и текущото число на втория лист
        // 3. Добавяне на остатъка от по-големия лист към резултантния
        List<Integer> resultList = new ArrayList<>();
        int minSize = Math.min(numbersList1.size(), numbersList2.size());

        for (int i = 0; i < minSize; i++) {
            resultList.add(numbersList1.get(i));
            resultList.add(numbersList2.get(i));
        }
       if (numbersList1.size() > numbersList2.size()) {
           resultList.addAll(numbersList1.subList(minSize, numbersList1.size()));
       } else {
           resultList.addAll(numbersList2.subList(minSize, numbersList2.size()));
       }

       for (int item : resultList) {
           System.out.print(item + " ");
       }
    }
}
