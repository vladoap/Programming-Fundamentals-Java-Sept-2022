// Задача с Lists - 2 вложени for цикъла - запълва елементи в List последователно от ляво на дясно ( брой е въведен от конзолата)
// когато се запълнят елементтие =4 всеки от тях принтира
// 2 булеви променливи -
// isQueue - налични хора чакащи
// isFreeSpot - налично свободн място в асансьора



package OldExams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02TheLift {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        int numberPeopleWaiting = Integer.parseInt(scan.nextLine());

        List<Integer> currentStateLift = Arrays
                .stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
       boolean isQueue = true;
        for (int i = 0; i < currentStateLift.size(); i++) {

            for (int j = currentStateLift.get(i); j < 4 ; j++) {
                if (numberPeopleWaiting > 0) {
                    numberPeopleWaiting--;
                    currentStateLift.set(i, currentStateLift.get(i) + 1);
                } else {
                    isQueue = false;
                    break;
                }
            }
            if (!isQueue) {
                break;
            }
        }
        if (numberPeopleWaiting == 0) {
            isQueue = false;
        }
         boolean isFreeSpots = false;
        for (int item : currentStateLift) {
            if (item < 4) {
                isFreeSpots = true;
            }
        }
        if (isFreeSpots && !isQueue) {
            System.out.println("The lift has empty spots!");
            for (int item : currentStateLift) {
                System.out.print(item + " ");
            }
        } else if (!isFreeSpots && numberPeopleWaiting > 0) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", numberPeopleWaiting);
            for (int item : currentStateLift) {
                System.out.print(item + " ");
            }
        } else if (!isFreeSpots && !isQueue) {
            for (int item : currentStateLift) {
                System.out.print(item + " ");
            }
        }

    }
}
