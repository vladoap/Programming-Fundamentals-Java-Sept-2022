package Lists.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02GaussTrick {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbersList = Arrays
                .stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        for (int i = 0; i < numbersList.size() - 1; i++) {
            int firstNum = numbersList.get(i);
            int lastNum = numbersList.get(numbersList.size() - 1);
            numbersList.set(i, firstNum + lastNum);
            numbersList.remove(numbersList.size() - 1);
        }

        System.out.println(numbersList.toString().replaceAll("[\\[\\],]", ""));
    }
}
