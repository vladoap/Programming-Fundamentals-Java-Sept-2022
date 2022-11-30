package OldExams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05HeartDelivery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> neighbourhood = Arrays
                .stream(scan.nextLine().split("@"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String lineInput = scan.nextLine();
        int currentPosition = 0;
        while (!lineInput.equals("Love!")) {
            int jumpLength = Integer.parseInt(lineInput.split(" ")[1]);
            int currentNumber = 0;
            if (currentPosition + jumpLength < neighbourhood.size()) {
                 currentPosition += jumpLength;
            } else {
                currentPosition = 0;
            }
            currentNumber = neighbourhood.get(currentPosition);
            if (currentNumber == 2) {
                neighbourhood.set(currentPosition, currentNumber - 2);
                System.out.printf("Place %d has Valentine's day.%n", currentPosition);
            } else if (currentNumber == 0) {
                System.out.printf("Place %d already had Valentine's day.%n", currentPosition);
            } else {
                neighbourhood.set(currentPosition, currentNumber - 2);
            }

            lineInput = scan.nextLine();
        }
        int countFailed = 0;
        for (int item : neighbourhood) {
            if (item > 0) {
                countFailed++;
            }
        }
        System.out.printf("Cupid's last position was %d.%n", currentPosition);
        if (countFailed == 0) {
            System.out.println("Mission was successful.");
        } else {
            System.out.printf("Cupid has failed %d places.%n", countFailed);
        }



    }
}
