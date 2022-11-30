// List с swap/multiply/decrease numbers
// принтиране на Integer array --> преобразуване в String и заместване на излишни символи с ""


package Lists.MoreExercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ArrayModifier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String inputLine = scan.nextLine();

        while (!inputLine.equals("end")) {
            if (inputLine.contains("swap")) {
                swapIndex(numbers, inputLine);
            } else if (inputLine.contains("multiply")) {
                multiplyIndex(numbers, inputLine);
            } else if (inputLine.contains("decrease")) {
                decreaseElements(numbers);
            }

            inputLine = scan.nextLine();
        }

        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }

    public static List<Integer> swapIndex (List<Integer> numbers, String input) {
        int index1 = Integer.parseInt(input.split(" ")[1]);
        int index2 = Integer.parseInt(input.split(" ")[2]);
        Collections.swap(numbers, index1, index2);

        return numbers;
    }

    public static List<Integer> multiplyIndex (List<Integer> numbers, String input) {
        int index1 = Integer.parseInt(input.split(" ")[1]);
        int index2 = Integer.parseInt(input.split(" ")[2]);
        int multiplySum = numbers.get(index1) * numbers.get(index2);
        numbers.set(index1, multiplySum);

        return numbers;
    }

    public static List<Integer> decreaseElements (List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            int currentNumber = numbers.get(i);
            numbers.set(i, currentNumber - 1);
        }

        return numbers;
    }
}
