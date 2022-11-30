// обхождане по индекс на елементи в List и записване на стойност и прескачане
// при последвало обхождане.


package OldExams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P06ShootForTheWin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String inputLine = scan.nextLine();
        int countShotTargets = 0;
        while (!inputLine.equals("End")) {
            int index = Integer.parseInt(inputLine);
            int currentNumber = Integer.MIN_VALUE;
            boolean isValid = false;
            if (index >= 0 && index < numbers.size()) {
                if (numbers.get(index) != -1) {
                    isValid = true;
                }
            }
            if (!isValid) {
                inputLine = scan.nextLine();
                continue;
            } else {
                currentNumber = numbers.get(index);
                numbers.set(index, - 1);
                countShotTargets++;
                for (int i = 0; i < numbers.size(); i++) {
                    int currNum = numbers.get(i);
                    if (currNum != - 1) {
                        if (currNum > currentNumber) {
                            numbers.set(i, currNum - currentNumber);
                        } else {
                            numbers.set(i, currNum + currentNumber);
                        }
                    }
                }
            }
            inputLine = scan.nextLine();
        }
        System.out.printf("Shot targets: %d -> ", countShotTargets);
        for (int item : numbers) {
            System.out.print(item + " ");
        }

    }
}
