package Lists.Lab;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P07RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbersList = Arrays
                .stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        // 1. Обхождаме всички елемтни и ако е < 0 числото го премахваме
        numbersList.removeIf(e -> e < 0);

        // 1. Сортираме с объртнат ред
        Collections.reverse(numbersList);

        if (numbersList.isEmpty()) {
            System.out.println("empty");
        } else {
            System.out.println(numbersList.toString().replaceAll("[\\[\\],]", ""));
        }
        }

    }

