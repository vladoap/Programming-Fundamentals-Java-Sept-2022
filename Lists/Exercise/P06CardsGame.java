package Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P06CardsGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> playerOneList = Arrays
                .stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> playerTwoList = Arrays
                .stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        while (!playerTwoList.isEmpty() && !playerOneList.isEmpty()) {

            if (playerOneList.get(0) > playerTwoList.get(0)) {
                playerOneList.add(Integer.valueOf(playerOneList.get(0)));
                playerOneList.add(Integer.valueOf(playerTwoList.get(0)));
                playerOneList.remove(0);
                playerTwoList.remove(0);
            } else if (playerTwoList.get(0) > playerOneList.get(0)) {
                playerTwoList.add(Integer.valueOf(playerTwoList.get(0)));
                playerTwoList.add(Integer.valueOf(playerOneList.get(0)));
                playerOneList.remove(0);
                playerTwoList.remove(0);
            } else {
                playerOneList.remove(0);
                playerTwoList.remove(0);
            }

            }

        int sum = 0;
        if (playerOneList.isEmpty()) {
            for (int item : playerTwoList) {
                sum += item;
            }
            System.out.printf("Second player wins! Sum: %d", sum);
        } else if (playerTwoList.isEmpty()) {
            for (int item : playerOneList) {
                sum += item;

            }
            System.out.printf("First player wins! Sum: %d", sum);
        }

        }
        // проверявам коя карта е по-голяма ---> този който печели получава 2-те карти
        // която печели се слага предпоследна ,а загубилата последна
        // изтриване на картата от загубелия
        // ако е равеноство - се изтрива картата и при двамата
    }
