package Lists.Exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05BombNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbersList = Arrays
                .stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int[] specialNumberArr = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        while(numbersList.contains(specialNumberArr[0])) {
            for (int i = 0; i < numbersList.size(); i++) {
                if (numbersList.get(i) == specialNumberArr[0]) {
                    int offsetHigh = 0;
                    if (specialNumberArr[1] + i > numbersList.size()) {
                        offsetHigh = numbersList.size() - 1;
                    } else {
                        offsetHigh = i + specialNumberArr[1];
                    }
                    int offsetLow = 0;
                    if (i - specialNumberArr[1] < 0) {
                        offsetLow = 0;
                    } else {
                        offsetLow = i - specialNumberArr[1];
                    }
                    for (int j = offsetHigh; j > i ; j--) {
                        numbersList.remove(j);
                    }
                    numbersList.remove(i);
                    for (int j = i - 1; j >= offsetLow; j--) {
                        numbersList.remove(j);
                    }

                }
            }
        }
        int sum = 0;
        for (int item : numbersList) {
            sum += item;
        }
        System.out.println(sum);
        }
    }

