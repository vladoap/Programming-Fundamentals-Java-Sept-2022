package Lists.MoreExercise;

import java.util.*;
import java.util.stream.Collectors;

public class P04MixedUpLists {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbersFirstList = Arrays
                .stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> numbersSecondList = Arrays
                .stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> resultList = new ArrayList<>();
        int[] rangeArr = new int[2];
        if (numbersFirstList.size() > numbersSecondList.size()) {
            rangeArr[0] = numbersFirstList.get(numbersFirstList.size() - 2);
            rangeArr[1] = numbersFirstList.get(numbersFirstList.size() - 1);
        } else if (numbersSecondList.size() > numbersFirstList.size()) {
            rangeArr[0] = numbersSecondList.get(0);
            rangeArr[1] = numbersSecondList.get(1);
        }
        Collections.reverse(numbersSecondList);
        int minSize = Math.min(numbersFirstList.size(), numbersSecondList.size());

        for (int i = 0; i < minSize; i++) {
            int firstElement = numbersFirstList.get(i);
            int secondElement = numbersSecondList.get(i);
            resultList.add(firstElement);
            resultList.add(secondElement);
        }
        int minNumber = 0;
        int maxNumber = 0;
        if (rangeArr[0] < rangeArr[1]) {
            minNumber = rangeArr[0];
            maxNumber = rangeArr[1];
        } else {
            minNumber = rangeArr[1];
            maxNumber = rangeArr[0];
        }
        for (int i = 0; i < resultList.size(); i++) {
            int currNumber = resultList.get(i);
            if ( currNumber <= minNumber || currNumber >= maxNumber) {
                resultList.remove(i);
                i = -1;  // Връща се от начало в цикъла и проверява на ново.
            }
        }

        Collections.sort(resultList);

        System.out.println(resultList.toString().replaceAll("[\\[\\],]", ""));
    }
}
