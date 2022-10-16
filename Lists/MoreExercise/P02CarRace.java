package Lists.MoreExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02CarRace {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> timesCars = Arrays
                .stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int finishIndex = timesCars.size() / 2;

        double sumCar1 = 0;
        for (int i = 0; i < finishIndex; i++) {
            int currentTime = timesCars.get(i);
            if (currentTime == 0) {
                sumCar1 = sumCar1 * 0.8;
            } else {
                sumCar1 += currentTime;
            }
        }

        double sumCar2 = 0;
        for (int i = timesCars.size() - 1; i > finishIndex; i--) {
            int currentTime = timesCars.get(i);
            if (currentTime == 0) {
                sumCar2 = sumCar2 * 0.8;
            } else {
                sumCar2 += currentTime;
            }
        }

        if (sumCar1 < sumCar2) {
            System.out.printf("The winner is left with total time: %.1f", sumCar1);
        } else if (sumCar2 < sumCar1){
            System.out.printf("The winner is right with total time: %.1f", sumCar2);
        }

    }
}
